/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.serbalced.testgraficoprueba;

import javax.swing.JButton;
import javax.swing.SwingUtilities;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Sergio
 */
public class TestGraficoPruebaTest {
    private TestGraficoPrueba main;
    
    public TestGraficoPruebaTest() {
    }
    
    @BeforeEach
    public void setUp() {
        main = new TestGraficoPrueba();
    }

    /**
     * Test of actualizarEtiqueta method, of class TestGraficoPrueba.
     */
    @Test
    public void testActualizarEtiqueta() {
        assertEquals("Hola", main.jLabel1.getText());
        
        SwingUtilities.invokeLater(() -> {
            JButton btn = main.jButton1;
            btn.doClick();
        });
        
        SwingUtilities.invokeLater(() -> {
            assertEquals("HOLA DONE", main.jLabel1.getText());
        });
    }
}
