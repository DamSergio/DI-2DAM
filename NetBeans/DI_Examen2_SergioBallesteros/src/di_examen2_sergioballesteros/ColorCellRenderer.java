/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di_examen2_sergioballesteros;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Sergio
 */
public class ColorCellRenderer extends DefaultTableCellRenderer{
    private JLabel lb;
    
     public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focus, int row, int col) {
        //CREO UN LABEL Y LE DOY LAS PROPIEDADES QUE QUIERO
        lb = new JLabel();
        table.setRowHeight(row, 25);
        lb.setHorizontalAlignment(JLabel.CENTER);
        lb.setSize(50, 25);
        try {
            lb.setOpaque(true);
            if ((boolean) value){
                lb.setBackground(Color.GREEN);
            } else {
                lb.setBackground(Color.red);
            }
        } catch(Exception e){
            
        }
        
        return lb;
    }
}
