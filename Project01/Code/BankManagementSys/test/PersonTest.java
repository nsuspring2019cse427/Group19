/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.hamcrest.CoreMatchers.equalTo;
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
public class PersonTest {
    
        Person instance;
    
    public PersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance=new Person();
    }
    
    @After
    public void tearDown() {
        instance=null;
    }

    

    @Test
    public void testGetName() {
        String expResult = "farhan";
        instance.setName("farhan");
        String result=instance.getName();
        try {
            assertEquals(expResult, result);
        } catch (Exception e) {
            fail("Problem in GetName method");
        }
        
    }
    @Test
    public void testGetNameforNull() {
        String expResult = null;
        instance.setName(null);
        String result=instance.getName();
        try {
            assertEquals(expResult, result);
        } catch (Exception e) {
            fail("Problem in GetName method while null");
        }
        
    }
    @Test
    public void testGetPhone() {
        int expResult = 0;
        instance.setPhone(239279140);
        int result = instance.getPhone();
        try {
            assertEquals(expResult, result);
        } catch (Exception e) {
            fail("Problem in GetPhone method ");
        }
        
    }
    
    
    
    //Hamcrest
    @Test
    public void testGetNameHam() {
        String expResult = "farhan";
        instance.setName("farhan");
        String result=instance.getName();
        try {
            assertThat(expResult,equalTo(result));
        } catch (Exception e) {
            fail("Problem in GetName method");
        }
        
    }
    @Test
    public void testGetNameforNullHam() {
        String expResult = null;
        instance.setName(null);
        String result=instance.getName();
        try {
            assertThat(expResult,equalTo(result));
        } catch (Exception e) {
            fail("Problem in GetName method while null");
        }
        
    }
    @Test
    public void testGetPhoneHam() {
        int expResult = 0;
        instance.setPhone(1234567);
        int result = instance.getPhone();
        try {
            assertThat(expResult,equalTo(result));
        } catch (Exception e) {
            fail("Problem in GetPhone method ");
        }
        
    }

    
    

    
}
