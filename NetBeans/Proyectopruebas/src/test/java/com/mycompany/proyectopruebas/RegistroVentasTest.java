/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proyectopruebas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Trabajo
 */
public class RegistroVentasTest {
    
    private RegistroVentas registroVentas;

    @BeforeEach
    void setUp() {
        registroVentas = new RegistroVentas();
    }
    
    @Test
    public void testRegistrarVenta() {
        registroVentas.registrarVenta("coca-cola", 50);
        registroVentas.registrarVenta("coca-cola", 50);
        assertEquals(1, registroVentas.obtenerCantidadProductosVendidos());
    }
    
    @Test
    public void testRegistrarVenta_Negativo() {
        assertThrows(IllegalArgumentException.class, () -> registroVentas.registrarVenta("coca-cola", -50));
    }
    
    @Test
    public void testRegistrarVenta_NombreVacio() {
        assertThrows(IllegalArgumentException.class, () -> registroVentas.registrarVenta(" ", 50));
    }
    
    @Test
    public void testObtenerTotalVentas() {
        registroVentas.registrarVenta("coca-cola", 50);
        registroVentas.registrarVenta("pepsi", 20);
        assertEquals(70, registroVentas.obtenerTotalVentas());
    }
    
    @Test
    public void testObtenerTotalVentas_Negativo() {
        registroVentas.registrarVenta("coca-cola", 50);
        assertThrows(IllegalArgumentException.class, () -> registroVentas.registrarVenta("pepsi", -20));
        assertEquals(50, registroVentas.obtenerTotalVentas());
    }
    
    @Test
    public void testObtenerVentasPorProducto() {
        assertThrows(IllegalArgumentException.class, () -> registroVentas.obtenerVentasPorProducto("aquarius"));
    }
    
    @Test
    public void testObtenerCantidadProductosVendidos() {
        assertEquals(0, registroVentas.obtenerCantidadProductosVendidos());
    }
    
    @Test
    public void testVerificarProductoVendido() {
        registroVentas.registrarVenta("pepsi", 10);
        assertTrue(registroVentas.verificarProductoVendido("pepsi"));
    }
    
    @Test
    public void testLimpiarRegistroVentas() {
        registroVentas.registrarVenta("pepsi", 10);
        registroVentas.limpiarRegistroVentas();
        assertEquals(0, registroVentas.obtenerCantidadProductosVendidos());
    }
}
