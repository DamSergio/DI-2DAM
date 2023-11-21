/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basedatos;

import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class UserLogic {
    private static ArrayList<User> users = new ArrayList<>();
    
    public static void addUser(User u){
        users.add(u);
    }
    
    public static ArrayList<User> getUsers(){
        return users;
    }
    
    public static void setUsers(ArrayList<User> l){
        users = l;
    }
}
