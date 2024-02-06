/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Sergio
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testSuma() {
        int res = Calculadora.suma(3, 6);
        int suma = 9;
        assertEquals(suma, res);
    }
    
    @Test
    public void testResta() {
        int res = Calculadora.resta(6, 3);
        int resta = 3;
        assertEquals(resta, res);
    }
}
