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
public class LocalAccountHolderTest {
    double withdrawBalance;
    LocalAccountHolder instance;
    
    
    public LocalAccountHolderTest() {
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
    }
    
    @After
    public void tearDown() {
        instance=null;
    }

    @Test
    public void testWithdrawWhileLess(){
        //System.out.println("withdraw");
        try {
            double expected=instance.accountBalance=5000;
            assertTrue(instance.withdraw(400));        
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
   
    }
    @Test
    public void testWithdrawWhileGreater(){
        
        try {
            double expected=instance.accountBalance=5000;
            assertFalse(instance.withdraw(6000));
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
   
    }
    @Test
    public void testWithdrawWhileZero(){
        //System.out.println("withdraw");
        try {
            double expected=instance.accountBalance=5000;
            assertTrue(instance.withdraw(0));
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }       
   
    }
    @Test
    public void testWithdrawWhileNeg(){
        //System.out.println("withdraw");
        try {
            double expected=instance.accountBalance=5000;
            assertFalse(instance.withdraw(-500));
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }   
   
    }
}
