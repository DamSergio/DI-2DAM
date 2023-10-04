/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import dto.User;

/**
 *
 * @author Sergio
 */
public class UsersTableModel extends AbstractTableModel{
    private List<User> users;
    private String[] columnas = {"nombre", "apellido", "edad", "loclidad"};

    public UsersTableModel(List<User> users) {
        this.users = users;
    }

    @Override
    public int getRowCount() {
        return this.users.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return this.users.get(rowIndex).getName();
            case 1:
                return this.users.get(rowIndex).getFirtsName();
            case 2:
                return this.users.get(rowIndex).getAge();
            case 3:
                return this.users.get(rowIndex).getLoc();
        }
        return null;
    }
    
    public String getColumnName(int column) {
        return this.columnas[column];
    }
}
