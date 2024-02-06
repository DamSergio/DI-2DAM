/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.awt.List;
import java.util.ArrayList;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 *
 * @author Sergio
 */
public class Cine {
    private String nombre;
    private String dir;
    private ArrayList<Pelicula> peliculas;

    public Cine(String nombre, String dir, ArrayList peliculas) {
        this.nombre = nombre;
        this.dir = dir;
        this.peliculas = peliculas;
    }
    
    public Cine() {
        this.nombre = "";
        this.dir = "";
        this.peliculas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
    
    public JRDataSource getPeliculasDS() {
        return new JRBeanCollectionDataSource(peliculas); 
    }
}
