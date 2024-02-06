/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.serbalced.pruebaunitmaven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Sergio
 */
public class UsuarioTest {
    Usuario instance = new Usuario();
    
    public UsuarioTest() {
    }
    
    @BeforeEach
    public void before() {
        System.out.println("Empieza el test");
        instance = new Usuario();
    }
    
    @AfterEach
    public void after() {
        System.out.println("Termina el test");
    }

    @Test
    public void testComprobarUsuario() {
        System.out.println("comprobarUsuario");
        instance.setNombre("Sergio");

        boolean result = instance.comprobarUsuario();
        assertTrue(result);
    }
    
    @Test
    public void testComprobarUsuario2() {
        System.out.println("comprobarUsuario");
        instance.setNombre("    ");

        boolean result = instance.comprobarUsuario();
        assertFalse(result);
    }
    
    @Test
    public void testComprobarUsuari3() {
        System.out.println("comprobarUsuario");
        instance.setNombre("Sergio2");

        boolean result = instance.comprobarUsuario();
        assertFalse(result);
    }
    
    @Test
    public void testComprobarPsw() {
        System.out.println("comprobarPsw");
        instance.setPsw("Cacota27.");

        boolean result = instance.comprobarPsw();
        assertTrue(result);
    }
    
    @Test
    public void testComprobarPsw2() {
        System.out.println("comprobarPsw");
        instance.setPsw("      27.");

        boolean result = instance.comprobarPsw();
        assertFalse(result);
    }
    
    @Test
    public void testComprobarPsw3() {
        System.out.println("comprobarPsw");
        instance.setPsw("Cacota27");

        boolean result = instance.comprobarPsw();
        assertFalse(result);
    }
    
    @Test
    public void testComprobarPsw4() {
        System.out.println("comprobarPsw");
        instance.setPsw("cacota27");

        boolean result = instance.comprobarPsw();
        assertFalse(result);
    }
    
    @Test
    public void testComprobarEmail() {
        System.out.println("comprobarEmail");
        instance.setEmail("sergio@gmail.es");

        boolean result = instance.comprobarEmail();
        assertTrue(result);
    }
    
    @Test
    public void testComprobarEmail2() {
        System.out.println("comprobarEmail");
        instance.setEmail("sergiogmail.es");

        boolean result = instance.comprobarEmail();
        assertFalse(result);
    }
    
    @Test
    public void testComprobarEmail3() {
        System.out.println("comprobarEmail");
        instance.setEmail("sergio@gmail.adfsd");

        boolean result = instance.comprobarEmail();
        assertFalse(result);
    }
}
