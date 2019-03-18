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
 * @author Yen
 */
public class LocalAccountHolderTest {
    
    private LocalAccountHolder chkLA;
    double withdrawBalance = 0.0;
    double loanAmount = 0.0;
    
    public LocalAccountHolderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        chkLA= new LocalAccountHolder();
    }
    
    @After
    public void tearDown() {
        chkLA=null;
    }

    /**
     * Test of withdraw method, of class LocalAccountHolder.
     */
    @Test
    public void testWithdraw() {
        try {
            chkLA.withdraw(withdrawBalance);
            System.out.println("withdraw works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
        
    }

    

    /**
     * Test of recieveLoan method, of class LocalAccountHolder.
     */
    @Test
    public void testRecieveLoandbl() {
        try {
            chkLA.recieveLoan(loanAmount);
            System.out.println("recieveLoan works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
        
    }

    /**
     * Test of printLoanBalance method, of class LocalAccountHolder.
     */
    @Test
    public void testPrintLoanBalance() {
        try {
            chkLA.printLoanBalance();
            System.out.println("printLoanBalance works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
        
    }
    
}
