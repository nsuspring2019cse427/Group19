//package com.project.bankManagement;

import javax.swing.JOptionPane;

public class Transaction {
	private int transactionId;
	private static int transactionIdSerial;
	private int accountNumber;
	private int accountantId;
	private double previousBalance;
	private boolean isWithdraw;
	private double transactionBalance;
	
	Transaction(){
		transactionIdSerial = transactionIdSerial + 1;
		transactionId = transactionIdSerial;
	}
	
	//getter & setter method
	public void setTransactionId(int transactionId){
		this.transactionId = transactionId;
	}
	public int getTransactionId(){
		return transactionId;
	}
	//account number
	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}
	public int getAccountNumber(){
		return accountNumber;
	}
	
	//accountant id
	public void setAccountantId(int accountantId){
		this.accountantId = accountantId;
	}
	public int getAccountantId() {
		return accountantId;
	}
	
	//previous balance
	public void setPreviousBalance(double previousBalance){
		this.previousBalance = previousBalance;
	}
	public double getPreviousBalance(){
		return previousBalance;
	}
	
	//is  withdraw
	public void setIsWithdraw(boolean isWithdraw){
		this.isWithdraw = isWithdraw;
	}
	public boolean getIsWithdraw(){
		return isWithdraw;
	}
	
	//transaction balance
	public void setTransactionBalance(double transactionBalance){
		this.transactionBalance = transactionBalance;
	}
	public double getTransactionBalance(){
		return transactionBalance;
	}
	
	//input
	public void inputIsWithdraw() {
		String newIsWithdraw = JOptionPane.showInputDialog(null, "Enter 'true' to Withdraw or 'false' to Deposit: ");
		this.isWithdraw = Boolean.parseBoolean(newIsWithdraw);
	}
	public void inputPreviousBalance() {
		String newPreviousBalance = JOptionPane.showInputDialog(null, "Enter Previous Balance: ");
		this.previousBalance = Double.parseDouble(newPreviousBalance);
	}
	public void inputTransactionBalance() {
		String newTransactionBalance = JOptionPane.showInputDialog(null, "Enter Transaction Balance: ");
		this.transactionBalance = Double.parseDouble(newTransactionBalance);
	}
	public void inputAccountNumber() {
		String newAccountNumber = JOptionPane.showInputDialog(null, "Enter Account Number: ");
		this.accountNumber = Integer.parseInt(newAccountNumber);
	}
	public void inputAccountantId() {
		String newAccountantId = JOptionPane.showInputDialog(null, "Enter Accountant ID: ");
		this.accountantId = Integer.parseInt(newAccountantId);
	}
	
	//printing info
	public void printTransactionId() {
		System.out.println("Transaction ID: " + transactionId);
	}
	public void printIsWithdraw() {
		System.out.println("Is Withdraw: " + isWithdraw);
	}
	public void printPreviousBalance() {
		System.out.println("Previous Balance: " + previousBalance);
	}
	public void printTransactionBalance() {
		System.out.println("Transaction Balance: " + transactionBalance);
	}
	public void printAccountNumber() {
		System.out.println("Account Number: " + accountNumber);
	}
	public void printAccountantId() {
		System.out.println("Accountant ID: " + accountantId);
	}
	
}
