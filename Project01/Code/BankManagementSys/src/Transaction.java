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
            if (transactionId>0) {  //node 1
                this.transactionId = transactionId; //node 3
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Input!");  //node 2
            }
		
	}
	public int getTransactionId(){
		return transactionId;
	}
	//account number
	public void setAccountNumber(int accountNumber){
            if (accountNumber>0) {  //node 4
                this.accountNumber = accountNumber; //node 6
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Input!");    //node 5
            }
		
	}
	public int getAccountNumber(){
		return accountNumber;
	}
	
	//accountant id
	public void setAccountantId(int accountantId){
            if (accountantId>0) {   //node 7 
                this.accountantId = accountantId; //node 9
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Input!");    //node 8
            }
		
	}
	public int getAccountantId() {
		return accountantId;
	}
	
	//previous balance
	public void setPreviousBalance(double previousBalance){
            if (previousBalance>0) {    //node 10
                this.previousBalance = previousBalance;     //node 12
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Input!");    //node 11
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
            if (transactionBalance>0) {
                this.transactionBalance = transactionBalance;
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Input!");
            }
		
	}
	public double getTransactionBalance(){
		return transactionBalance;
	}
	
	//input
	public void inputIsWithdraw() {
		String newIsWithdraw = JOptionPane.showInputDialog(null, "Enter 'true' to Withdraw or 'false' to Deposit: ");
		if(newIsWithdraw.equals("true") || newIsWithdraw.equals("false"))   //node 13
                {
                    this.isWithdraw = Boolean.parseBoolean(newIsWithdraw);  //node 15
                }else
                {
                       JOptionPane.showMessageDialog(null, "Wrong Input!"); //node 16
                }
                
	}
	public void inputPreviousBalance() {
		String newPreviousBalance = JOptionPane.showInputDialog(null, "Enter Previous Balance: ");
                try {
                double accCheck=Double.parseDouble(newPreviousBalance);
                if (accCheck>0) {   //node 17
                                  this.previousBalance=accCheck;    //node 19
                              } else {
                                  JOptionPane.showMessageDialog(null, "Wrong Input!"); //node 18
                              }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Wrong Input!"); 
            }
		
	}
	public void inputTransactionBalance() {
		String newTransactionBalance = JOptionPane.showInputDialog(null, "Enter Transaction Balance: ");
                try {
                double accCheck=Double.parseDouble(newTransactionBalance);
                if (accCheck>0) {   //node 20 def[accCheck]
                                  this.transactionBalance=accCheck; //node 22   use[accCheck]
                              } else {
                                  JOptionPane.showMessageDialog(null, "Wrong Input!");  //node 21
                              }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Wrong Input!"); 
            }
	}
	public void inputAccountNumber() {
		String newAccountNumber = JOptionPane.showInputDialog(null, "Enter Account Number: ");
                
                try {
                int accCheck=Integer.parseInt(newAccountNumber);
                if (accCheck>0) {   //node 20 def[accCheck]
                                  this.accountNumber=accCheck;  //node 22 use[accCheck]
                              } else {
                                  JOptionPane.showMessageDialog(null, "Wrong Input!");
                              }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Wrong Input!"); //node 21
            }
	}
	public void inputAccountantId() {
		String newAccountantId = JOptionPane.showInputDialog(null, "Enter Accountant ID: ");
                
                try {
                int accCheck=Integer.parseInt(newAccountantId);
                if (accCheck>0) {   //node 23 def[accCheck]
                                  this.accountantId=accCheck;   //node 25 use[accCheck]
                              } else {
                                  JOptionPane.showMessageDialog(null, "Wrong Input!");  //node 24 
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
