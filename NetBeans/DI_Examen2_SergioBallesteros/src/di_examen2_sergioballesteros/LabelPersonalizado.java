/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di_examen2_sergioballesteros;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import javax.swing.JLabel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sergio
 */
public class LabelPersonalizado extends JLabel implements Serializable{
    public LabelPersonalizado(){
        this.addMouseListener(new MouseListener() {
            //EL UNICO LISTENER QUE ME INTERESA ES ESTE
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/examen2", "root", "1234");
                    
                    PreparedStatement st = conn.prepareStatement("SELECT COUNT(*) FROM sumas WHERE acierto = 1");
                    ResultSet rs = st.executeQuery();
                    rs.next();
                    
                    setText("NUMERO DE ACIERTOS: " + rs.getInt(1));
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(LabelPersonalizado.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(LabelPersonalizado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
            
        });
    }
}
