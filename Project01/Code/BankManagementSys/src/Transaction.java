//package com.project.bankManagement;

import javax.swing.JOptionPane;

public class Transaction {
	protected int transactionId;
	protected static int transactionIdSerial;
	protected int accountNumber;
	protected int accountantId;
	protected double previousBalance;
	protected boolean isWithdraw;
	protected double transactionBalance;
	
	Transaction(){
		transactionIdSerial = transactionIdSerial + 1;
		transactionId = transactionIdSerial;
	}
	
	//getter & setter method
	public void setTransactionId(int transactionId){
            if (transactionId>0) {
                this.transactionId = transactionId;
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Input!"); 
            }
		
	}
	public int getTransactionId(){
		return transactionId;
	}
	//account number
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
	
	//accountant id
	public void setAccountantId(int accountantId){
            if (accountantId>0) {
                this.accountantId = accountantId;
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Input!"); 
            }
		
	}
	public int getAccountantId() {
		return accountantId;
	}
	
	//previous balance
	public void setPreviousBalance(double previousBalance){
            if (previousBalance>0) {
                this.previousBalance = previousBalance;
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Input!");
            }
		
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
		if(newIsWithdraw.equals("true") || newIsWithdraw.equals("false"))
                {
                    this.isWithdraw = Boolean.parseBoolean(newIsWithdraw);
                }else
                {
                       JOptionPane.showMessageDialog(null, "Wrong Input!"); 
                }
                
	}
	public void inputPreviousBalance() {
		String newPreviousBalance = JOptionPane.showInputDialog(null, "Enter Previous Balance: ");
                try {
                double accCheck=new Double(newPreviousBalance);
                if (accCheck<0) {
                                  this.previousBalance=accCheck;
                              } else {
                                  JOptionPane.showMessageDialog(null, "Wrong Input!");
                              }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Wrong Input!"); 
            }
		
	}
	public void inputTransactionBalance() {
		String newTransactionBalance = JOptionPane.showInputDialog(null, "Enter Transaction Balance: ");
                try {
                double accCheck=new Double(newTransactionBalance);
                if (accCheck<0) {
                                  this.transactionBalance=accCheck;
                              } else {
                                  JOptionPane.showMessageDialog(null, "Wrong Input!");
                              }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Wrong Input!"); 
            }
	}
	public void inputAccountNumber() {
		String newAccountNumber = JOptionPane.showInputDialog(null, "Enter Account Number: ");
                
                try {
                int accCheck=new Integer(newAccountNumber);
                if (accCheck<0) {
                                  this.accountNumber=accCheck;
                              } else {
                                  JOptionPane.showMessageDialog(null, "Wrong Input!");
                              }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Wrong Input!"); 
            }
	}
	public void inputAccountantId() {
		String newAccountantId = JOptionPane.showInputDialog(null, "Enter Accountant ID: ");
                
                try {
                int accCheck=new Integer(newAccountantId);
                if (accCheck<0) {
                                  this.accountantId=accCheck;
                              } else {
                                  JOptionPane.showMessageDialog(null, "Wrong Input!");
                              }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Wrong Input!"); 
            }
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
