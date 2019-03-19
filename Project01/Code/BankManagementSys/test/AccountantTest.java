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
public class AccountantTest {
    
    private Accountant chkAcc;
    int accountantId = 0;
    int expResult = 0;
    
    public AccountantTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        chkAcc= new Accountant();
    }
    
    @After
    public void tearDown() {
        chkAcc=null;
    }

    
    //Test of setAccountantId method,
    
    @Test
    public void testSetAccountantId() {
        try {
            chkAcc.setAccountantId(accountantId);
            System.out.println("Account Id works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
        
    }


    
    // Test of printAccountantId method, of class Accountant.
     
    @Test
    public void testPrintAccountantId() {
        try {
            chkAcc.printAccountantId();
            System.out.println("Print AccountantId works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
    }

    @Test
    public void testGetAccountantId() {
        try {
             
            int result = chkAcc.getAccountantId();
            assertEquals(expResult, result);
            System.out.println("getAccountantId works");
        } catch (Exception e) {
            fail("Problem here in this method");
        }
    }
    
}
