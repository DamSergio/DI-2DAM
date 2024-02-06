/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.serbalced.pruebaunitmaven;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Sergio
 */
public class CalculadoraTest {
    private Calculadora c;
    
    public CalculadoraTest() {
    }
    
    @BeforeEach
    public void before() {
        System.out.println("Empieza el test");
        c = new Calculadora();
    }
    
    @AfterEach
    public void after() {
        System.out.println("Termina el test");
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int a = 6;
        int b = 3;
        int expResult = 9;
        int result = c.suma(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int a = 6;
        int b = 3;
        int expResult = 3;
        int result = c.resta(a, b);
        assertEquals(expResult, result);
    }
}
