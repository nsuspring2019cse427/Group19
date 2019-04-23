//package com.project.bankManagement;

import javax.swing.JOptionPane;

public class Person {
	protected String name;
	protected String phone;
	
	Person(){
		
	}
	Person(String name, String phone){
            
            
		this.name = name;
                this.phone=phone;
		
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setPhone(String phone){
		
                    if(phone.length()==11)  //node 1
                        {
                            this.phone=phone; //node 3
                        }else
                        {
                            JOptionPane.showMessageDialog(null, "Wrong Input!"); //node 2
                        }
                
	}
	public String getPhone(){
            
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
	
			newPhone = JOptionPane.showInputDialog(null, "Enter Phone Number: ");
			
                        if(newPhone.length()==11)
                        {
                            this.phone=newPhone;
                        }else
                        {
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