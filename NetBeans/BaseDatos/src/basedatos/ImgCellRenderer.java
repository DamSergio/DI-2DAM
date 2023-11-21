/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basedatos;

import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Sergio
 */
public class ImgCellRenderer extends DefaultTableCellRenderer {
    private JLabel lb;
    
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focus, int row, int col) {
        lb = new JLabel();
        lb.setHorizontalAlignment(JLabel.CENTER);
        
        try {
            ImageIcon icon = new ImageIcon((String) value);
            
            Image scaledImage = icon.getImage().getScaledInstance(50, 50, WIDTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);
            table.setRowHeight(row, 50);
            
            lb.setIcon(scaledIcon);
        } catch(Exception e){
            
        }
        
        return lb;
    }
}
