import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class GUI extends JFrame{
	private JPanel contentPane;
	private DB database;
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
			);
	}
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 525, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConnect = new JLabel("Connect");
		lblConnect.setBounds(14, 52, 57, 20);
		
		contentPane.add(lblConnect);
		JButton btnConnect = new JButton("Connect to Database");
		btnConnect.setBounds(117, 49, 387, 26);
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String dbURL = "jdbc:sqlserver://localhost\\SQLEXPRESS;"+
									"Trusted_Connection=true;"+
									"Database=northwind;"+
									"integratedSecurity=true;"+
									"User Instance=false;"+
									"trustServerCertificate=True;"+
									"Connection timeout=30";
					database = new DB(dbURL);
					JOptionPane.showMessageDialog(null, "You have successfully connected to the database!");
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null,  e.getMessage());
				}
			}
		});
		contentPane.add(btnConnect);
		
		JLabel lblCount = new JLabel("Count");
		lblCount.setBounds(14, 122, 57, 20);
		contentPane.add(lblCount);
		
		JButton btnCount = new JButton("Customer Count");
		btnCount.setBounds(117, 119, 387, 26);
		btnCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String returnedValue = database.getCustomerCount();
					JOptionPane.showMessageDialog(null, "The customer count is: " + returnedValue);
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		contentPane.add(btnCount);
		JLabel lblNames = new JLabel("Names");
		lblNames.setBounds(14, 192, 57, 20);
		contentPane.add(lblNames);
		
		JButton btnNames = new JButton("Get Company Names");
		btnNames.setBounds(117, 189, 387, 26);
		
		btnNames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String returnedValue = database.getCompanyNames();
					JOptionPane.showMessageDialog(null,  "Customer names: " + returnedValue);
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null,  e.getMessage());
				}
			}
		});
		contentPane.add(btnNames);
	
	}
}
