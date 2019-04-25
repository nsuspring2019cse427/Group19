/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collection;
import static org.hamcrest.CoreMatchers.equalTo;
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
public class PersonTest {
    
        Person instance;
        
    @InjectMocks
    Person ins= new Person();
    
    @Mock
    Person acc;
    
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
        String expResult = "01969279140";
        instance.setPhone("01969279140");
        String result = instance.getPhone();
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
        String expResult = "01969279140";
        instance.setPhone("01969279140");
        String result = instance.getPhone();
        try {
            assertThat(expResult,equalTo(result));
        } catch (Exception e) {
            fail("Problem in GetPhone method ");
        }
        
    }

    
    //mockito
    @Test
    public void mockitoTestName()
    {
        try {
            acc.setName("abc");
            
            
                when(acc.getName()).thenReturn("abc");
                
                Assert.assertEquals(acc.getName(), "abc");
                
                verify(acc).setName("abc");
        } catch (Exception e) {
        }
            
                        
    }
    
    @Test
    public void mockitoTestName1()
    {
        try {
            acc.setName(null);
            
            
                when(acc.getName()).thenReturn(null);
                
                Assert.assertEquals(acc.getName(), null);
                
                verify(acc).setName(null);
        } catch (Exception e) {
        }
            
                        
    }
    

    
}
