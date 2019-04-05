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
    
        Accountant instance;
    
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
        instance=new Accountant();
    }
    
    @After
    public void tearDown() {
        instance=null;
    }

    

    @Test
    public void testGetAccountantId() {
        int expResult = 1;
        instance.accountantId=1;
        int result = instance.getAccountantId();    
        try {
            assertEquals(expResult, result);
        } catch (Exception e) {
            fail("Problem in this GetAccountId method");
        }
        
        
    }

    
    
}
