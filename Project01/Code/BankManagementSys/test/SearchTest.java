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
public class SearchTest {
    
    public SearchTest() {
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
    public void testSetAccountNumber() {
        System.out.println("setAccountNumber");
        int gettingAccountNumber = 0;
        Search instance = null;
        instance.setAccountNumber(gettingAccountNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetAccountantId() {
        System.out.println("setAccountantId");
        int gettingAccountNumber = 0;
        Search instance = null;
        instance.setAccountantId(gettingAccountNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSearchAccountNumber() {
        System.out.println("searchAccountNumber");
        int searchAccountNumber = 0;
        Search instance = null;
        int expResult = 0;
        int result = instance.searchAccountNumber(searchAccountNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
