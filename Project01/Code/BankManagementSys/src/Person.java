//package com.project.bankManagement;

import javax.swing.JOptionPane;

public class Person {
	protected String name;
	protected int phone;
	
	Person(){
		
	}
	Person(String name, int phone){
            
            
		this.name = name;
                if(phone<0)
                {
                    this.phone=phone;
                }else{
                    JOptionPane.showMessageDialog(null, "Wrong Input!");
                }
		
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setPhone(int phone){
		if(phone<0)
                {
                    this.phone=phone;
                }else{
                    JOptionPane.showMessageDialog(null, "Wrong Input!");
                }
	}
	public int getPhone(){
		return phone;
	}
	
	public void inputName() {
		          try {
                              String NewName;
                NewName = JOptionPane.showInputDialog(null, "Enter Name: ");
                              
                                  
                                  name= new String(NewName.toCharArray());
                              
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Wrong Input!");
            }
		
	}
	public void inputPhone() {
		String newPhone;
		try {
			newPhone = JOptionPane.showInputDialog(null, "Enter Phone Number: ");
			
                        if(newPhone.length()==11)
                        {
                            phone = Integer.parseInt(newPhone);
                        }else
                        {
                            JOptionPane.showMessageDialog(null, "Wrong Input!");
                        }
                        
			
		}
		catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Wrong Input!");
		}
	}
	
	public void printName(){
		System.out.println("Name: " + name);
	}
	public void printPhone(){
		System.out.println("Phone Number: " + phone);
	}
	
}