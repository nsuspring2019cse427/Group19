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

/**
 *
 * @author YEN_NISA
 */
public class SavingsAccountHolderTest {
    
    
    
    @InjectMocks
    SavingsAccountHolder ins= new SavingsAccountHolder();
    
    @Mock
    SavingsAccountHolder acc;
    
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
    }
    
    @After
    public void tearDown() {
    }

    //mockito
    
    @Test
    public void mockitoTestRcvInterest()
    {
        try {
            acc.setAccountBalance(1000.0);
                when(acc.recieveInterest(2.5)).thenReturn(25.0);
                verify(acc).recieveInterest(2.5);
        } catch (Exception e) {
        }
            
                        
    }
    
    @Test
    public void mockitoTestRcvInterest1()
    {
        try {
            acc.setAccountBalance(1000.0);
                when(acc.recieveInterest(0.0)).thenReturn(0.0);
                verify(acc).recieveInterest(0.0);
        } catch (Exception e) {
        }
            
                        
    }
    
    @Test
    public void mockitoTestRcvInterest2()
    {
        try {
            acc.setAccountBalance(1000.0);
                when(acc.recieveInterest(-1.0)).thenReturn(0.0);
                verify(acc).recieveInterest(0.0);
        } catch (Exception e) {
        }
            
                        
    }

    
    
}
