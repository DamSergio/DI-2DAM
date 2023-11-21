/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textfieldmayus;

import java.awt.BorderLayout;
import java.io.Serializable;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

/**
 *
 * @author Sergio
 */
public class SliderValor extends JSlider implements Serializable {
    private boolean valorActualVisible;
    private Valores valores;
    private JLabel valorLabel;
    
    public SliderValor() {
        this.valorActualVisible = false;
        valores = new Valores();
        
        valorLabel = new JLabel("", SwingConstants.CENTER);
        valorLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 50, 0));
        //valorLabel.setAlignmentX(50);
        
        setLayout(new BorderLayout());
        add(valorLabel, BorderLayout.NORTH);
        
        addChangeListener(e -> {
            if (valorActualVisible){
                actualizarValores();
            }
        });
    }
    
    public void actualizarValores() {
        if (valorActualVisible) {
            valorLabel.setText(this.getValue() + "");
        } else {
            valorLabel.setText("");
        }
        
    }

    public boolean isValorActualVisible() {
        return valorActualVisible;
    }

    public void setValorActualVisible(boolean valorActualVisible) {
        this.valorActualVisible = valorActualVisible;
    }

    public Valores getValores() {
        return valores;
    }

    public void setValores(Valores valores) {
        this.valores = valores;
    }

    public JLabel getValorLabel() {
        return valorLabel;
    }

    public void setValorLabel(JLabel valorLabel) {
        this.valorLabel = valorLabel;
    }
    
    
}
