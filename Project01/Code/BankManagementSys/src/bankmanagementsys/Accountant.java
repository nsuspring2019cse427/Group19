//package com.project.bankManagement;

public class Accountant extends Person {
	private static int accountantIdSerial;
	private int accountantId;
	
	Accountant() {
		super();
		accountantIdSerial++;
		accountantId = accountantIdSerial;
	}
	Accountant(String name, int phone) {
		super(name, phone);
		accountantIdSerial++;
		accountantId = accountantIdSerial;
	}
	
	public void setAccountantId(int accountantId) {
		this.accountantId = accountantId;
	}
	public int getAccountantId() {
		return accountantId;
	}
	
	public void printAccountantId(){
		System.out.println("Accountant ID: " + accountantId);
	}

}