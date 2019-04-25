//package com.project.bankManagement;

public class SavingsAccountHolder extends LocalAccountHolder {
	protected double interestBalance;
	
	public SavingsAccountHolder() {
		super();
	}
	
	public double recieveInterest(double interestPercentage) {
		interestBalance = (this.accountBalance * interestPercentage) / 100;
		this.accountBalance += interestBalance;
            return interestBalance;
	}
        
	
	public void printInterestBalance() {
		System.out.println("Interest Balance: " + interestBalance);
	}

}

