/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Sergio
 */
public class Pelicula {
    private String nombre;
    private String genero;
    private boolean visto;
    private String cine;

    public Pelicula(String nombre, String genero, boolean visto, String cine) {
        this.nombre = nombre;
        this.genero = genero;
        this.visto = visto;
        this.cine = cine;
    }
    
    public Pelicula() {
        this.nombre = "";
        this.genero = "";
        this.visto = false;
        this.cine = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public String getCine() {
        return cine;
    }

    public void setCine(String cine) {
        this.cine = cine;
    }
}
