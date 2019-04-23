//package com.project.bankManagement;

import javax.swing.JOptionPane;

class LocalAccountHolder extends AccountHolder {
	protected double loanBalance;
	
	public LocalAccountHolder() {
		super();
	}
	public LocalAccountHolder(String name, String phone, double balance) {
		super(name, phone, balance);
	}

	
	boolean withdraw(double withdrawBalance) {
		if(withdrawBalance <= this.accountBalance && withdrawBalance>=0){   //node 2 & //node 4
			this.accountBalance -= withdrawBalance; //node 6
                        return true;
		}
		else{
			JOptionPane.showMessageDialog(null, "Insufficient Balance !");  //node 5
                        return false;
		}		
	}
        

	
	void recieveLoan() {
		loanBalance = (this.accountBalance * 50) / 100;		
	}

	
	void recieveLoan(double loanAmount) {
            if (loanAmount>0) { //node 7
                this.loanBalance = loanAmount;  //node 9
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Input!");    //node 8
            }
		
	}
	
	public void printLoanBalance() {
		JOptionPane.showMessageDialog(null, "Loan Balance: " + loanBalance);
	}

}