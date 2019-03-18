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
 * @author Yen
 */
public class PersonTest {
    
    private Person person;
    String name = "";
    String expResult = "";
    String result;
    int phone = 0;
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
        person=new Person();
    }
    
    @After
    public void tearDown() {
        person=null;
    }

    /**
     * Test of setName method, of class Person.
     */
    @Test
    public void testSetName() {
        try {
            person.setName(name);
            System.out.println("setName works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
    }

    /**
     * Test of getName method, of class Person.
     */
    @Test
    public void testGetName() {
        try {
            result = person.getName();
            assertEquals(expResult, result);
            System.out.println("getName works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
    }

    /**
     * Test of setPhone method, of class Person.
     */
    @Test
    public void testSetPhone() {
        try {
            person.setPhone(phone);
            System.out.println("setPhone works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
    }

    /**
     * Test of getPhone method, of class Person.
     */
    @Test
    public void testGetPhone() {
        
        
        try {
            int expRes=0;
            int res=person.getPhone();
            assertEquals(expRes, res);
            System.out.println("getPhone works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
    }

    /**
     * Test of inputName method, of class Person.
     */
    @Test
    public void testInputName() {
        try {
            person.inputName();
            System.out.println("inputName works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
        
    }

    /**
     * Test of inputPhone method, of class Person.
     */
    @Test
    public void testInputPhone() {
        try {
            person.inputPhone();
            System.out.println("inputPhone works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
    }

    /**
     * Test of printName method, of class Person.
     */
    @Test
    public void testPrintName() {
        try {
            person.printName();
            System.out.println("printName works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
        
    }

    /**
     * Test of printPhone method, of class Person.
     */
    @Test
    public void testPrintPhone() {
        try {
            person.printPhone();
            System.out.println("printPhone works"); 
            
        } catch (Exception e) {
            fail("Problem here in this method");
        }
    }
    
}
