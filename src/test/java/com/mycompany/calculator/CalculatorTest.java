/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 5im14kelay
 */
public class CalculatorTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        Calculator Calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
    }
    
    /**
     * Test of addition method, of class Calculator.
     */
    @org.junit.Test
    public void testSummeZweiPositive() {
        System.out.println("Positive");
        int summand1 = 2;
        int summand2 = 3;
        Calculator instance = new Calculator();
        int expResult = 5;
        int result = instance.addition(summand1, summand2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
   @org.junit.Test
        public void testSummeZweiNegative() {
        System.out.println("Negative");
        int summand1 = -2;
        int summand2 = -3;
        Calculator instance = new Calculator();
        int expResult = -5;
        int result = instance.addition(summand1, summand2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @org.junit.Test    
        public void testSummeZweiNulle() {
        System.out.println("Null");
        int summand1 = 0;
        int summand2 = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.addition(summand1, summand2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addition method, of class Calculator.
     */
    
}
