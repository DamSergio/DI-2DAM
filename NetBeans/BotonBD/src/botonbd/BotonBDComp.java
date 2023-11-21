/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package botonbd;

import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;
import javax.swing.JFrame;

/**
 *
 * @author Sergio
 */
public class BotonBDComp extends JButton implements Serializable{
    private boolean change;
    
    public BotonBDComp(){
        
    }
    
    public BotonBDComp(boolean change){
        this.change = change;
    }

    public boolean isChange() {
        return change;
    }

    public void setChange(boolean change) {
        this.change = change;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);   
    }
}
