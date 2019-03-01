
//public class Auditorium_book {

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Auditorium_book extends JFrame implements ActionListener{
	
	
	private JLabel name;
	private JLabel date;
	private JLabel reason;
	private JTextField nameField;
	private JTextArea reasonArea;
	private JButton submit;
	private JButton cancel;
	private JComboBox yearCombo;
	private JComboBox monthCombo;
	private JComboBox dateCombo;
	private GridLayout frame;
	private JLabel blank;
	
	private String[] year  = {"2014","2015"};
	private String[] dates;
	private String[] month;
	
	public Auditorium_book()
	{
	    dates = new String[31];
		month = new String[12];
		
		setSize(600,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame = new GridLayout(4,4,20,20);
		setLayout(frame);
		 
		
		addDateMonth();
		addInformation();
		System.out.println("Auditorium_book");
		super.setTitle("Book Auditorium");
		
	}
	
	private void addInformation()
	{ 
		blank = new JLabel("");
		
		name = new JLabel("Your Name: ");
		date = new JLabel("Select Date: ");
		reason = new JLabel("Reason for booking: ");
		
		nameField = new JTextField();
		reasonArea = new JTextArea(5, 20);
		reasonArea.setEditable(true);
		
		
		yearCombo = new JComboBox(year);
		monthCombo = new JComboBox(month);
		dateCombo = new JComboBox(dates);
		
		submit = new JButton("Submit");
		cancel = new JButton("Cancel");
		
		 
		 add(name);
		 add(nameField);
		 add(blank);
		 add(blank);
		 
		 add(date);
		 add(yearCombo);
		 add(monthCombo);
		 add(dateCombo);
		 
		 add(reason);
		 add(reasonArea);
		 add(blank);
		 add(blank);
		 
		 add(blank);
		 add(submit);
		 add(cancel);
		 add(blank);
		 
		 submit.addActionListener(this);
		 cancel.addActionListener(this);
		 
		
	}
	

	private void addDateMonth()
	{
		for(int i = 0; i < dates.length;i++)
			dates[i] = ""+(i+1);
		
		for(int i = 0; i < month.length;i++)
			month[i] = ""+(i+1);
		
	}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == submit){
			
			String n = nameField.getText();
			String date = yearCombo.getSelectedItem().toString() + "-"+monthCombo.getSelectedItem().toString()+"-"+dateCombo.getSelectedItem().toString();
			String reasonField = reasonArea.getText();
			
			System.out.println(n +" "+ date +" "+ reasonField);
			System.out.println("Submit is clicked");
			
			nameField.setText("");
			reasonArea.setText("");
			yearCombo.setSelectedItem("2014");
			monthCombo.setSelectedItem("1");
			dateCombo.setSelectedItem("1");
			
		}
		
		if(e.getSource() == cancel){
			second_layout sl = new second_layout();
			this.dispose();
			System.out.println("cancel is clicked");
		}
	}

}

