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

	
	public boolean withdraw(double withdrawBalance) {
		if(withdrawBalance <= maxWithdrawAmount) {  //node 2 def[maxWithdrawBalance] ,def[totalWithdrawAmount]
			if(totalWithdrawAmount <= maxWithdrawAmount) { //node 4
				if(withdrawBalance <= this.accountBalance){ //node 6
					this.accountBalance -= withdrawBalance; //node 8 
					totalWithdrawAmount += withdrawBalance; //node 8 use[totalWithdrawAmount]
                                        return true;
				}
				else{
					JOptionPane.showMessageDialog(null, "Insufficient Balance !");
                                        return false; //node 7
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Stutus: Exceed Total Withdraw Amount!\n Total Max Withdraw: "
			+ maxWithdrawAmount + "\nYou can: " + (maxWithdrawAmount - totalWithdrawAmount));
                                return false;   //node 5
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Exceed Max Withdraw Limit!");
                        return false;   //node 3
		}
	}
        

	
	void recieveLoan() {
		double newLoanBalance = (this.accountBalance * 15) / 100;
		if(maxLoanAmount >= loanBalance ) { //node 10
			this.loanBalance = newLoanBalance;  //mode 12
		}
		else {
			JOptionPane.showMessageDialog(null, "Stutus: Exceed Max Loan Limit!\nPlease enter amount Manually\nYou Can loan maximum: " + maxLoanAmount);
		}   //node 11
	}

	
	void recieveLoan(double requestedLoanAmount) {
		if(maxLoanAmount >= requestedLoanAmount) {  //node 10
			this.loanBalance = requestedLoanAmount; //node 12
		}
		else {
			JOptionPane.showMessageDialog(null, "Stutus: Exceed Max Loan Amount!\nYou can: " + maxLoanAmount);
		}   //node 11
	}
	
	
	public void recieveInterest(int interestPercentage) {
            if (interestPercentage>0) { //node 13
                interestBalance = (this.accountBalance * interestPercentage) / 100;
                this.accountBalance += interestBalance; //node 15
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Input!");
            }   //node 14
		
		
	}
	
	public void printInterestBalance() {
		System.out.println("Interest Balance: " + interestBalance);
	}
	
	public void printLoanBalance() {
		JOptionPane.showMessageDialog(null, "Loan Balance: " + loanBalance);
	}

}
