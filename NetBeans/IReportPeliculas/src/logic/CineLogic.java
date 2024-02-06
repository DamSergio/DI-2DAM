/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.ArrayList;
import dto.*;

/**
 *
 * @author Sergio
 */
public class CineLogic {
    public static ArrayList<Cine> cines = new ArrayList<>();
    
    public static void añadirCine(Cine c) {
        cines.add(c);
    }
    
    public static void añadirPeliACine(Cine c, Pelicula p) {
        for (Cine cine : cines) {
            if (cine.equals(c)) {
                cine.getPeliculas().add(p);
            }
        }
    }
}
