/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Sergio
 */
public class Alumno {
    private String name;
    private String curso;

    public Alumno(String name, String curso) {
        this.name = name;
        this.curso = curso;
    }

    public Alumno() {
        this.name = "";
        this.curso = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
