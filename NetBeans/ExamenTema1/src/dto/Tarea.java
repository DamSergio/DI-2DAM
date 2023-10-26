/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Date;

/**
 *
 * @author Sergio
 */
public class Tarea {
       private int id;
       private String nombre;
       private String desc;
       private String asig;
       private Date fechaIni;
       private Date fechaFin;

    public Tarea(int id, String nombre, String desc, String asig, Date fechaIni, Date fechaFin) {
        this.id = id;
        this.nombre = nombre;
        this.desc = desc;
        this.asig = asig;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }
    
    public int getId(){
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAsig() {
        return asig;
    }

    public void setAsig(String asig) {
        this.asig = asig;
    }

    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
