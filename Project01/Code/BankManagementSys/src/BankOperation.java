//package com.project.bankManagement;

import javax.swing.JOptionPane;

public class BankOperation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating object for accountants
		Accountant accountants[] = new Accountant[2];
		
		//getting info for accountants
		System.out.println("==Enter Info for Accountanats==");
		for(int counter = 0; counter < 2; counter++) {
			accountants[counter] = new Accountant();
			System.out.println("\nAccountant ID: " + accountants[counter].getAccountantId());
			accountants[counter].inputName();
			accountants[counter].inputPhone();
		}
		
		//getting total holder number
		String newAccountHolder = JOptionPane.showInputDialog(null, "Enter Total Account Holder: ");
		int accountHolder = Integer.parseInt(newAccountHolder);
		
		//creating objects
		SavingsAccountHolder[] users = new SavingsAccountHolder[accountHolder];
		
		for(int counter = 0; counter < accountHolder; counter++){
			//creating new object
			users[counter] = new SavingsAccountHolder();
			//printing account number
			System.out.println("\nAccount Number: " + users[counter].getAccountNumber());
			//getting input
			users[counter].inputName();
			users[counter].inputPhone();
			users[counter].inputAccountBalance();
		}
		//printing info
		for(int counter = 0 ; counter < accountHolder; counter++) {
			users[counter].printAccountNumber();
			users[counter].printName();
			users[counter].printPhone();
			users[counter].printAccountBalance();
		}
		//getting percentage of interest
		String newInterestInput = JOptionPane.showInputDialog(null, "Enter Percentage of Interest:");
		int interestInput = Integer.parseInt(newInterestInput);
		
		for(int counter = 0; counter < accountHolder; counter++) {
			users[counter].recieveInterest(interestInput);
		}
		//printing after getting interest
		for(int counter = 0; counter < accountHolder; counter++){
			users[counter].printAccountNumber();
			users[counter].printAccountBalance();
			users[counter].printInterestBalance();
		}
		
		//creating search object for user
		Search userSearch = new Search(accountHolder);
		//creating search object for accountants
		Search accountantSearch = new Search(2);
		//sending all account number of users
		for(int counter = 0; counter < accountHolder; counter++) {
			userSearch.setAccountNumber(users[counter].getAccountNumber());
		}
		//sending all account number of accountants
		for(int counter = 0; counter < 2; counter++) {
			accountantSearch.setAccountantId(accountants[counter].getAccountantId());
		}
		//creating array to store holders id index
		int[] searchResult = new int[accountHolder];
		
		//creating object for transactions
		Transaction transactions[] = new Transaction[accountHolder];
		
		//transaction
		for(int count = 0; count < accountHolder; count++) {
			//getting account number to perform
			int[] newAccountNumber = new int[accountHolder];
			String newAccountNumberString = JOptionPane.showInputDialog(null, "Enter Account Number to Search: ");
			newAccountNumber[count] = Integer.parseInt(newAccountNumberString);
			
			//searching account number
			int counter = userSearch.searchAccountNumber(newAccountNumber[count]);
			searchResult[count] = counter;
			
			//for valid id only
			if(counter != -1) {			
				//creating new transaction
				transactions[counter] = new Transaction();
				String newAccountantString = JOptionPane.showInputDialog(null, "Withdraw/Deposit Section !\nWelcome " + users[counter].getName() + " !\n"
						+ "Enter Accountant ID '" + accountants[0].getAccountantId() + "' or '" + accountants[1].getAccountantId() + "': ");
				int newAccountant = Integer.parseInt(newAccountantString);
				
				transactions[counter].setAccountantId(newAccountant);
				transactions[counter].setPreviousBalance(users[counter].getAccountBalance());
				transactions[counter].inputIsWithdraw();
				//withdraw
				if(transactions[counter].getIsWithdraw() == true) {
					transactions[counter].inputTransactionBalance();
					users[counter].withdraw(transactions[counter].getTransactionBalance());
				}
				//deposit
				else {
					transactions[counter].inputTransactionBalance();
					users[counter].deposit(transactions[counter].getTransactionBalance());
				}
			}
			else {
				//if account doesn't exist
				JOptionPane.showMessageDialog(null, "Invalid Account Number !");
			}
		}
		//printing info
		for(int counter = 0; counter < accountHolder; counter++) {
			if(searchResult[counter] != -1) {
				users[counter].printAccountNumber();
				transactions[counter].printTransactionId();
				accountants[transactions[counter].getAccountantId()-1].printName();
				transactions[counter].printAccountantId();
				transactions[counter].printPreviousBalance();
				transactions[counter].printIsWithdraw();
				transactions[counter].printTransactionBalance();
				users[counter].printAccountBalance();
			}
			else {
				users[counter].printAccountNumber();
				JOptionPane.showMessageDialog(null, "Transaction Failed !");
			}
		}
		//finding transaction by accountant id
		String newAccountantString = JOptionPane.showInputDialog(null, "Enter Accountant ID: ");
		int newAccountant = Integer.parseInt(newAccountantString);
		//searching accountant
		int count = accountantSearch.searchAccountNumber(newAccountant);
		
		try{
			if(count != -1) {
				System.out.println("\n==Accountant Info==");
				accountants[count].printName();
				accountants[count].printPhone();
				
				//counting total transactions under this accountant
				int countTransactions = 0;
				for(int counter = 0; counter < accountHolder; counter++) {
					if(newAccountant == transactions[counter].getAccountantId()) {
						countTransactions++;
					}
				}
				//System.out.println("\nTotal " + countTransactions + " transactions found by " + accountants[count].getName());
				JOptionPane.showMessageDialog(null, "Total " + countTransactions + " transactions found by \n" + accountants[count].getName());
				
				if(countTransactions != 0) {
					System.out.println("\n==Transactions==");
					for(int counter = 0; counter < accountHolder; counter++) {
						if(newAccountant == transactions[counter].getAccountantId()) {
							users[counter].printAccountNumber();
							transactions[counter].printTransactionId();
							transactions[counter].printPreviousBalance();
							transactions[counter].printIsWithdraw();
							transactions[counter].printTransactionBalance();
							users[counter].printAccountBalance();
						}
					}
				}
			}
			else {
				//if accountant doesn't exist
				JOptionPane.showMessageDialog(null, "\nInvalid Accountant ID !");
			}
		}
		catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Data Not Found !");
		}
		
		//section for loan
		for(int counts = 0; counts < accountHolder; counts++) {
			//getting account number to perform
			int[] newAccountNumber = new int[accountHolder];
			String newAccountNumberString = JOptionPane.showInputDialog(null, "Enter Account Number to Search: ");
			newAccountNumber[count] = Integer.parseInt(newAccountNumberString);
			
			//searching account number
			int counter = userSearch.searchAccountNumber(newAccountNumber[count]);
			searchResult[count] = counter;
			
			//for valid id only
			if(counter != -1) {
				String newHotKey = JOptionPane.showInputDialog(null, "Enter '1' for Auto Loan or '2' for Manual: ");
				int hotKey = Integer.parseInt(newHotKey);
				if(hotKey == 1) {
					users[counter].recieveLoan();
				}
				else {
					String newBalance = JOptionPane.showInputDialog(null, "Enter Amount to Loan: ");
					double balance = Double.parseDouble(newBalance);
					users[counter].recieveLoan(balance);
				}
			}
			else {
				//if account doesn't exist
				JOptionPane.showMessageDialog(null, "Invalid Account Number !");
			}
		}
		//printing info
		for(int counter = 0; counter < accountHolder; counter++) {
			if(searchResult[counter] != -1) {
				users[counter].printAccountNumber();
				users[counter].printAccountBalance();
			}
			else {
				users[counter].printAccountNumber();
				JOptionPane.showMessageDialog(null, "Loan Failed !");
			}
		}
		
	}
	
}
