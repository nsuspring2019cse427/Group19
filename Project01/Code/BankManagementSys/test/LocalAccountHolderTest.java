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
            instance.accountBalance=5000;
        instance.withdraw(400);
        System.out.println("Withdraw works while withdraw balance is greater than account balance as supposed");
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
   
    }
    @Test
    public void testWithdrawWhileGreater(){
        //System.out.println("withdraw");
        try {
            instance.accountBalance=5000;
        instance.withdraw(6000);
        System.out.println("Withdraw shows warning as withdraw balance is greater");
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
   
    }
    @Test
    public void testWithdrawWhileZero(){
        //System.out.println("withdraw");
        try {
            instance.accountBalance=5000;
        instance.withdraw(0);
        System.out.println("Withdraw continuw as zero");
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
   
    }
    @Test
    public void testWithdrawWhileNeg(){
        //System.out.println("withdraw");
        try {
            instance.accountBalance=5000;
        instance.withdraw(-500);
        fail("negative value. so test was suppossed to be failed here");
        } catch (Exception e) {
            
        }
   
    }

    

    
    
}
