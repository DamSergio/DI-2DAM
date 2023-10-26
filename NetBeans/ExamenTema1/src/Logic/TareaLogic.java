/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import dto.Tarea;
import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class TareaLogic {
    private static ArrayList<Tarea> listaTareas = new ArrayList<>();
    
    public static void addTarea(Tarea t){
        listaTareas.add(t);
    }
    
    public static ArrayList<Tarea> getLista(){
        return listaTareas;
    }
    
    public static void setLista(ArrayList<Tarea> l){
        listaTareas = l;
    }
}
