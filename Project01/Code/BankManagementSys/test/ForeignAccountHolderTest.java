/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

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
        instance.accountBalance=1000;
        instance.totalWithdrawAmount=0;
        instance.maxWithdrawAmount=500;
        
        try {
            assertTrue(instance.withdrawBool(400));//less than max withdraw amount
        } catch (Exception e) {
        }
    }
    
    @Test
    public void testWithdraw1()
    {
        instance.accountBalance=1000;
        instance.totalWithdrawAmount=0;
        instance.maxWithdrawAmount=500;
        
        try {
            assertFalse(instance.withdrawBool(600));//greater than max withdraw amount
        } catch (Exception e) {
        }
    }
    
    
    //Parameterized tests
    
//    @Parameters
//    public static Collection<Object[]> testData()
//    {
//        Object[][] data=new Object[][]{{true,400},{true,500},{false,600}};
//        return Arrays.asList(data);
//    }
//    @Test
//    public void testWithdrawWithParameterized()
//    {
//        instance.accountBalance=1000;
//        instance.totalWithdrawAmount=0;
//        instance.maxWithdrawAmount=500;
//        assertEquals(expectedVal, instance.withdrawBool(resultVal));
//    }

}
