/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di_examen2_sergioballesteros;

import java.io.Serializable;
import javax.swing.JTextField;

/**
 *
 * @author Sergio
 */
public class TextFieldPersonalizado extends JTextField implements Serializable{
    private boolean comprobarValidez;

    public TextFieldPersonalizado(boolean comprobarValidez) {
        this.comprobarValidez = comprobarValidez;
    }
    
    public TextFieldPersonalizado() {
        
    }

    public boolean isComprobarValidez() {
        return comprobarValidez;
    }

    public void setComprobarValidez(boolean comprobarValidez) {
        this.comprobarValidez = comprobarValidez;
    }
}
