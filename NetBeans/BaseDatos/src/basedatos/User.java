/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basedatos;

/**
 *
 * @author Sergio
 */
public class User {
    private int id;
    private String nombre;
    private String psw;
    private String desc;
    private String img;

    public User(int id, String nombre, String psw, String desc, String img) {
        this.id = id;
        this.nombre = nombre;
        this.psw = psw;
        this.desc = desc;
        this.img = img;
    }
    
    public User() {
        
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
       
       
}
