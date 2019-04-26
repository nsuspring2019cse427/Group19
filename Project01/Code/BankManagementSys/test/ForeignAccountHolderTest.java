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


@RunWith(Parameterized.class)

    
    
public class ForeignAccountHolderTest {
    
    private int expectedVal;
    private int resultVal;
    double withdrawBalance;
    double requestedLoanAmount;
    int interestPercentage;
    ForeignAccountHolder instance;
    
    @InjectMocks
    ForeignAccountHolder ins= new ForeignAccountHolder();
    
    @Mock
    ForeignAccountHolder acc;
    
    
    public ForeignAccountHolderTest(boolean expected,int resultValue) {
        this.expectedVal=expectedVal;
        this.resultVal=resultVal;
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new ForeignAccountHolder();
    }
    
    @After
    public void tearDown() {
        instance=null;
    }

    
    @Test
    public void testWithdraw()
    {
        
        instance.setAccountBalance(1000);
        instance.setAccountNumber(1); 
        
        try {
            assertTrue(instance.withdraw(400));//less than max withdraw amount
        } catch (Exception e) {
        }
    }
    
    @Test
    public void testWithdraw1()
    {
        instance.setAccountBalance(1000);
        
        try {
            assertFalse(instance.withdraw(600));//greater than max withdraw amount
        } catch (Exception e) {
        }
    }
    
    
    //Parameterized tests
    
    @Parameters
    public static Collection<Object[]> testData()
    {
        
        Object[][] data=new Object[][]{{true,400},{true,500},{false,600}};
        return Arrays.asList(data);
    }
    @Test
    public void testWithdrawWithParameterized()
    {
        instance.setAccountBalance(1000);
        instance.totalWithdrawAmount=0;
        instance.maxWithdrawAmount=500;
        assertTrue(instance.withdraw(resultVal));
    }
    
    //mockito
    
    @Test
    public void mockitoTest()
    {
        try {
            acc.setAccountBalance(1000.0);
            
                when(acc.withdraw(100.0)).thenReturn(true);
                
                Assert.assertEquals(acc.withdraw(100.0), true);
                
                verify(acc).withdraw(100.0);
        } catch (Exception e) {
        }
            
                        
    }
    
    @Test
    public void mockitoTest1()
    {
        try {
            acc.setAccountBalance(1000.0);
            
                when(acc.withdraw(-100.0)).thenReturn(false);
                
                Assert.assertEquals(acc.withdraw(-100.0), false);
                
                verify(acc).withdraw(100.0);
        } catch (Exception e) {
        }
            
                        
    }
    
    @Test
    public void mockitoTest2()
    {
        try {
            acc.setAccountBalance(1000.0);
            
                when(acc.withdraw(1000.0)).thenReturn(false);
                
                Assert.assertEquals(acc.withdraw(1000.0), false);
                
                verify(acc).withdraw(1000.0);
        } catch (Exception e) {
        }
            
                        
    }
    
    @Test
    public void mockitoTest3()
    {
        try {
            acc.setAccountBalance(1000.0);
            
                when(acc.withdraw(500.0)).thenReturn(true);
                
                Assert.assertEquals(acc.withdraw(500.0), true);
                
                verify(acc).withdraw(100.0);
        } catch (Exception e) {
        }
            
                        
    }
    
    

}
