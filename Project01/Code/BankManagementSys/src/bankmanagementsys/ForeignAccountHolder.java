//package com.project.bankManagement;

import javax.swing.JOptionPane;

public class ForeignAccountHolder extends AccountHolder {
	protected double interestBalance;
	protected double maxWithdrawAmount = 500;
	protected double totalWithdrawAmount = 0;
	protected double loanBalance;
	protected double maxLoanAmount = 500;
	
	public ForeignAccountHolder() {
		super();
	}

	@Override
	void withdraw(double withdrawBalance) {
		if(withdrawBalance <= maxWithdrawAmount) {
			if(totalWithdrawAmount <= maxWithdrawAmount) {
				if(withdrawBalance <= this.accountBalance){
					this.accountBalance -= withdrawBalance;
					totalWithdrawAmount += withdrawBalance;
				}
				else{
					JOptionPane.showMessageDialog(null, "Insufficient Balance !");
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Stutus: Exceed Total Withdraw Amount!\n Total Max Withdraw: "
			+ maxWithdrawAmount + "\nYou can: " + (maxWithdrawAmount - totalWithdrawAmount));
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Exceed Max Withdraw Limit!");
		}
	}

	@Override
	void recieveLoan() {
		double newLoanBalance = (this.accountBalance * 15) / 100;
		if(maxLoanAmount >= loanBalance ) {
			this.loanBalance = newLoanBalance;
		}
		else {
			JOptionPane.showMessageDialog(null, "Stutus: Exceed Max Loan Limit!\nPlease enter amount Manually\nYou Can loan maximum: " + maxLoanAmount);
		}
	}

	@Override
	void recieveLoan(double requestedLoanAmount) {
		if(maxLoanAmount >= requestedLoanAmount) {
			this.loanBalance = requestedLoanAmount;
		}
		else {
			JOptionPane.showMessageDialog(null, "Stutus: Exceed Max Loan Amount!\nYou can: " + maxLoanAmount);
		}
	}
	
	
	public void recieveInterest(int interestPercentage) {
		interestBalance = (this.accountBalance * interestPercentage) / 100;
		this.accountBalance += interestBalance;
	}
	
	public void printInterestBalance() {
		System.out.println("Interest Balance: " + interestBalance);
	}
	
	public void printLoanBalance() {
		JOptionPane.showMessageDialog(null, "Loan Balance: " + loanBalance);
	}

}
