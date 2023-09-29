/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.ArrayList;
import java.util.List;
import dto.Alumno;

/**
 *
 * @author Sergio
 */
public class AlumnoLogic {
    private List<Alumno> listaAlumno = new ArrayList<>();
    
    public void addAlumno(Alumno a){
        listaAlumno.add(a);
    }
    
    public List<Alumno> getAlumnos(){
        return this.listaAlumno;
    }
}
