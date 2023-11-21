/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20.pkg1;

import java.io.Serializable;
import java.awt.Color;

/**
 *
 * @author Sergio
 */
public class Colores implements Serializable{
    private Color fondo;
    private Color texto;

    public Colores(Color fondo, Color texto) {
        this.fondo = fondo;
        this.texto = texto;
        
        
                
        System.out.println(fondo + " " + texto);
    }

    public Color getFondo() {
        return fondo;
    }

    public void setFondo(Color fondo) {
        this.fondo = fondo;
    }

    public Color getTexto() {
        return texto;
    }

    public void setTexto(Color texto) {
        this.texto = texto;
    }
}
