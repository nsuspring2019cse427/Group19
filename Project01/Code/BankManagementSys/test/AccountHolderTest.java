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
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author Yen
 */

@RunWith(MockitoJUnitRunner.class)

public class AccountHolderTest {
    AccountHolder instance ;
    
    
    @InjectMocks
    AccountHolder ins= new AccountHolder();
    
    @Mock
    AccountHolder acc;
    
    
    
    public AccountHolderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new AccountHolder();
    }
    
    @After
    public void tearDown() {
        instance=null;
    }

    @Test
    public void MockTest()
    {
        acc.setAccountBalance(500.00);
        
    }

    @Test
    public void testGetAccountNumber() {
        
        
        try {
            int expResult = 1;
        instance.setAccountNumber(1);
        int result = instance.getAccountNumber();
        assertEquals(expResult, result);
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
    }


    @Test
    public void testGetAccountBalance() {
        
        try {
            instance.setAccountBalance(1000.0);
        double expResult = 1000.0;
        double result = instance.getAccountBalance();
        assertEquals(expResult, result, 1000.0);
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testGetAccountBalanceForNeg() {
        
        try {
            instance.setAccountBalance(-1000.0);
        double expResult = 0;
        double result = instance.getAccountBalance();
        assertEquals(expResult, result, -1000.0);
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
    }
    
}
