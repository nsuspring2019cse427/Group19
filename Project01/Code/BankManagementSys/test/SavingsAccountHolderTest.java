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
public class SavingsAccountHolderTest {
    
    public SavingsAccountHolderTest() {
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
     * Test of recieveInterest method, of class SavingsAccountHolder.
     */
    @Test
    public void testRecieveInterest() {
        System.out.println("recieveInterest");
        int interestPercentage = 0;
        SavingsAccountHolder instance = new SavingsAccountHolder();
        instance.recieveInterest(interestPercentage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printInterestBalance method, of class SavingsAccountHolder.
     */
    @Test
    public void testPrintInterestBalance() {
        System.out.println("printInterestBalance");
        SavingsAccountHolder instance = new SavingsAccountHolder();
        instance.printInterestBalance();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
