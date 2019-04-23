
import javax.swing.JOptionPane;

//package com.project.bankManagement;

public class Accountant extends Person {
	protected static int accountantIdSerial;
	protected int accountantId;
	
	Accountant() {
		super();
		accountantIdSerial++;
		accountantId = accountantIdSerial;
	}
	Accountant(String name, String phone) {
		super(name, phone);
		accountantIdSerial++;
		accountantId = accountantIdSerial;
	}
	
	public void setAccountantId(int accountantId) {
            if (accountantId>0) {   //node 1
                this.accountantId = accountantId;   //node 2
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Input!");    //node 3
            }
		
	}
	public int getAccountantId() {
		return accountantId;
	}
	
	public void printAccountantId(){
		System.out.println("Accountant ID: " + accountantId);
	}

}