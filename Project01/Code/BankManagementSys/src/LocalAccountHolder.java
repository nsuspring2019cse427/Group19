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

	
	boolean withdraw(double withdrawBalance) {
		if(withdrawBalance <= this.accountBalance && withdrawBalance>=0){
			this.accountBalance -= withdrawBalance;
                        return true;
		}
		else{
			JOptionPane.showMessageDialog(null, "Insufficient Balance !");
                        return false;
		}		
	}
        

	
	void recieveLoan() {
		loanBalance = (this.accountBalance * 50) / 100;		
	}

	
	void recieveLoan(double loanAmount) {
            if (loanAmount>0) {
                this.loanBalance = loanAmount;
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Input!");
            }
		
	}
	
	public void printLoanBalance() {
		JOptionPane.showMessageDialog(null, "Loan Balance: " + loanBalance);
	}

}