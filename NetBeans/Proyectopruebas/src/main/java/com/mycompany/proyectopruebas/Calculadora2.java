/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopruebas;

/**
 *
 * @author Trabajo
 */
public class Calculadora2 {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("División por cero no permitida");
        }
        return (double)a / (double)b;
    }

    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int obtenerMaximo(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return 0; 
        }
        int max = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) { 
                max = numeros[i];
            }
        }
        return max;
    }

    public String invertirCadena(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return null; 
        }
        StringBuilder sb = new StringBuilder(cadena);
        return sb.reverse().toString(); 
    }
}
