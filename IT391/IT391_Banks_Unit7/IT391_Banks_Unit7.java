import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IT391_Banks_Unit7 extends JFrame {

    private JPanel contentPane;
    private JTextField textMeanGrade;
    private JTextField textMaxGrade;
    private JTextField textMinGrade;

    private List<Float> gradeList;
    private String XMLURL = "http://localhost/StudentGrades.xml";

    public static void main(String[] args){
        EventQueue.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        try{
                            IT391_Banks_Unit7 frame = new IT391_Banks_Unit7();
                            frame.setTitle("IT391_Banks_Unit7");
                            frame.setVisible(true);
                        }
                        catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                }
        );
    }
    public IT391_Banks_Unit7(){

        CreateGUI();
        SetGradeList();
        CalculateStatistics();
    }
    public void CreateGUI(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 400, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitle = new JLabel("Grade Statistics");
        lblTitle.setBounds(200, 20, 120, 20);
        contentPane.add(lblTitle);

        JLabel lblName = new JLabel("Mean of Grades: ");
        lblName.setBounds(50, 72, 120, 20);
        contentPane.add(lblName);

        textMeanGrade = new JTextField();
        textMeanGrade.setBounds(200, 69, 100, 26);
        contentPane.add(textMeanGrade);
        textMeanGrade.setColumns(10);
        textMeanGrade.setEditable(false);
        textMeanGrade.setHorizontalAlignment(JTextField.CENTER);

        JLabel lblMax = new JLabel("Maximum Grade:");
        lblMax.setBounds(50, 142, 120, 20);
        contentPane.add(lblMax);

        textMaxGrade = new JTextField();
        textMaxGrade.setBounds(200, 139, 100, 26);
        contentPane.add(textMaxGrade);
        textMaxGrade.setColumns(10);
        textMaxGrade.setEditable(false);
        textMaxGrade.setHorizontalAlignment(JTextField.CENTER);

        JLabel lblMin = new JLabel("Minimum Grade:");
        lblMin.setBounds(50, 212, 120, 20);
        contentPane.add(lblMin);

        textMinGrade = new JTextField();
        textMinGrade.setBounds(200, 209, 100, 26);
        contentPane.add(textMinGrade);
        textMinGrade.setColumns(10);
        textMinGrade.setEditable(false);
        textMinGrade.setHorizontalAlignment(JTextField.CENTER);

        JButton btnClose = new JButton("CLOSE");
        btnClose.setBounds(130,275,100,29);

        btnClose.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dispose();
                    }
                }
        );
        contentPane.add(btnClose);

    }
    public void SetGradeList(){
        gradeList = new ArrayList<Float>();
        DocumentBuilderFactory dbf =DocumentBuilderFactory.newInstance();
        try{
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new URL(XMLURL).openStream());
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("grade");

            for (int i = 0; i < nodeList.getLength(); i++){
                Node nNode = nodeList.item(i);
                gradeList.add(Float.parseFloat(nNode.getTextContent()));

            }
        }
        catch (Exception e1){
            e1.printStackTrace();
        }
    }
    public void CalculateStatistics(){
        float sumResult = 0;
        float meanResult = 0;
        float maxResult = 0;
        float minResult = 0;

        for (float num:gradeList)
            sumResult += num;
        meanResult = Math.round(sumResult/(float)gradeList.size());
        maxResult = Math.round(Collections.max(gradeList));
        minResult = Math.round(Collections.min(gradeList));
        textMeanGrade.setText(String.valueOf(meanResult));
        textMaxGrade.setText(String.valueOf(maxResult));
        textMinGrade.setText(String.valueOf(minResult));

    }
}



