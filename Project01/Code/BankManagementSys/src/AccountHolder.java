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
	public AccountHolder(String name, int phone, double balance) {
		super(name, phone);
		accountNumberSerial++;
		accountNumber = accountNumberSerial;
                if(balance>0)
                {
                    this.accountBalance = balance;
                }else
                {
                    JOptionPane.showMessageDialog(null, "Wrong Input!");
                }
		
	}
	
	public void setAccountNumber(int accountNumber){
            if (accountNumber>0) {
                this.accountNumber = accountNumber;
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Input!");
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
		          try {
                double accCheck=new Double(newAccountBalance);
                              if (accCheck>0) {
                                  this.accountBalance=accCheck;
                              } else {
                                  JOptionPane.showMessageDialog(null, "Wrong Input!");
                              }
                              
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Wrong Input!");
            }
//                          
		
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
