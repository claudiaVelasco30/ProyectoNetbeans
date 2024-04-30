/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author admin
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        Calculadora instance = new Calculadora(4, 2);
        int expResult = 6;
        int result = instance.suma();
        assertEquals(expResult, result);
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        Calculadora instance = new Calculadora(4, 2);
        int expResult =2;
        int result = instance.resta();
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplica method, of class Calculadora.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        Calculadora instance = new Calculadora(4, 2);
        int expResult = 8;
        int result = instance.multiplica();
        assertEquals(expResult, result);
    }

    /**
     * Test of divide method, of class Calculadora.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        Calculadora instance = new Calculadora(4, 2);
        int expResult = 2;
        int result = instance.divide();
        assertEquals(expResult, result);
    }

    /**
     * Test of divide2 method, of class Calculadora.
     */
    @Test
    public void testDivide2() {
        System.out.println("divide2");
        Calculadora instance = new Calculadora(4, 0);
        Integer expResult = null;
        Integer result = instance.divide2();
        assertEquals(expResult, result);
    }

    /**
     * Test of resta2 method, of class Calculadora.
     */
    @Test
    public void testResta2() {
        System.out.println("resta2");
        Calculadora instance = new Calculadora(2, 4);
        boolean expResult = false;
        boolean result = instance.resta2();
        assertEquals(expResult, result);
    }

    /**
     * Test of factorial method, of class Calculadora.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        Calculadora instance = new Calculadora(2, 2);
        Integer expResult = 2;
        Integer result = instance.factorial();
        assertEquals(expResult, result);
    }
    
}
