import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class LoginSys {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JFrame frmLoginSystem;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSys window = new LoginSys();
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
	public LoginSys() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLoginSystem = new JLabel("Login System");
		lblLoginSystem.setForeground(Color.MAGENTA);
		lblLoginSystem.setBounds(141, 21, 95, 14);
		frame.getContentPane().add(lblLoginSystem);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setForeground(Color.RED);
		lblUsername.setBounds(27, 77, 70, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.RED);
		lblPassword.setBounds(28, 128, 46, 14);
		frame.getContentPane().add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		String UserName  = textField.getText();
		String Password=passwordField_1.getText();
		
		if(Password.contains("1234") && UserName.contains("Rajan")) {
			//textField.setText(null);
			//passwordField_1.setText(null);
			new OnlineTest("Online Test Of Java");  
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid Choice","Login Error",JOptionPane.ERROR_MESSAGE);
			passwordField_1.setText(null);
			textField.setText(null);
		}
			
			}
		});
		btnLogin.setBounds(56, 206, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		textField = new JTextField();
		textField.setBounds(124, 74, 169, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(202, 125, -67, 20);
		frame.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(124, 125, 169, 20);
		frame.getContentPane().add(passwordField_1);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				passwordField_1.setText(null);
				
			}
		});
		btnNewButton.setBounds(181, 206, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLoginSystem = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frmLoginSystem,  "Confirm if u want to exit", "Login Systems",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			
			}
		});
		btnExit.setBounds(305, 206, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(27, 177, 397, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(27, 46, 397, 3);
		frame.getContentPane().add(separator_1);
	}
}
