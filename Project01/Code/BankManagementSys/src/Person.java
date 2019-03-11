//package com.project.bankManagement;

import javax.swing.JOptionPane;

public class Person {
	private String name;
	private int phone;
	
	Person(){
		
	}
	Person(String name, int phone){
		this.name = name;
		this.phone = phone;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setPhone(int phone){
		this.phone = phone;
	}
	public int getPhone(){
		return phone;
	}
	
	public void inputName() {
		name = JOptionPane.showInputDialog(null, "Enter Name: ");
		//JOptionPane.showMessageDialog(null, "Name: " + name);
	}
	public void inputPhone() {
		String newPhone;
		try {
			newPhone = JOptionPane.showInputDialog(null, "Enter Phone Number: ");
			phone = Integer.parseInt(newPhone);
			//JOptionPane.showMessageDialog(null, "Phone Number: " + phone);
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