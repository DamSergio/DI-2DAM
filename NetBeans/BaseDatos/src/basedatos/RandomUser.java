/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.SwingWorker;
import java.sql.*;

/**
 *
 * @author Sergio
 */
public class RandomUser extends SwingWorker {

    @Override
    protected User doInBackground() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/basedatos", "root", "1234");
        Statement nUsers = conn.createStatement();
        ResultSet users = nUsers.executeQuery("SELECT COUNT(*) FROM usuarios");
        users.next();
        int numUsers = users.getInt(1);
        
        int randomUser = (int) (Math.random() * numUsers);
        Statement u = conn.createStatement();
        ResultSet user = u.executeQuery("SELECT id, nombre, password, descripcion, rutaimg FROM usuarios");
        for (int i = 0; i < randomUser; i++){
            user.next();
        }
        
        User us = new User(user.getInt(1) ,user.getString(2), user.getString(3), user.getString(4), user.getString(5));
        //setProgress(1);
        //user.close();
        
        return us;
    }
    
    
}
