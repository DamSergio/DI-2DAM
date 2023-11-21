/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di_examen2_sergioballesteros;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sergio
 */
public class SumasTableModel extends AbstractTableModel{
    private ArrayList<Suma> sumas;
    private String[] cols = {"id", "resultado", "acierto"};
    
    public SumasTableModel(ArrayList<Suma> sumas){
        this.sumas = sumas;
    }

    @Override
    public int getRowCount() {
        return this.sumas.size();
    }

    @Override
    public int getColumnCount() {
        return this.cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return this.sumas.get(rowIndex).getId();
            case 1:
                return this.sumas.get(rowIndex).getRes();
            case 2:
                return this.sumas.get(rowIndex).isAcierto();
        }
        return null;
    }
    
    public String getColumnName(int column) {
        return this.cols[column];
    }
}
