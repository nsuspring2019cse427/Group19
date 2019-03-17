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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setName method, of class Person.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Person instance = new Person();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Person.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhone method, of class Person.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        int phone = 0;
        Person instance = new Person();
        instance.setPhone(phone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhone method, of class Person.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        Person instance = new Person();
        int expResult = 0;
        int result = instance.getPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inputName method, of class Person.
     */
    @Test
    public void testInputName() {
        System.out.println("inputName");
        Person instance = new Person();
        instance.inputName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inputPhone method, of class Person.
     */
    @Test
    public void testInputPhone() {
        System.out.println("inputPhone");
        Person instance = new Person();
        instance.inputPhone();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printName method, of class Person.
     */
    @Test
    public void testPrintName() {
        System.out.println("printName");
        Person instance = new Person();
        instance.printName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printPhone method, of class Person.
     */
    @Test
    public void testPrintPhone() {
        System.out.println("printPhone");
        Person instance = new Person();
        instance.printPhone();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
