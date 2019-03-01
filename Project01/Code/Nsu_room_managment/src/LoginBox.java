
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class LoginBox extends JFrame implements ActionListener{
	
	private JLabel userName;
	private JLabel password;
	private JTextField userField;
	private JPasswordField passField;
	private JButton signUp;
	private JButton submit; 
	
	
	public LoginBox(){
		
		userName = new JLabel("username");
		password = new JLabel("password");
		userField = new JTextField();
		passField = new JPasswordField();
		
		signUp = new JButton("Sign Up");
		submit = new JButton("submit");
		GridLayout frame = new GridLayout(3,2,10,10);
		
		setLayout(frame);
		
		add(userName);
		add(userField);
		add(password);
		add(passField);
		add(signUp);
		add(submit);
		
		
		submit.addActionListener(this);
		signUp.addActionListener(this);
		
		super.setTitle("Login");
		
		setSize(600,400);
		
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}


	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == submit){
			
			
			String n = userField.getText();
			
			String p = passField.getText();
			
			if(n.equals("a")&& p.equals("a")){
				
				second_layout sLayout = new second_layout();
				this.dispose();

			}
			
		}
		
		else if(e.getSource() == signUp){
			System.out.println("Sign Up");
		}
		else{
			
					

		}
		
	}
	public static void main(String [] args){
		LoginBox lb = new LoginBox();
	}
}
