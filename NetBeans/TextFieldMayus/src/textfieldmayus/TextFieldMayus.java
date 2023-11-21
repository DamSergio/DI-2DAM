/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textfieldmayus;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.Serializable;
import javax.swing.JTextField;

/**
 *
 * @author Sergio
 */
public class TextFieldMayus extends JTextField implements Serializable {
    private boolean mayus;

    public TextFieldMayus(boolean mayus) {
        this.mayus = mayus;
    }
    
    public TextFieldMayus() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (mayus){
                    setText(getText().toUpperCase());  
                }
            }
        });
    }

    public boolean isMayus() {
        return mayus;
    }

    public void setMayus(boolean mayus) {
        this.mayus = mayus;
    }
}
