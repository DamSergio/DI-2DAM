/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.serbalced.pruebatabla;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import dto.Alumno;
import javax.swing.event.TableModelListener;

/**
 *
 * @author Sergio
 */
public class AlumnoTableModel extends AbstractTableModel{
    private List<Alumno> listAlumnos;
    private String[] columnas = {"nombre", "curso"};
    
    public AlumnoTableModel(List<Alumno> l){
        this.listAlumnos = l;
    }
    
    @Override
    public int getRowCount() {
        return this.listAlumnos.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return this.listAlumnos.get(rowIndex).getName();
            case 1:
                return this.listAlumnos.get(rowIndex).getCurso();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return this.columnas[column];
    }
}
