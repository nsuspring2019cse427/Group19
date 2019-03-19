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
    
    int interestPercentage = 0;
    private SavingsAccountHolder chkSAH;
    
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
        chkSAH=new SavingsAccountHolder();
    }
    
    @After
    public void tearDown() {
        chkSAH=null;
    }

    /**
     * Test of recieveInterest method, of class SavingsAccountHolder.
     */
    @Test
    public void testRecieveInterest() {
        try {
            chkSAH.recieveInterest(interestPercentage);
            System.out.println("recieveInterest works in SAH class");
        } catch (Exception e) {
            fail("Problem in this method of SAH class");
        }
        
    }

    /**
     * Test of printInterestBalance method, of class SavingsAccountHolder.
     */
    @Test
    public void testPrintInterestBalance() {
        try {
            chkSAH.printInterestBalance();
            System.out.println("printInterestBalance works in SAH class");
        } catch (Exception e) {
            fail("Problem in this method of SAH class");
        }
        
    }
    
}
