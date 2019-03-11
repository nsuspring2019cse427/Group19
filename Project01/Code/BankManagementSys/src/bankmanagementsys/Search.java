//package com.project.bankManagement;

public class Search {
	//declaring variables
	private int accountHolder;
	private static int accountHolderSerial;
	private static int accountantSerial;
	private int accountNumber[];
	
	//constructor
	Search(int accountHolder){
		this.accountHolder = accountHolder;
		this.accountNumber = new int[accountHolder];
	}
	//setter for account number
	public void setAccountNumber(int gettingAccountNumber) {
		accountNumber[accountHolderSerial] = gettingAccountNumber;
		accountHolderSerial++;
	}
	//setter for accountants id
	public void setAccountantId(int gettingAccountNumber) {
		accountNumber[accountantSerial] = gettingAccountNumber;
		accountantSerial++;
	}
	//search method
	public int searchAccountNumber(int searchAccountNumber) {
		for(int counter = 0; counter < accountHolder; counter++) {
			//matching account
			if(searchAccountNumber == accountNumber[counter]) {
				return counter;
			}
		}
		return -1;
	}
	
}
