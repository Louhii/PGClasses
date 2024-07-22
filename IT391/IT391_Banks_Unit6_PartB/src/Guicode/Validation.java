package Guicode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Validation extends JFrame {

    private JTextField textFieldAge;
    private JTextField textFieldEmail;
    private JButton btnSubmit;
    private JButton btnClear;
    private JPanel mainPanel;
    private JLabel lblCongrats;

    public Validation(){
        setContentPane(mainPanel);
setTitle("Hello and welcome!");
setSize(500, 500);
setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
setVisible(true);

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    if ((Integer.parseInt(textFieldAge.getText()) > 18 ||
                            Integer.parseInt(textFieldAge.getText()) < 5)){
                        JOptionPane.showMessageDialog(null, "Age out of range");
                    } else if (!textFieldEmail.getText().contains("@")){
                        JOptionPane.showMessageDialog(null, "Email must contain an @ symbol");

                    }
                    else {
                        int age = Integer.parseInt(textFieldAge.getText());
                        String email = textFieldEmail.getText();
                        JOptionPane.showMessageDialog(null, "Congrats: your age is " + age + "and your email is " + email);

                        System.out.println("Success!");
                        System.out.println("Your age is: " + age);
                        System.out.println("Your email is: " + email);
                    }
                }catch (Exception e){
                    JOptionPane.showMessageDialog(textFieldAge, "Invalid Input" + '\n' + "Age and Email must be entered correctly");
                }
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldAge.setText("");
                textFieldEmail.setText("");
            }
        });
    }
    public static void main(String[] args){
        Validation myFrame = new Validation();
    }
}

