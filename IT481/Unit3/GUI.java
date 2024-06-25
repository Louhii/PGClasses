import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class GUI extends JFrame{
	private JPanel contentPane;
	private DB database;
	private String user;
	private String server;
	private String password;
	private String databasename;
	private Boolean isValid = true;
	
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
		
		setBounds(100, 100, 632, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConnect = new JLabel("Connect");
		lblConnect.setBounds(14, 50, 120, 20);
		
		contentPane.add(lblConnect);
		JButton btnConnect = new JButton("Connect to Database");
		btnConnect.setBounds(150, 50, 387, 25);
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
		lblCount.setBounds(14, 75, 120, 20);
		contentPane.add(lblCount);
		
		JButton btnCount = new JButton("Customer Count");
		btnCount.setBounds(150, 75, 387, 25);
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
		lblNames.setBounds(14, 100, 120, 20);
		contentPane.add(lblNames);
		
		JButton btnNames = new JButton("Get Company Names");
		btnNames.setBounds(150, 100, 387, 25);
		
		btnNames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String returnedValue = database.getCompanyNames();
					JOptionPane.showMessageDialog(null,  "The customer names are: " + returnedValue);
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null,  e.getMessage());
				}
			}
		});
		contentPane.add(btnNames);
		
		JLabel lblOrderCount = new JLabel("Order Count");
		lblOrderCount.setBounds(14, 125, 120, 20);
		contentPane.add(lblOrderCount);
		
		JButton btnOrderCount = new JButton("Order Count");
		btnOrderCount.setBounds(150, 125, 387, 25);
		btnOrderCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String returnedValue = database.getOrderCount();
					JOptionPane.showMessageDialog(null, "The order count is: " + returnedValue);
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		contentPane.add(btnOrderCount);
		
		JLabel lblOrderNames = new JLabel("Order Ship Names");
		lblOrderNames.setBounds(14, 150, 120, 20);
		contentPane.add(lblOrderNames);
		
		JButton btnOrderNames = new JButton("Get Order Ship Names");
		btnOrderNames.setBounds(150, 150, 387, 25);
		btnOrderNames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String returnedValue = database.getShipNames();
					JOptionPane.showMessageDialog(null, "Order ship names: " + returnedValue);
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		contentPane.add(btnOrderNames);
		
		JLabel lblEmployeeCount = new JLabel("Employee Count");
		lblEmployeeCount.setBounds(14, 175, 120, 20);
		
		contentPane.add(lblEmployeeCount);
		
		JButton btnEmployeeCount = new JButton("Employee Count");
		btnEmployeeCount.setBounds(150, 175, 387, 25);
		btnEmployeeCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String returnedValue = database.getEmployeeCount();
					JOptionPane.showMessageDialog(null, "The amount of employees is: " + returnedValue);
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		contentPane.add(btnEmployeeCount);
		
		JLabel lblEmployeeNames = new JLabel("Employee Names");
		lblEmployeeNames.setBounds(14, 200, 120, 20);
		
		contentPane.add(lblEmployeeNames);
		
		JButton btnEmployeeNames = new JButton("Get Employee Names");
		btnEmployeeNames.setBounds(150, 200, 387, 25);
		btnEmployeeNames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String returnedValue = database.getEmployeeNames();
					JOptionPane.showMessageDialog(null, "The employee names are: " + returnedValue);
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		contentPane.add(btnEmployeeNames);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setBounds(14, 225, 120, 20);
		contentPane.add(lblUser);
		
		JTextField tfUser = new JTextField(20);
		tfUser.setBounds(150, 225, 387, 25);
		contentPane.add(tfUser);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(14, 250, 120, 20);
		contentPane.add(lblPassword);
		
		final JPasswordField pfPassword = new JPasswordField(20);
		pfPassword.setBounds(150, 250, 387, 25);
		contentPane.add(pfPassword);
		
		JLabel lblServer = new JLabel("Server");
		lblServer.setBounds(14, 275, 120, 20);
		contentPane.add(lblServer);
		
		JTextField tfServer = new JTextField("localhost");
		tfServer.setBounds(150, 275, 387, 25);
		contentPane.add(tfServer);
		
		JLabel lblDatabase = new JLabel("Database");
		lblDatabase.setBounds(14, 300, 120, 20);
		contentPane.add(lblDatabase);
		
		JTextField tfDatabase = new JTextField("Northwind");
		tfDatabase.setBounds(150, 300, 387, 25);
		contentPane.add(tfDatabase);
		
		JButton btnGet = new JButton("Login");
		btnGet.setBounds(14, 325, 120, 20);
		btnGet.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						server = new String(tfServer.getText());
						databasename = new String(tfDatabase.getText());
						user = new String(tfUser.getText());
						password = new String(pfPassword.getPassword());
						
						if(user.isEmpty()|| password.isEmpty() || databasename.isEmpty() || server.isEmpty()) {
							isValid = false;
							
							JOptionPane.showMessageDialog(null, "Username, password, server and database must all be entered");
						}
						else {
							isValid = true;
							JOptionPane.showMessageDialog(null, "Values accepted!");
						}
						
					}
				});
		contentPane.add(btnGet);
		
	}
}
