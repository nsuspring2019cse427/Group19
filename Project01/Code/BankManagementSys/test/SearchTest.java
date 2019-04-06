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
public class SearchTest {
    Search instance;
    private int expectedVal;
    private int resultVal;
    
    public SearchTest(int expectedVal,int resultVal) {
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
        instance= new Search(10);
    }
    
    @After
    public void tearDown() {
        instance=null;
    }

    

    @Test
    public void testSearchAccountNumber1 () {
        instance.accountHolder=5;
        instance.accountNumber[0]=3;
        instance.accountNumber[1]=2;
        instance.accountNumber[2]=6;
        instance.accountNumber[3]=5;
        int expResult = 2;
        try {
            int result = instance.searchAccountNumber(6);
            assertEquals(expResult, result);
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception ");
        }
        
    }
    @Test()
    public void testSearchAccountNumber2 () {
        instance.accountHolder=7;
        instance.accountNumber[0]=3;
        instance.accountNumber[1]=2;
        instance.accountNumber[2]=6;
        instance.accountNumber[3]=5;
        int expResult = -1;
        try {
            int result = instance.searchAccountNumber(9);
            assertEquals(expResult, result);
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception ");
        }
        
    }
    @Test()
    public void testSearchAccountNumber3 () {
        //instance.accountHolder=0;
        
        int expResult = -1;
        try {
            int result = instance.searchAccountNumber(9);
            assertEquals(expResult, result);
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception ");
        }
        
    }
    
    
    //parameterized tests
    
    @Parameters
    public static Collection<Object[]> testData()
    {
        Object[][] data=new Object[][]{{0,5},{1,4}};
        return Arrays.asList(data);
    }
    @Test
    public void testSearchAccountNumberWithParameterized()
    {
        instance.accountHolder=5;
        assertEquals(-1, instance.searchAccountNumber(resultVal));//"empty list" check using parameterized
    }
    @Test
    public void testSearchAccountNumberWithParameterized1()
    {
        instance.accountHolder=5;
        instance.accountNumber[0]=5;
        instance.accountNumber[1]=4;
        assertEquals(expectedVal, instance.searchAccountNumber(resultVal));//existing value check using parameterized
    }
    

    
}

    

    

   


    

