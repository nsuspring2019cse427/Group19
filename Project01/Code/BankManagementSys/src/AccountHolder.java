//package com.project.bankManagement;

import javax.swing.JOptionPane;

public class AccountHolder extends Person {
	//declaring variables
	protected static int accountNumberSerial;
	protected int accountNumber;
	protected double accountBalance;
	
	
	
	//constructors
	public AccountHolder() {
		super();
		accountNumberSerial++;
		accountNumber = accountNumberSerial;
	}
	public AccountHolder(String name, String phone, double balance) {
		super(name, phone);
		accountNumberSerial++;
		accountNumber = accountNumberSerial;    //node 1
                if(balance>0)
                {
                    this.accountBalance = balance;      //node 2
                }else
                {
                    JOptionPane.showMessageDialog(null, "Wrong Input!");    //node 3
                }
		
	}
	
	public void setAccountNumber(int accountNumber){
            if (accountNumber>0) {  //node 4
                this.accountNumber = accountNumber;     //node 5
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Input!");   //node 6
            }
		
	}
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public void setAccountBalance(double accountBalance) {
            if (accountBalance>0) {
                this.accountBalance = accountBalance;
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Input!");
            }
		
	}
	public double getAccountBalance(){
		return accountBalance;
	}
	
	public void inputAccountBalance() {
		String newAccountBalance = JOptionPane.showInputDialog(null, "Enter Balance:");
		          
                double accCheck=Double.parseDouble(newAccountBalance);
                            if (accCheck>0) {   //node 7
                this.accountBalance=accCheck;   //node 8
            } else {
                                JOptionPane.showMessageDialog(null, "Wrong Input!");    //node 9
            }
   
	}
	
	public void printAccountNumber(){
		System.out.println("\nAccount Number: " + accountNumber);
	}
	
	public void printAccountBalance(){
		System.out.println("Account Balance: " + accountBalance);
	}
	
	//method to deposit balance
	public void deposit(double depositBalance){
		this.accountBalance += depositBalance;
	}
	
}
