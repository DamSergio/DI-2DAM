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
public class PeliculaLogic {
    public static ArrayList<Pelicula> peliculas = new ArrayList<>();
    
    public static void añadirPelicula(Pelicula p) {
        peliculas.add(p);
    }
}
