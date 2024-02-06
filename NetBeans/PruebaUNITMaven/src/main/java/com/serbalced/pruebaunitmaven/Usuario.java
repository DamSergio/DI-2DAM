/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.serbalced.pruebaunitmaven;

import javax.xml.stream.events.Characters;

/**
 *
 * @author Sergio
 */
public class Usuario {
    private String nombre;
    private String psw;
    private String email;
    
    public Usuario() {
        this.nombre = "";
        this.psw = "";
        this.email = "";
    }

    public Usuario(String nombre, String psw, String email) {
        this.nombre = nombre;
        this.psw = psw;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean comprobarUsuario() {
        if (this.nombre.length() == 0 || this.nombre == null) {
            return false;
        }
        
        for (int i = 0; i < this.nombre.length(); i++) {
            if (Character.isDigit(this.nombre.charAt(i))) {
                return false;
            }
            
            if (!Character.isAlphabetic(this.nombre.charAt(i))) {
                return false;
            }
        }
        
        return true;
    }
    
    public boolean comprobarPsw() {
        boolean digit = false;
        boolean mayus = false;
        boolean nonCharacter = false;
        
        if (this.psw.length() < 6) {
            return false;
        }
        
        for (int i = 0; i < this.psw.length(); i++) {
            if (Character.isDigit(this.psw.charAt(i))) {
                digit = true;
            }
            
            if (Character.isUpperCase(this.psw.charAt(i))) {
                mayus = true;
            }
            
            if (!Character.isAlphabetic(this.psw.charAt(i)) && !Character.isDigit(this.psw.charAt(i))) {
                nonCharacter = true;
            }
        }
        
        return digit && mayus && nonCharacter;
    }
    
    public boolean comprobarEmail() {
        return this.email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.(com|es)$");
    }
}
