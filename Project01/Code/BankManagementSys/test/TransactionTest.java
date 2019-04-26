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
public class TransactionTest {
    Transaction instance ;
    
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
        instance= new Transaction();
    }
    
    @After
    public void tearDown() {
        instance=null;
    }

    
    @Test
    public void testGetAccountNumber() {
        
        try {
            instance.setAccountNumber(3);
        int expResult = 3;
        int result = instance.getAccountNumber();
        assertEquals(expResult, result);
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testGetAccountNumber1() {
        
        try {
            instance.setAccountNumber(-3);
        int expResult = 0;
        int result = instance.getAccountNumber();
        assertEquals(expResult, result);
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
        // TODO review the generated test code and remove the default call to fail.
        
    }


    @Test
    public void testGetAccountantId() {
        try {
            instance.setAccountantId(2);
        int expResult = 2;
        int result = instance.getAccountantId();
        assertEquals(expResult, result);
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testGetAccountantId1() {
        try {
            instance.setAccountantId(-2);
        int expResult = 0;
        int result = instance.getAccountantId();
        assertEquals(expResult, result);
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
        // TODO review the generated test code and remove the default call to fail.
        
    }



    @Test
    public void testGetPreviousBalance() {
        try {
            instance.setPreviousBalance(1000.0);
        double expResult = 1000.0;
        double result = instance.getPreviousBalance();
        assertEquals(expResult, result, 0.0);
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testGetPreviousBalance1() {
        try {
            instance.setPreviousBalance(-1000.0);
        double expResult = 0;
        double result = instance.getPreviousBalance();
        assertEquals(expResult, result, 0.0);
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
        // TODO review the generated test code and remove the default call to fail.
        
    }


    @Test
    public void testGetIsWithdraw() {
        try {
            instance.setIsWithdraw(true);
        boolean expResult = true;
        boolean result = instance.getIsWithdraw();
        assertEquals(expResult, result);
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testGetIsWithdraw1() {
        try {
            instance.setIsWithdraw(false);
        boolean expResult = false;
        boolean result = instance.getIsWithdraw();
        assertEquals(expResult, result);
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
        // TODO review the generated test code and remove the default call to fail.
        
    }


    @Test
    public void testGetTransactionBalance() {
        try {
            instance.setTransactionBalance(1000.0);
        double expResult = 1000.0;
        double result = instance.getTransactionBalance();
        assertEquals(expResult, result, 1000.0);
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testGetTransactionBalance1() {
        try {
            instance.setTransactionBalance(-1000.0);
        double expResult = 0;
        double result = instance.getTransactionBalance();
        assertEquals(expResult, result, 0.0);
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    
}
