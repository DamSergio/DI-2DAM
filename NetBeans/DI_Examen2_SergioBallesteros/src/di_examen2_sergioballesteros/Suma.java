/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di_examen2_sergioballesteros;

/**
 *
 * @author Sergio
 */
public class Suma {
    private int id;
    private int res;
    private boolean acierto;

    public Suma(int id, int res, boolean acierto) {
        this.id = id;
        this.res = res;
        this.acierto = acierto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public boolean isAcierto() {
        return acierto;
    }

    public void setAcierto(boolean acierto) {
        this.acierto = acierto;
    }
}
