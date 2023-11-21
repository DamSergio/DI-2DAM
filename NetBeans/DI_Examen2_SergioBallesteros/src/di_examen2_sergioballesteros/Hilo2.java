/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di_examen2_sergioballesteros;

import java.sql.DriverManager;
import javax.swing.SwingWorker;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sergio
 * ESTE HIL ES LO RELACIONADO CON LA BASE DE DATOS
 */
public class Hilo2 extends SwingWorker {
    private int res;
    private int guess;
    
    public Hilo2(int res, int guess){
        this.res = res;
        this.guess = guess;
    }

    @Override
    protected Object doInBackground() {
        try {
            //INSERTO EN LA BASE DE DATOS
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/examen2", "root", "1234");
        
            PreparedStatement st = conn.prepareStatement("INSERT INTO sumas (resultado, acierto) VALUES(?, ?)");
            st.setInt(1, res);
            st.setBoolean(2, res == guess);
            st.executeUpdate();
            
            //CARGO LAS COSAS EN UN ARRAYLIST
            PreparedStatement st2 = conn.prepareStatement("SELECT * FROM sumas");
            ResultSet rs = st2.executeQuery();
            while (rs.next()){
                SumaLogic.addSuma(new Suma(rs.getInt(1), rs.getInt(2), rs.getBoolean(3)));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Hilo2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Hilo2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
}
