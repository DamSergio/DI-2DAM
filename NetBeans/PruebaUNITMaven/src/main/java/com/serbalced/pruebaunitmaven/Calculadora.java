/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.serbalced.pruebaunitmaven;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sergio
 */
public class Calculadora {
    public int respuesta;
    
    public Calculadora() {
        respuesta = 0;
    }
    
    public int suma(int a, int b) {
        respuesta = a + b;
        return respuesta;
    }
    
    public int suma(int a) {
        respuesta += a;
        return respuesta;
    }
    
    public int resta(int a, int b) {
        respuesta = a - b;
        return respuesta;
    }
    
    public int resta(int a) {
        respuesta -= a;
        return respuesta;
    }
    
    public void tiempo() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
