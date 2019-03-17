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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of withdraw method, of class LocalAccountHolder.
     */
    @Test
    public void testWithdraw() {
        System.out.println("withdraw");
        double withdrawBalance = 0.0;
        LocalAccountHolder instance = new LocalAccountHolder();
        instance.withdraw(withdrawBalance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recieveLoan method, of class LocalAccountHolder.
     */
    @Test
    public void testRecieveLoan_0args() {
        System.out.println("recieveLoan");
        LocalAccountHolder instance = new LocalAccountHolder();
        instance.recieveLoan();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recieveLoan method, of class LocalAccountHolder.
     */
    @Test
    public void testRecieveLoan_double() {
        System.out.println("recieveLoan");
        double loanAmount = 0.0;
        LocalAccountHolder instance = new LocalAccountHolder();
        instance.recieveLoan(loanAmount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printLoanBalance method, of class LocalAccountHolder.
     */
    @Test
    public void testPrintLoanBalance() {
        System.out.println("printLoanBalance");
        LocalAccountHolder instance = new LocalAccountHolder();
        instance.printLoanBalance();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
