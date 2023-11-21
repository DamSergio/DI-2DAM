/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basedatos;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sergio
 */
public class UserTableModel extends AbstractTableModel{
    private ArrayList<User> users;
    private String cols[] = {"nombre", "contraseña", "descripcion", "img"};
    
    public UserTableModel(ArrayList<User> u) {
        this.users = u;
    }
            
    @Override
    public int getRowCount() {
        return this.users.size();
    }

    @Override
    public int getColumnCount() {
        return this.cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return this.users.get(rowIndex).getNombre();
            case 1:
                return this.users.get(rowIndex).getPsw();
            case 2:
                return this.users.get(rowIndex).getDesc();
            case 3:
                return this.users.get(rowIndex).getImg();
        }
        return null;
    }
    
    public String getColumnName(int column) {
        return this.cols[column];
    }
}
