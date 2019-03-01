import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

public class second_layout extends JFrame implements ActionListener {
	
	private JButton classRoom;
	private JButton gallary;
	private JButton recreation;
	private JButton auditorium;
	private JButton openSpace;
	private JButton examRoom;
	private GridLayout layout;
	
	public second_layout()
	{
		setSize(600,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		layout = new GridLayout(2,3,10,10);
		setLayout(layout);
		create_buttons();
		super.setTitle("Choose");
	}
	
	private void create_buttons()
	{
		classRoom = new JButton("Class Room");
		gallary = new JButton("Gallary");
		recreation = new JButton("Recreation");
		auditorium = new JButton("Auditorium");
		openSpace = new JButton("Open Space");
		examRoom = new JButton("Exam Room");
		
		
		add(classRoom);
		add(gallary);
		add(recreation);
		add(auditorium);
		add(openSpace);
		add(examRoom);
		
		classRoom.addActionListener(this);
		gallary.addActionListener(this);
		recreation.addActionListener(this);
		auditorium.addActionListener(this);
		openSpace.addActionListener(this);
		examRoom.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == classRoom){
			//classroom_book c = new classroom_book();
			Book_window c = new Book_window();
			this.dispose();
			System.out.println("classRoom is clicked");
		}
		
		
		if(e.getSource() == gallary){
			Gallary_book d = new Gallary_book();
			this.dispose();
			
			System.out.println("gallary is clicked");
		}
		if(e.getSource() == recreation){
			Recreation_book d = new Recreation_book();
			this.dispose();
			
			System.out.println("recreation is clicked");
		}
		if(e.getSource() == auditorium){
			Auditorium_book f =  new Auditorium_book ();
			this.dispose();
			System.out.println("auditorium is clicked");
		}
		if(e.getSource() == openSpace){
			Open_Space_book m = new Open_Space_book();
			this.dispose();
			System.out.println("openSpace is clicked");
		}
		
		if(e.getSource() == examRoom){
			Exam_Room_book l = new Exam_Room_book();
			this.dispose();
			System.out.println("examRoom is clicked");
		}
	}

}
