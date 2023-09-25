/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Date;
import java.util.Vector;

/**
 *
 * @author Sergio
 */
public class User {
    private String name;
    private String firstName;
    private Date date;
    private String loc;

    public User(String name, String firstName, Date date, String loc) {
        this.name = name;
        this.firstName = firstName;
        this.date = date;
        this.loc = loc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String[] toArrayString() {
        String user[] = {this.name, this.firstName, this.date.toString(), this.loc};
        return user;
    }
}
