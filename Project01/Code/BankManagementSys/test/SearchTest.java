/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
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
    int gettingAccountNumber = 0;
    int searchAccountNumber = 0;
    private Search search;
    
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
        search=new Search(searchAccountNumber);
        
    }
    
    @After
    public void tearDown() {
        search=null;
    }

    @Test
    public void testSetAccountNumber() {
        try {
            search.setAccountNumber(gettingAccountNumber);
            System.out.println("setAccountNumber works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
    }

    @Test
    public void testSetAccountantId() {
        try {
            search.setAccountNumber(gettingAccountNumber);
            System.out.println("setAccountantId works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
    }

    @Test
    public void testSearchAccountNumber() {
        try {
            int expResult=0;
            int result=search.searchAccountNumber(searchAccountNumber);
           // assertNotEquals(expResult, result);
            assertThat(result, is(not(equalTo(expResult)))); //for hamcrest library I can use this
            System.out.println("setAccountantId works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
    }
    
}
