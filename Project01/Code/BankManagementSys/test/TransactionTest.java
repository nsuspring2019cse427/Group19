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
public class TransactionTest {
    
    int expResult = 0;
    double expResDbl = 0.0;
    private Transaction trans;
    
    public TransactionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        trans=new Transaction();
    }
    
    @After
    public void tearDown() {
    }

    

    @Test
    public void testGetTransactionId() {
        try {
            int result=trans.getTransactionId();
            assertEquals(expResult, result);
            System.out.println("getTransactionId works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
    }

    @Test
    public void testGetAccountNumber() {
        try {
            int result=trans.getAccountNumber();
            assertEquals(expResult, result);
            System.out.println("getAccountNumber works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
    }

    

    @Test
    public void testGetAccountantId() {
        try {
            int result=trans.getAccountantId();
            assertEquals(expResult, result);
            System.out.println("getAccountantId works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
    }

    

    @Test
    public void testGetPreviousBalance() {
        try {
            double result=trans.getPreviousBalance();
            assertEquals(expResult, result, 0.0);
            System.out.println("getPreviousBalance works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
    }


    @Test
    public void testGetIsWithdraw() {
        try {
            boolean expRes=false;
            boolean result=trans.getIsWithdraw();
            assertEquals(expRes, result);
            System.out.println("getIsWithdraw works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
    }


    @Test
    public void testGetTransactionBalance() {
        try {
            
            double result = trans.getTransactionBalance();
            assertEquals(expResDbl, result, 0.0);
            System.out.println("getTransactionBalance works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
    }

}
