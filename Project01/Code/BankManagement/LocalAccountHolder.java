//package com.project.bankManagement;

import javax.swing.JOptionPane;

class LocalAccountHolder extends AccountHolder {
	protected double loanBalance;
	
	public LocalAccountHolder() {
		super();
	}
	public LocalAccountHolder(String name, int phone, double balance) {
		super(name, phone, balance);
	}

	@Override
	void withdraw(double withdrawBalance) {
		if(withdrawBalance <= this.accountBalance){
			this.accountBalance -= withdrawBalance;
		}
		else{
			JOptionPane.showMessageDialog(null, "Insufficient Balance !");
		}		
	}

	@Override
	void recieveLoan() {
		loanBalance = (this.accountBalance * 50) / 100;		
	}

	@Override
	void recieveLoan(double loanAmount) {
		this.loanBalance = loanAmount;
	}
	
	public void printLoanBalance() {
		JOptionPane.showMessageDialog(null, "Loan Balance: " + loanBalance);
	}

}