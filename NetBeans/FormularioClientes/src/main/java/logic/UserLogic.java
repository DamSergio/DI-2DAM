/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import dto.User;
import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class UserLogic {
    private static ArrayList<User> users = new ArrayList<>();
    
    public static void newUser(User user){
        users.add(user);
    }
    
    public static ArrayList<User> getUsers(){
        return users;
    }
}
