/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Date;

/**
 *
 * @author Sergio
 */
public class User {
    private String name;
    private String firtsName;
    private int age;
    private String loc;

    public User(String name, String firtsName, int age, String loc) {
        this.name = name;
        this.firtsName = firtsName;
        this.age = age;
        this.loc = loc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
    
    public String[] toArrayString() {
        String user[] = {this.name, this.firtsName, this.age + "", this.loc};
        return user;
    }
}
