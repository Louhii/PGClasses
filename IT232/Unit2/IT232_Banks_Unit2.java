package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IT232_Banks_Unit2 {

	private JFrame frame;
	private JTextField textField;
	// double is used for larger values than float
	double first;
	double second;
	double result;
	String operation;
	String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IT232_Banks_Unit2 window = new IT232_Banks_Unit2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IT232_Banks_Unit2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 350, 375);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial Black", Font.BOLD, 15));
		textField.setBounds(10, 11, 310, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button1.getText();
				textField.setText(number);
			}
		});
		button1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		button1.setBounds(10, 80, 50, 50);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button2.getText();
				textField.setText(number);
			}
		});
		button2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		button2.setBounds(70, 80, 50, 50);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button3.getText();
				textField.setText(number);
			}
		});
		button3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		button3.setBounds(130, 80, 50, 50);
		frame.getContentPane().add(button3);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button4.getText();
				textField.setText(number);
			}
		});
		button4.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		button4.setBounds(10, 141, 50, 50);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button5.getText();
				textField.setText(number);
			}
		});
		button5.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		button5.setBounds(70, 141, 50, 50);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button6.getText();
				textField.setText(number);
			}
		});
		button6.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		button6.setBounds(130, 141, 50, 50);
		frame.getContentPane().add(button6);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button7.getText();
				textField.setText(number);
			}
		});
		button7.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		button7.setBounds(10, 202, 50, 50);
		frame.getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button8.getText();
				textField.setText(number);
			}
		});
		button8.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		button8.setBounds(70, 202, 50, 50);
		frame.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button9.getText();
				textField.setText(number);
			}
		});
		button9.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		button9.setBounds(130, 202, 50, 50);
		frame.getContentPane().add(button9);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button0.getText();
				textField.setText(number);
			}
		});
		button0.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		button0.setBounds(70, 263, 50, 50);
		frame.getContentPane().add(button0);
		
		JButton buttonBackspace = new JButton("B");
		buttonBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
							str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		buttonBackspace.setFont(new Font("Arial Black", Font.PLAIN, 11));
		buttonBackspace.setBounds(190, 80, 60, 50);
		frame.getContentPane().add(buttonBackspace);
		
		JButton buttonClear = new JButton("C");
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		buttonClear.setFont(new Font("Arial Black", Font.PLAIN, 11));
		buttonClear.setBounds(260, 80, 60, 50);
		frame.getContentPane().add(buttonClear);
		
		JButton buttonPlus = new JButton("+");
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		buttonPlus.setFont(new Font("Arial Black", Font.PLAIN, 11));
		buttonPlus.setBounds(190, 141, 60, 50);
		frame.getContentPane().add(buttonPlus);
		
		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		buttonMinus.setFont(new Font("Arial Black", Font.PLAIN, 11));
		buttonMinus.setBounds(260, 141, 60, 50);
		frame.getContentPane().add(buttonMinus);
		
		JButton buttonMultiply = new JButton("*");
		buttonMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		buttonMultiply.setFont(new Font("Arial Black", Font.PLAIN, 11));
		buttonMultiply.setBounds(190, 202, 60, 50);
		frame.getContentPane().add(buttonMultiply);
		
		JButton buttonDivide = new JButton("/");
		buttonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		buttonDivide.setFont(new Font("Arial Black", Font.PLAIN, 11));
		buttonDivide.setBounds(260, 202, 60, 50);
		frame.getContentPane().add(buttonDivide);
		
		JButton buttonDecimal = new JButton(".");
		buttonDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+buttonDecimal.getText();
				textField.setText(number);
			}
		});
		buttonDecimal.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		buttonDecimal.setBounds(130, 263, 50, 50);
		frame.getContentPane().add(buttonDecimal);
		
		JButton buttonEqual = new JButton("=");
		buttonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
						if(operation=="+")
						{
							result=first+second;
							answer=String.format("%.2f", result);
							textField.setText(answer);		
						}
						else if(operation=="-")
						{
							result=first-second;
							answer=String.format("%.2f", result);
									textField.setText(answer);		
						}
						else if(operation=="*")
						{
							result=first*second;
							answer=String.format("%.2f", result);
									textField.setText(answer);		
						}
						else if(operation=="/")
						{
							result=first/second;
							answer=String.format("%.2f", result);
									textField.setText(answer);		
						}
			}
		});
		buttonEqual.setFont(new Font("Arial Black", Font.PLAIN, 11));
		buttonEqual.setBounds(190, 263, 130, 50);
		frame.getContentPane().add(buttonEqual);
	}
}
