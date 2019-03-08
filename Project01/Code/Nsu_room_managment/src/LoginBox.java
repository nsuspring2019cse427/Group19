
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class LoginBox extends JFrame implements ActionListener{
	
	private JLabel userName;
	private JLabel password;
	public JTextField userField;
	public JPasswordField passField;
	private JButton Reset;
	private JButton Login; 
	
	
	public LoginBox(){
		
		userName = new JLabel("username");
		password = new JLabel("password");
		userField = new JTextField();
		passField = new JPasswordField();
		
		Reset = new JButton("Reset");
		Login = new JButton("Login");
		GridLayout frame = new GridLayout(3,2,10,10);
		
		setLayout(frame);
		
		add(userName);
		add(userField);
		add(password);
		add(passField);
		add(Reset);
		add(Login);
		
		
		Login.addActionListener(this);
		Reset.addActionListener(this);
		
		super.setTitle("Login");
		
		setSize(600,400);
		
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}


	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == Login){
			
			
			String n = userField.getText();
			
			String p = passField.getText();
			
			if(n.equals("admin")&& p.equals("admin")){
				
				second_layout sLayout = new second_layout();
				this.dispose();

			}
			
		}
		
		else if(e.getSource() == Reset){
			userField.setText(null);
			passField.setText(null);
		}
		else{
			
					

		}
		
	}
	public static void main(String [] args){
		LoginBox lb = new LoginBox();
	}
}
