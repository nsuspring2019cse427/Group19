/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

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
    
    
    //mockito
    @Test
    public void mockitoTestAccBalance()
    {
        try {
            acc.setAccountBalance(1000.0);           
            
                when(acc.getAccountBalance()).thenReturn(1000.0);    
               
        } catch (Exception e) {
            fail("Problem here");
        }               
    }
    
    @Test
    public void mockitoTestAccBalance1()
    {
        try {
            acc.setAccountBalance(-1000.0);           
            
                when(acc.getAccountBalance()).thenReturn(0.0);               
               
        } catch (Exception e) {
            fail("Problem here");
        }               
    }
    
    @Test
    public void mockitoTestAccBalance2()
    {
        try {
            acc.setAccountBalance(0);           
            
                when(acc.getAccountBalance()).thenReturn(0.0);               
               
        } catch (Exception e) {
            fail("Problem here");
        }               
    }
    
    @Test
    public void mockitoTestAccNumber()
    {
        try {
            acc.setAccountNumber(1);           
            
                when(acc.getAccountNumber()).thenReturn(1);               
               
        } catch (Exception e) {
        }               
    }
    
    @Test
    public void mockitoTestAccNumber1()
    {
        try {
            acc.setAccountNumber(-1);           
            
                when(acc.getAccountNumber()).thenReturn(0);               
               
        } catch (Exception e) {
        }               
    }
    @Test
    public void mockitoTestAccNumber2()
    {
        try {
            acc.setAccountNumber(0);           
            
                when(acc.getAccountNumber()).thenReturn(0);               
               
        } catch (Exception e) {
        }               
    }
    
}
