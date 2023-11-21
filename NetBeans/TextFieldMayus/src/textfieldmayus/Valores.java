/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textfieldmayus;

import java.io.Serializable;

/**
 *
 * @author Sergio
 */
public class Valores implements Serializable {
    private int max;
    private int min;

    public Valores(int max, int min) {
        this.max = max;
        this.min = min;
    }
    
    public Valores() {
        this.max = 0;
        this.min = 0;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
    
    
}
