/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

import dto.*;

/**
 *
 * @author Sergio
 */
public class PeliculaTableModel extends AbstractTableModel {
    private ArrayList<Pelicula> peliculas;
    private String columns[] = {"nombre", "genero", "visto", "cine"};
    
    public PeliculaTableModel (ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public int getRowCount() {
        return this.peliculas.size();
    }

    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return this.peliculas.get(rowIndex).getNombre();
            case 1:
                return this.peliculas.get(rowIndex).getGenero();
            case 2:
                return this.peliculas.get(rowIndex).isVisto();
            case 3:
                return this.peliculas.get(rowIndex).getCine();
        }
        return null;    
    }
    
    public String getColumnName(int column) {
        return this.columns[column];
    }
}
