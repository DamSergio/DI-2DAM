/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import dto.Tarea;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sergio
 */
public class TareaTableModel extends AbstractTableModel{
    private ArrayList<Tarea> tareas;
    private String[] columnas = {"nombre", "desc", "asignatura", "fecha_inicio", "fecha_fin"};
    
    public TareaTableModel(ArrayList<Tarea> t) {
        this.tareas = t;
    }
            
    @Override
    public int getRowCount() {
        return this.tareas.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return this.tareas.get(rowIndex).getNombre();
            case 1:
                return this.tareas.get(rowIndex).getDesc();
            case 2:
                return this.tareas.get(rowIndex).getAsig();
            case 3:
                return this.tareas.get(rowIndex).getFechaIni();
            case 4:
                return this.tareas.get(rowIndex).getFechaFin();
        }
        return null;
    }
    
    public String getColumnName(int column) {
        return this.columnas[column];
    }
}
