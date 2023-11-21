/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20.pkg1;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author Sergio
 */
public class ColoresPropertyEditor extends PropertyEditorSupport {
    private ColoresPanel coloresPanel = new ColoresPanel();
    
    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return coloresPanel;
    }

    @Override
    public String getJavaInitializationString() {
        Colores c = coloresPanel.getSelectedValue();
        return "new javaapplication20.pkg1.Colores(new java.awt.Color(" + c.getFondo().getRGB() + "), new java.awt.Color(" + c.getTexto().getRGB() + "))";
    }

    @Override
    public Object getValue() {
        return coloresPanel.getSelectedValue();
    }
}
