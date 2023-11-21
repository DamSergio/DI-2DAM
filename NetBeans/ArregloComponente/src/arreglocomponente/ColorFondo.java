/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglocomponente;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author javie
 */
public class ColorFondo extends JPanel implements Serializable{
    private Color colorFondo;
    
    public ColorFondo(){
        super();
        colorFondo = Color.GREEN;
        setOpaque(true);
    }
    
    public ColorFondo(Color col){
        super();
        colorFondo = col;
        setOpaque(true);
    }
    
    public Color getColorFondo(){
        return colorFondo;
    }
    
    public void setColorFondo(Color fondo){
       this.colorFondo = fondo;
    }

    @Override
    protected void paintComponent(Graphics g) {
       super.paintComponent(g);
       g.setColor(colorFondo);
    }
    
    
    
}
