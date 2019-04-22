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


public class LocalAccountHolderTest {
    double withdrawBalance;
    LocalAccountHolder instance;
    private int expectedVal;
    private int resultVal;
    
    
//    public LocalAccountHolderTest() {
//    }
    public LocalAccountHolderTest(boolean expected,int resultValue){
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
         instance = new LocalAccountHolder();
         instance.setAccountBalance(1000.0);
    }
    
    @After
    public void tearDown() {
        instance=null;
    }

    @Test
    public void testWithdrawWhileLess(){
        //System.out.println("withdraw");
        try {
            
            assertTrue(instance.withdraw(400));        
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
   
    }
    @Test
    public void testWithdrawWhileGreater(){
        
        try {
            
            assertFalse(instance.withdraw(6000));
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
   
    }
    @Test
    public void testWithdrawWhileZero(){
        //System.out.println("withdraw");
        try {
            assertTrue(instance.withdraw(0));
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }       
   
    }
    @Test
    public void testWithdrawWhileNeg(){
        //System.out.println("withdraw");
        try {
            assertFalse(instance.withdraw(-500));
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }   
   
    }
    
    
    //parameterized
    
    @Parameters
    public static Collection<Object[]> testData()
    {
        
        Object[][] data=new Object[][]{{true,400},{false,6000},{true,0},{false,-500}};
        return Arrays.asList(data);
    }
    @Test
    public void testWithdrawWithParameterized()
    {
        instance.setAccountBalance(1000.0);
        
        assertTrue(instance.withdraw(resultVal));
    }
}
