/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proyectopruebas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Sergio
 */
public class Calculadora2Test {
    private Calculadora2 calc;
    
    public Calculadora2Test() {
    }
    
    @BeforeEach
    void setUp() {
        calc = new Calculadora2();
    }

    /**
     * Test of sumar method, of class Calculadora2.
     */
    @Test
    public void testSumar() {
        int res = calc.sumar(2, 2);
        assertEquals(4, res);
    }
    
    @Test
    public void testSumar_negativo() {
        int res = calc.sumar(2, -2);
        assertEquals(0, res);
    }

    /**
     * Test of restar method, of class Calculadora2.
     */
    @Test
    public void testRestar() {
        int res = calc.restar(2, 2);
        assertEquals(0, res);
    }
    
    @Test
    public void testRestar_negativo() {
        int res = calc.restar(2, -2);
        assertEquals(4, res);
    }

    /**
     * Test of multiplicar method, of class Calculadora2.
     */
    @Test
    public void testMultiplicar() {
        float res = calc.multiplicar(3, -3);
        assertEquals(-9, res);
    }

    /**
     * Test of dividir method, of class Calculadora2.
     */
    @Test
    public void testDividir() {
        assertThrows(Exception.class, () -> calc.dividir(1, 0));
    }
    
    @Test
    public void testDividir2() {
        double res = calc.dividir(5, 2);
        assertEquals(2.5, res);
    }

    /**
     * Test of esPar method, of class Calculadora2.
     */
    @Test
    public void testEsPar() {
        assertTrue(calc.esPar(8));
    }

    /**
     * Test of esPrimo method, of class Calculadora2.
     */
    @Test
    public void testEsPrimo() {
        assertFalse(calc.esPrimo(0));
    }

    /**
     * Test of obtenerMaximo method, of class Calculadora2.
     */
    @Test
    public void testObtenerMaximo() {
        int res = calc.obtenerMaximo(new int[]{1,7,2,-8,90,34,-3});
        assertEquals(90, res);
    }

    /**
     * Test of invertirCadena method, of class Calculadora2.
     */
    @Test
    public void testInvertirCadena() {
        String res = calc.invertirCadena("pepepe.");
        assertEquals(".epepep", res);
    }
    
}
