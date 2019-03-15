/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author YEN_NISA
 */
public class AccountHolderTest {
    
    private AccountHolder chkAccountHolder;
    double withdrawBalance = 0.0;
    double loanAmount = 0.0;
    int accountNumber = 0;
    double accountBalance = 0.0;
    double depositBalance = 0.0;
    
    public AccountHolderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        chkAccountHolder = new AccountHolderImpl();
    }
    
    @After
    public void tearDown() throws Exception{
        chkAccountHolder=null;
    }

    
    //Test of withdraw method
     
    @Test
    public void testWithdraw() {
        
        try {
            chkAccountHolder.withdraw(withdrawBalance);
       System.out.println("withdraw works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
       
     
    }    
    // Test of recieveLoan method
    
    @Test
    public void testRecieveLoan() {
        try {
            chkAccountHolder.recieveLoan(loanAmount);
            System.out.println("recieveLoan works");
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }

    
   //Test of setAccountNumber method
     
    @Test
    public void testSetAccountNumber() {
        try {
            chkAccountHolder.setAccountNumber(accountNumber);
            System.out.println("setAccountNumber works");
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
        
    }


    
    //Test of setAccountBalance method
    
    @Test
    public void testSetAccountBalance() {
        try {
            chkAccountHolder.setAccountBalance(accountBalance);
            System.out.println("setAccountBalance");
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
    }


    
    //Test of inputAccountBalance method
    
    @Test
    public void testInputAccountBalance() {
        try {
            chkAccountHolder.inputAccountBalance();
            System.out.println("InputAccountBalance works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
        
    }

    
     //Test of printAccountNumber method
     
    @Test
    public void testPrintAccountNumber() {
        try {
            chkAccountHolder.printAccountNumber();
            System.out.println("PrintAccountNumber works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
        
    }

    
    //Test of printAccountBalance method
    
    @Test
    public void testPrintAccountBalance() {
        try {            
            System.out.println("printAccountBalance works");
            chkAccountHolder.printAccountBalance();
        } catch (Exception e) {
            fail("Problem here in this method");
        }
    }

    
    // Test of deposit method
     
    @Test
    public void testDeposit() {
        try {            
            System.out.println("deposit works");
            chkAccountHolder.deposit(depositBalance);
        } catch (Exception e) {
            fail("Problem here in this method");
        }
        
    }

    public class AccountHolderImpl extends AccountHolder {

        public void withdraw(double withdrawBalance) {
        }

        public void recieveLoan() {
        }

        public void recieveLoan(double loanAmount) {
        }
    }
    
}
