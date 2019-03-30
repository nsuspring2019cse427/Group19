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

/**
 *
 * @author YEN_NISA
 */
public class ForeignAccountHolderTest {
    
    private ForeignAccountHolder chkFa;
    double withdrawBalance = 0.0;
    double requestedLoanAmount = 0.0;
    int interestPercentage = 0;
    
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
        chkFa=new ForeignAccountHolder();
    }
    
    @After
    public void tearDown() {
        chkFa=null;
    }

    @Test
    public void testWithdraw() {
        try {
            chkFa.withdraw(withdrawBalance);
            System.out.println("withdraw works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
        
    }


    @Test
    public void testRecieveLoandbl() {
        try {
            chkFa.recieveLoan(requestedLoanAmount);
            System.out.println("Recieve Loan works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
        
    }

    @Test
    public void testRecieveInterest() {
        try {
            chkFa.recieveInterest(interestPercentage);
            System.out.println("Recieve Interest works ");
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
    }

    @Test
    public void testRecieveLoanWithoutParameter() {
        try {
            chkFa.recieveLoan();
            System.out.println("recieveLoan works ");
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
        
    }

    @Test
    public void testRecieveLoanWithParameter() {
        try {
            chkFa.recieveLoan(requestedLoanAmount);
            System.out.println("recieveLoan with parameter works ");
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
        
    }

    @Test
    public void testPrintInterestBalance() {
        try {
            chkFa.printInterestBalance();
            System.out.println("printInterestBalance works ");
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
    }

    @Test
    public void testPrintLoanBalance() {
        try {
            chkFa.printLoanBalance();
            System.out.println("printLoanBalance works ");
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
    }

    /**
     * Test of recieveLoan method, of class ForeignAccountHolder.
     */
    @Test
    public void testRecieveLoan_0args() {
        try {
            chkFa.recieveLoan();
            System.out.println("recieveLoan");
        } catch (Exception e) {
            fail("Received Loan without parameter doesn't work");
        }
        
    }

    /**
     * Test of recieveLoan method, of class ForeignAccountHolder.
     */
    @Test
    public void testRecieveLoan_double() {
        try {
            chkFa.recieveLoan(requestedLoanAmount);
            System.out.println("recieveLoan");
        } catch (Exception e) {
            fail("Received Loan with parameter works");
        }
        
    }
   
    
}
