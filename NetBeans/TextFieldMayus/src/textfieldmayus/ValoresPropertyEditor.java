/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textfieldmayus;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author Sergio
 */
public class ValoresPropertyEditor extends PropertyEditorSupport {
    private ValoresPanel panel = new ValoresPanel();
    
    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return panel;
    }

    @Override
    public String getJavaInitializationString() {
        Valores v = panel.getSelectedValue();
        return "new textfieldmayus.Valores(" + v.getMax() + ", " + v.getMin() + ")";
    }

    @Override
    public Object getValue() {
        return panel.getSelectedValue();
    }
}
