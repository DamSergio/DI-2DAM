/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglocomponente;


import java.awt.Component;
import java.beans.PropertyEditorSupport;



/**
 *
 * @author javie
 */
public class ColorFondoPropertyEditor extends PropertyEditorSupport{
    private ColorFondoPanel colorFondoPanel = new ColorFondoPanel();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    
    
    @Override
    public Component getCustomEditor() {
        return colorFondoPanel;
    }

    @Override
    public String getJavaInitializationString() {
        return super.getJavaInitializationString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Object getValue() {
        return colorFondoPanel.getSelectedValue();
    }
    
}
