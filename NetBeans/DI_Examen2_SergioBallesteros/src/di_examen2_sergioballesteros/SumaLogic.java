/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di_examen2_sergioballesteros;

import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class SumaLogic {
    private static ArrayList<Suma> sumas = new ArrayList<>();
    
    public static void addSuma(Suma s){
        sumas.add(s);
    }
    
    public static ArrayList<Suma> getSumas(){
        return sumas;
    }
}
