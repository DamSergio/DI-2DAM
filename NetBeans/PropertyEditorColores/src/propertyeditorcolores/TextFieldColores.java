/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propertyeditorcolores;

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
        
        getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                actualizarColores();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                actualizarColores();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                actualizarColores();
            }
            
        });
    }
    
    public void actualizarColores(){
        if(this.getText().length() >= this.numCaracteres){
            this.setBackground(fondoytexto.getFondo());
            this.setForeground(fondoytexto.getTexto());
        } else {
            this.setBackground(Color.WHITE);
            this.setForeground(Color.BLACK);
        }
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
        
        this.setBackground(fondoytexto.getFondo());
        this.setForeground(fondoytexto.getTexto());
        
        
        if (numCaracteres == null){
            numCaracteres = 0;
        }
    }
    
    
}
