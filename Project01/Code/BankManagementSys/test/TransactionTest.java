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
    int transactionId = 0;
    int accountNumber = 0;
    int accountantId = 0;
    double previousBalance = 0.0;
    boolean isWithdraw = false;
    double transactionBalance = 0.0;
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
            assertNotEquals(expResult, result);
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
          //  boolean expRes=false;
          //  boolean result=trans.getIsWithdraw();
          //  assertEquals(expRes, result);
            assertFalse(trans.getIsWithdraw());
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

    @Test
    public void testSetTransactionId() {
        try {
            trans.setTransactionId(transactionId);
            System.out.println("setTransactionId works in Transaction class");
        } catch (Exception e) {
            fail("Problem here in setTransactionId method");
        }
    }

    @Test
    public void testSetAccountNumber() 
    {
        try {
            trans.setAccountNumber(accountNumber);
            System.out.println("setAccountNumber works in Transaction class");
        } catch (Exception e) {
            fail("Problem here in setAccountNumber method");
        }
    }

    @Test
    public void testSetAccountantId() {
        try {
            trans.setAccountantId(accountantId);
            System.out.println("setAccountantId works in Transaction class");
        } catch (Exception e) {
            fail("Problem here in setAccountantId method");
        }
    }

    @Test
    public void testSetPreviousBalance() {
        try {
            trans.setPreviousBalance(previousBalance);
            System.out.println("setPreviousBalance works in Transaction class");
        } catch (Exception e) {
            fail("Problem here in setPreviousBalance method");
        }
    }

    @Test
    public void testSetIsWithdraw() {
        try {
            trans.setIsWithdraw(isWithdraw);
            System.out.println("setIsWithdraw works in Transaction class");
        } catch (Exception e) {
            fail("Problem here in setIsWithdraw method");
        }
    }

    @Test
    public void testSetTransactionBalance() {
        try {
            trans.setTransactionBalance(transactionBalance);
            System.out.println("setTransactionBalance works in Transaction class");
        } catch (Exception e) {
            fail("Problem here in setTransactionBalance method");
        }
    }

    @Test
    public void testInputIsWithdraw() {
        try {
            trans.inputIsWithdraw();
            System.out.println("inputIsWithdraw works in Transaction class");
        } catch (Exception e) {
            fail("Problem here in inputIsWithdraw method");
        }
    }

    @Test
    public void testInputPreviousBalance() {
        try {
            trans.inputPreviousBalance();
            System.out.println("inputPreviousBalance works in Transaction class");
        } catch (Exception e) {
            fail("Problem here in inputPreviousBalance method");
        }
    }

    @Test
    public void testInputTransactionBalance() {
        try {
            trans.inputTransactionBalance();
            System.out.println("inputTransactionBalance works in Transaction class");
        } catch (Exception e) {
            fail("Problem here in inputTransactionBalance method");
        }
    }

    @Test
    public void testInputAccountNumber() {
        try {
            trans.inputAccountNumber();
            System.out.println("inputAccountNumber works in Transaction class");
        } catch (Exception e) {
            fail("Problem here in inputAccountNumber method");
        }
        
    }

    @Test
    public void testInputAccountantId() {
        try {
            trans.inputAccountantId();
            System.out.println("inputAccountantId works in Transaction class");
        } catch (Exception e) {
            fail("Problem here in inputAccountantId method");
        }
    }

    @Test
    public void testPrintTransactionId() {
         try {
            trans.printTransactionId();
            System.out.println("printTransactionId works in Transaction class");
        } catch (Exception e) {
            fail("Problem here in printTransactionId method");
        }
        
    }

    @Test
    public void testPrintIsWithdraw() {
        try {
            trans.printIsWithdraw();
            System.out.println("printIsWithdraw works in Transaction class");
        } catch (Exception e) {
            fail("Problem here in printIsWithdraw method");
        }
        
    }

    @Test
    public void testPrintPreviousBalance() {
        try {
            trans.printPreviousBalance();
            System.out.println("printPreviousBalance works in Transaction class");
        } catch (Exception e) {
            fail("Problem here in printPreviousBalance method");
        }
        
    }

    @Test
    public void testPrintTransactionBalance() {
        try {
            trans.printTransactionBalance();
            System.out.println("printTransactionBalance works in Transaction class");
        } catch (Exception e) {
            fail("Problem here in printTransactionBalance method");
        }
       
    }

    @Test
    public void testPrintAccountNumber() {
        try {
            trans.printAccountNumber();
            System.out.println("printAccountNumber works in Transaction class");
        } catch (Exception e) {
            fail("Problem here in printAccountNumber method");
        }
        
    }

    @Test
    public void testPrintAccountantId() {
        try {
            trans.printAccountantId();
            System.out.println("printAccountantId works in Transaction class");
        } catch (Exception e) {
            fail("Problem here in testPrintAccountantId method");
        }
        
    }

}
