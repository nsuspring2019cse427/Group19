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
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSetTransactionId() {
        System.out.println("setTransactionId");
        int transactionId = 0;
        Transaction instance = new Transaction();
        instance.setTransactionId(transactionId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTransactionId() {
        System.out.println("getTransactionId");
        Transaction instance = new Transaction();
        int expResult = 0;
        int result = instance.getTransactionId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetAccountNumber() {
        System.out.println("setAccountNumber");
        int accountNumber = 0;
        Transaction instance = new Transaction();
        instance.setAccountNumber(accountNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAccountNumber() {
        System.out.println("getAccountNumber");
        Transaction instance = new Transaction();
        int expResult = 0;
        int result = instance.getAccountNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetAccountantId() {
        System.out.println("setAccountantId");
        int accountantId = 0;
        Transaction instance = new Transaction();
        instance.setAccountantId(accountantId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAccountantId() {
        System.out.println("getAccountantId");
        Transaction instance = new Transaction();
        int expResult = 0;
        int result = instance.getAccountantId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPreviousBalance() {
        System.out.println("setPreviousBalance");
        double previousBalance = 0.0;
        Transaction instance = new Transaction();
        instance.setPreviousBalance(previousBalance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPreviousBalance() {
        System.out.println("getPreviousBalance");
        Transaction instance = new Transaction();
        double expResult = 0.0;
        double result = instance.getPreviousBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetIsWithdraw() {
        System.out.println("setIsWithdraw");
        boolean isWithdraw = false;
        Transaction instance = new Transaction();
        instance.setIsWithdraw(isWithdraw);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetIsWithdraw() {
        System.out.println("getIsWithdraw");
        Transaction instance = new Transaction();
        boolean expResult = false;
        boolean result = instance.getIsWithdraw();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTransactionBalance() {
        System.out.println("setTransactionBalance");
        double transactionBalance = 0.0;
        Transaction instance = new Transaction();
        instance.setTransactionBalance(transactionBalance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTransactionBalance() {
        System.out.println("getTransactionBalance");
        Transaction instance = new Transaction();
        double expResult = 0.0;
        double result = instance.getTransactionBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testInputIsWithdraw() {
        System.out.println("inputIsWithdraw");
        Transaction instance = new Transaction();
        instance.inputIsWithdraw();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testInputPreviousBalance() {
        System.out.println("inputPreviousBalance");
        Transaction instance = new Transaction();
        instance.inputPreviousBalance();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testInputTransactionBalance() {
        System.out.println("inputTransactionBalance");
        Transaction instance = new Transaction();
        instance.inputTransactionBalance();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testInputAccountNumber() {
        System.out.println("inputAccountNumber");
        Transaction instance = new Transaction();
        instance.inputAccountNumber();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testInputAccountantId() {
        System.out.println("inputAccountantId");
        Transaction instance = new Transaction();
        instance.inputAccountantId();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testPrintTransactionId() {
        System.out.println("printTransactionId");
        Transaction instance = new Transaction();
        instance.printTransactionId();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testPrintIsWithdraw() {
        System.out.println("printIsWithdraw");
        Transaction instance = new Transaction();
        instance.printIsWithdraw();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testPrintPreviousBalance() {
        System.out.println("printPreviousBalance");
        Transaction instance = new Transaction();
        instance.printPreviousBalance();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testPrintTransactionBalance() {
        System.out.println("printTransactionBalance");
        Transaction instance = new Transaction();
        instance.printTransactionBalance();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testPrintAccountNumber() {
        System.out.println("printAccountNumber");
        Transaction instance = new Transaction();
        instance.printAccountNumber();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testPrintAccountantId() {
        System.out.println("printAccountantId");
        Transaction instance = new Transaction();
        instance.printAccountantId();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
