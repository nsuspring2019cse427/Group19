/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author YEN_NISA
 */
public class ForeignAccountHolderTest {
    double withdrawBalance;
    double requestedLoanAmount;
    int interestPercentage;
    ForeignAccountHolder instance;
    
    public ForeignAccountHolderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new ForeignAccountHolder();
    }
    
    @After
    public void tearDown() {
        instance=null;
    }

    @Test
    public void testWithdrawWhileGreater() {
      //  
        try {
           // withdrawBalance = 550;
            ForeignAccountHolder instance = new ForeignAccountHolder();
            instance.withdraw(550);
            System.out.println("withdraw method works while withdrawBalance = 550 greater than max shows warning");
        } catch (Exception e) {
            fail("Withdraw method doesn't work ");
        }
        
    }
    @Test
    public void testWithdrawWhileLess() {
      //  
        try {
           // withdrawBalance = 550;
            ForeignAccountHolder instance = new ForeignAccountHolder();
            instance.withdraw(50);
            System.out.println("withdraw method works while withdrawBalance = 50 less than max shows warning");
        } catch (Exception e) {
            fail("Withdraw method doesn't work ");
        }
        
    }
    @Test
    public void testWithdrawWhileNeg() {
      //  
        try {
           // withdrawBalance = 550;
            ForeignAccountHolder instance = new ForeignAccountHolder();
            instance.withdraw(-50);
            fail("withdraw works while ReceivedLoan = -50 means negative which wasn't supposed");
        } catch (Exception e) {
            
        }
        
    }
    @Test
    public void testWithdraw_WhileZero() {
       
       
        try {
          //  requestedLoanAmount = 550;
            
            instance.withdraw(0);
            System.out.println("withdraw works while ReceivedLoan = 0 which wasn't supposed");
        } catch (Exception e) {
            fail("received loan method doesn't work ");
        }
    }
    @Test
    public void testRecieveLoan_doubleWhileGreater() {
       
       
        try {
          //  requestedLoanAmount = 550;
            ForeignAccountHolder instance = new ForeignAccountHolder();
            instance.recieveLoan(550);
            System.out.println("received loan method works while ReceivedLoan = 550 greater than max shows warning");
        } catch (Exception e) {
            fail("received loan method doesn't work ");
        }
    }
    @Test
    public void testRecieveLoan_doubleWhileLess() {
       
       
        try {
          //  requestedLoanAmount = 550;
            ForeignAccountHolder instance = new ForeignAccountHolder();
            instance.recieveLoan(50);
            System.out.println("received loan works while ReceivedLoan = 50 Less than max");
        } catch (Exception e) {
            fail("received loan method doesn't work ");
        }
    }
    @Test
    public void testRecieveLoan_doubleWhileZero() {
       
       
        try {
          //  requestedLoanAmount = 550;
            ForeignAccountHolder instance = new ForeignAccountHolder();
            instance.recieveLoan(0);
            System.out.println("received loan works while ReceivedLoan = 0 which wasn't supposed");
        } catch (Exception e) {
            fail("received loan method doesn't work ");
        }
    }
    @Test
    public void testRecieveLoan_doubleWhileNeg() {
       
       
        try {
          //  requestedLoanAmount = 550;
            ForeignAccountHolder instance = new ForeignAccountHolder();
            instance.recieveLoan(-50);
            fail("received loan works while ReceivedLoan = -50 means negative which wasn't supposed");
        } catch (Exception e) {
            
        }
    }


    
    
}
