//package com.project.bankManagement;

import javax.swing.JOptionPane;

public abstract class AccountHolder extends Person {
	//declaring variables
	private static int accountNumberSerial = 0;
	protected int accountNumber;
	protected double accountBalance;
	
	//declaring abstract methods
	abstract void withdraw(double withdrawBalance);
	abstract void recieveLoan();
	abstract void recieveLoan(double loanAmount);
	
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
		this.accountBalance = balance;
	}
	
	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public double getAccountBalance(){
		return accountBalance;
	}
	
	public void inputAccountBalance() {
		String newAccountBalance = JOptionPane.showInputDialog(null, "Enter Balance:");
		this.accountBalance = Double.parseDouble(newAccountBalance);
		//JOptionPane.showMessageDialog(null, "Account Balance: " + accountBalance);
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
