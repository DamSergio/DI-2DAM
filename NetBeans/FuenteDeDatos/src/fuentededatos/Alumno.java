/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuentededatos;

import java.util.ArrayList;
import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 *
 * @author Sergio
 */
public class Alumno {
    private int id;
    private String clave;
    private String nombre;
    private List materias = new ArrayList<>();
    
    public Alumno() {
        this.id = 0;
        this.clave = "";
        this.nombre = "";
    }
    
    public Alumno(int id, String clave, String nombre) {
        this.id = id;
        this.clave = clave;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public List getMaterias() {
        return materias;
    }
    
    public void setMaterias(List materias) {
        this.materias = materias;
    }
    
    public void addMateria(Materia materia) {
        this.materias.add(materia);
    }
    
    public JRDataSource getMateriasDS() {
        return new JRBeanCollectionDataSource(materias); 
    }
}
