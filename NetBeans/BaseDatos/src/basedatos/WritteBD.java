/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basedatos;

import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.SwingWorker;

/**
 *
 * @author Sergio
 */
public class WritteBD extends SwingWorker {
    @Override
    protected Object doInBackground() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/basedatos", "root", "1234");
        Statement nUsers = conn.createStatement();
        ResultSet users = nUsers.executeQuery("SELECT * FROM usuarios");
        
        FileWriter fw = new FileWriter(new File("users.txt"));
        while (users.next()){
            fw.write("id: " + users.getInt(1) + "nombre: " + users.getString(2)+", contraseña: " + users.getString(3) + "\n");
            UserLogic.addUser(new User(users.getInt(1), users.getString(2), users.getString(3), users.getString(4), users.getString(5)));
        }
        fw.flush();
        fw.close();
        
        return 1;
    }
    
    @Override
    protected void done() {
        System.out.println("Se ha finalizado la tarea.");
    }
}
