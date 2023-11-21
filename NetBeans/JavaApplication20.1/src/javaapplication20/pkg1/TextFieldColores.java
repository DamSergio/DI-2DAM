/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20.pkg1;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Sergio
 */
public class TextFieldColores extends JTextField implements Serializable{
    private Colores fondoytexto;
    private Integer numCaracteres;
    

    public TextFieldColores() {
        fondoytexto = new Colores(Color.WHITE, Color.BLACK);
        this.setBackground(fondoytexto.getFondo());
        this.setForeground(fondoytexto.getTexto());
        
        addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent e) {
                if (getText().length() >= numCaracteres){
                    setBackground(fondoytexto.getFondo());
                    setForeground(fondoytexto.getTexto());
                } else {
                    setBackground(Color.WHITE);
                    setForeground(Color.BLACK);
                }
            }
            
        });
    }

    public Colores getFondoytexto() {
        return fondoytexto;
    }

    public void setFondoytexto(Colores fondoytexto) {
        this.fondoytexto = fondoytexto;
    }

    public int getNumCaracteres() {
        return numCaracteres;
    }

    public void setNumCaracteres(int numCaracteres) {
        this.numCaracteres = numCaracteres;
    }
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        
        if (numCaracteres == null){
            numCaracteres = 0;
        }
    }
    
    
}
