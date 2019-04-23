import javax.swing.JOptionPane;

public class BankOperation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating object for accountants
		Accountant accountants[] = new Accountant[2];
		
		//getting info for accountants
		System.out.println("==Enter Info for Accountanats==");
		for(int counter = 0; counter < 2; counter++) {  //node 1 def[counter]
			accountants[counter] = new Accountant();
			System.out.println("\nAccountant ID: " + accountants[counter].getAccountantId());
			accountants[counter].inputName();   //node 3
			accountants[counter].inputPhone();  //node 3 use[counter]
		}
		
		//getting total holder number
		String newAccountHolder = JOptionPane.showInputDialog(null, "Enter Total Account Holder: ");
		int accountHolder = Integer.parseInt(newAccountHolder);
		
		//creating objects
		SavingsAccountHolder[] users = new SavingsAccountHolder[accountHolder];
		
		for(int counter = 0; counter < accountHolder; counter++){   //node 5 def[counter]
			//creating new object
			users[counter] = new SavingsAccountHolder();
			//printing account number
			System.out.println("\nAccount Number: " + users[counter].getAccountNumber());
			//getting input
			users[counter].inputName(); //node 7
			users[counter].inputPhone();    //node 7
			users[counter].inputAccountBalance();   //node 7 use[counter]
		}
		//printing info
		for(int counter = 0 ; counter < accountHolder; counter++) { //node 9 def[counter]
			users[counter].printAccountNumber();
			users[counter].printName(); //node 10
			users[counter].printPhone(); //nodE 10
			users[counter].printAccountBalance();   //node 10 use [counter]
		}
		//getting percentage of interest
		String newInterestInput = JOptionPane.showInputDialog(null, "Enter Percentage of Interest:");
		int interestInput = Integer.parseInt(newInterestInput);
		
		for(int counter = 0; counter < accountHolder; counter++) { //node 13 def[interestInput], def[counter]
			users[counter].recieveInterest(interestInput);  //node 15 use[interestInput], use[counter]
		}
		//printing after getting interest
		for(int counter = 0; counter < accountHolder; counter++){   //node 17 def[counter]
			users[counter].printAccountNumber();    //node 19
			users[counter].printAccountBalance();   //node 19
			users[counter].printInterestBalance();  //node 19 use[counter]
		}
		
		//creating search object for user
		Search userSearch = new Search(accountHolder);
		//creating search object for accountants
		Search accountantSearch = new Search(2);
		//sending all account number of users
		for(int counter = 0; counter < accountHolder; counter++) {  //node 21 def[counter]
			userSearch.setAccountNumber(users[counter].getAccountNumber()); //node 23 use[counter]
		}
		//sending all account number of accountants
		for(int counter = 0; counter < 2; counter++) {  //node 25 def[counter]
			accountantSearch.setAccountantId(accountants[counter].getAccountantId());   //node 27 use[counter]
		}
		//creating array to store holders id index
		int[] searchResult = new int[accountHolder];
		
		//creating object for transactions
		Transaction transactions[] = new Transaction[accountHolder];
		
		//transaction
		for(int count = 0; count < accountHolder; count++) {    //node 29   def[count]
			//getting account number to perform
			int[] newAccountNumber = new int[accountHolder];
			String newAccountNumberString = JOptionPane.showInputDialog(null, "Enter Account Number to Search: ");
			newAccountNumber[count] = Integer.parseInt(newAccountNumberString);
			
			//searching account number
			int counter = userSearch.searchAccountNumber(newAccountNumber[count]);  //node 31   def[counter]
			searchResult[count] = counter;
			
			//for valid id only
			if(counter != -1) {			// node 32
				//creating new transaction
				transactions[counter] = new Transaction();
				String newAccountantString = JOptionPane.showInputDialog(null, "Withdraw/Deposit Section !\nWelcome " + users[counter].getName() + " !\n"
						+ "Enter Accountant ID '" + accountants[0].getAccountantId() + "' or '" + accountants[1].getAccountantId() + "': ");
				int newAccountant = Integer.parseInt(newAccountantString);
				
				transactions[counter].setAccountantId(newAccountant);   //node 33
				transactions[counter].setPreviousBalance(users[counter].getAccountBalance());   //node 33
				transactions[counter].inputIsWithdraw();    //node 33
				//withdraw
				if(transactions[counter].getIsWithdraw() == true) { //node 34
					transactions[counter].inputTransactionBalance();    //node 35
					users[counter].withdraw(transactions[counter].getTransactionBalance()); //node 35 use[counter],user[count]
				}
				//deposit
				else {
					transactions[counter].inputTransactionBalance(); //node 36
					users[counter].deposit(transactions[counter].getTransactionBalance());  //node 36
				}
			}
			else {
				//if account doesn't exist
				JOptionPane.showMessageDialog(null, "Invalid Account Number !");
			}
		}
		//printing info
		for(int counter = 0; counter < accountHolder; counter++) {  //node 39   def[counter]
			if(searchResult[counter] != -1) {   //node 41
				users[counter].printAccountNumber(); //node 43   
				transactions[counter].printTransactionId(); //node 43
				accountants[transactions[counter].getAccountantId()-1].printName();//node 43
				transactions[counter].printAccountantId();//node 43
				transactions[counter].printPreviousBalance();//node 43
				transactions[counter].printIsWithdraw();//node 43
				transactions[counter].printTransactionBalance();//node 43
				users[counter].printAccountBalance();//node 43 use[counter]
			}
			else {
				users[counter].printAccountNumber();
				JOptionPane.showMessageDialog(null, "Transaction Failed !");    //node 44
			}
		}
		//finding transaction by accountant id
		String newAccountantString = JOptionPane.showInputDialog(null, "Enter Accountant ID: ");
		int newAccountant = Integer.parseInt(newAccountantString);
		//searching accountant
		int count = accountantSearch.searchAccountNumber(newAccountant);    //node 45   def[count]
		
		try{
			if(count != -1) {   //node 46
				System.out.println("\n==Accountant Info==");
				accountants[count].printName(); 
				accountants[count].printPhone();
				
				//counting total transactions under this accountant
				int countTransactions = 0;      //node 48 def[countTransactions]
				for(int counter = 0; counter < accountHolder; counter++) {  //node 48 def[counter]
					if(newAccountant == transactions[counter].getAccountantId()) {
						countTransactions++; //node 53 use[countTransactions], use[counter]
					}
				}
				//System.out.println("\nTotal " + countTransactions + " transactions found by " + accountants[count].getName());
				JOptionPane.showMessageDialog(null, "Total " + countTransactions + " transactions found by \n" + accountants[count].getName());
				
				if(countTransactions != 0) {    //node 54
					System.out.println("\n==Transactions==");
					for(int counter = 0; counter < accountHolder; counter++) {  //node 58   def[counter]
						if(newAccountant == transactions[counter].getAccountantId()) {  
							users[counter].printAccountNumber();    //node 60
							transactions[counter].printTransactionId(); //node 60
							transactions[counter].printPreviousBalance();   //node 60
							transactions[counter].printIsWithdraw();    //node 60
							transactions[counter].printTransactionBalance();    //node 60
							users[counter].printAccountBalance();   //node 60 use[counter]
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
		for(int counts = 0; counts < accountHolder; counts++) { //node 61 def[counts]
			//getting account number to perform
			int[] newAccountNumber = new int[accountHolder];
			String newAccountNumberString = JOptionPane.showInputDialog(null, "Enter Account Number to Search: ");
			newAccountNumber[count] = Integer.parseInt(newAccountNumberString);
			
			//searching account number
			int counter = userSearch.searchAccountNumber(newAccountNumber[count]);  //node 64 def[counter]
			searchResult[count] = counter;
			
			//for valid id only
			if(counter != -1) { 
				String newHotKey = JOptionPane.showInputDialog(null, "Enter '1' for Auto Loan or '2' for Manual: ");
				int hotKey = Integer.parseInt(newHotKey);
				if(hotKey == 1) {   //node 66
					users[counter].recieveLoan();   //node 67
				}
				else {
					String newBalance = JOptionPane.showInputDialog(null, "Enter Amount to Loan: ");
					double balance = Double.parseDouble(newBalance);    //node 68
					users[counter].recieveLoan(balance);    //node 68
				}
			}
			else {
				//if account doesn't exist
				JOptionPane.showMessageDialog(null, "Invalid Account Number !");
			}
		}
		//printing info
		for(int counter = 0; counter < accountHolder; counter++) {  //node 69 def[counter]
			if(searchResult[counter] != -1) {   //node 71
				users[counter].printAccountNumber();    //node 73
				users[counter].printAccountBalance();   //ndde73 use[counter]
			}
			else {
				users[counter].printAccountNumber();    //node 72
				JOptionPane.showMessageDialog(null, "Loan Failed !");   //nodd 72
			}
		}
		
	}
	
}