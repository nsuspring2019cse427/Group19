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
        instance.name="farhan";
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
        instance.name=null;
        String result=instance.getName();
        try {
            assertEquals(expResult, result);
        } catch (Exception e) {
            fail("Problem in GetName method while null");
        }
        
    }
    @Test
    public void testGetPhone() {
        int expResult = 1234567;
        instance.phone=1234567;
        int result = instance.getPhone();
        try {
            assertEquals(expResult, result);
        } catch (Exception e) {
            fail("Problem in GetPhone method ");
        }
        
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Person instance = new Person();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        int phone = 0;
        Person instance = new Person();
        instance.setPhone(phone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testInputName() {
        System.out.println("inputName");
        Person instance = new Person();
        instance.inputName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testInputPhone() {
        System.out.println("inputPhone");
        Person instance = new Person();
        instance.inputPhone();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testPrintName() {
        System.out.println("printName");
        Person instance = new Person();
        instance.printName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testPrintPhone() {
        System.out.println("printPhone");
        Person instance = new Person();
        instance.printPhone();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
