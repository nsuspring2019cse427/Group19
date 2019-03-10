//package com.project.bankManagement;

public class SavingsAccountHolder extends LocalAccountHolder {
	protected double interestBalance;
	
	public SavingsAccountHolder() {
		super();
	}
	
	public void recieveInterest(int interestPercentage) {
		interestBalance = (this.accountBalance * interestPercentage) / 100;
		this.accountBalance += interestBalance;
	}
	
	public void printInterestBalance() {
		System.out.println("Interest Balance: " + interestBalance);
	}

}

