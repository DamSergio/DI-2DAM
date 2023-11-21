/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package di_examen2_sergioballesteros;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.plaf.basic.BasicComboBoxUI;

/**
 *
 * @author Sergio
 */
public class DI_Examen2_SergioBallesteros extends javax.swing.JFrame {
    
    private Hilo1 primos;
    private Hilo2 bd;
    private int res;
    private DI_Examen2_SergioBallesteros padre = this;

    /**
     * Creates new form DI_Examen2_SergioBallesteros
     */
    public DI_Examen2_SergioBallesteros() {
        initComponents();
        
        //Tamaño y titulo
        this.setSize(800, 600);
        this.setTitle("Examen 2");
        
        //La pongo en mitad de la pantalla
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - this.getWidth()) / 2;
        int y = (screen.height - this.getHeight()) / 2;
        this.setLocation(x, y);
        
        pbPrimos.setStringPainted(true);
        pbPrimos.setForeground(Color.BLACK);
        
        btnGuess.setEnabled(false);
    }
    
    public void initTable(){
        SumasTableModel stm = new SumasTableModel(SumaLogic.getSumas());
        tbSumas.setModel(stm);
        tbSumas.getColumnModel().getColumn(2).setCellRenderer(new ColorCellRenderer());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPrimos = new javax.swing.JButton();
        txtIni = new javax.swing.JTextField();
        txtFin = new javax.swing.JTextField();
        pbPrimos = new javax.swing.JProgressBar();
        btnGuess = new javax.swing.JButton();
        lbSuma = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSumas = new javax.swing.JTable();
        txtGuess = new di_examen2_sergioballesteros.TextFieldPersonalizado();
        labelPersonalizado1 = new di_examen2_sergioballesteros.LabelPersonalizado();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPrimos.setText("Primos");
        btnPrimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimosActionPerformed(evt);
            }
        });

        btnGuess.setText("Adivinar");
        btnGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuessActionPerformed(evt);
            }
        });

        lbSuma.setText("Escribe dos numeros");

        tbSumas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbSumas);

        txtGuess.setText("0");
        txtGuess.setComprobarValidez(true);

        labelPersonalizado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPersonalizado1.setText("HAZME CLICK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtIni, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuess, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(btnPrimos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pbPrimos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(labelPersonalizado1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrimos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pbPrimos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuess)
                        .addGap(18, 18, 18)
                        .addComponent(txtGuess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addComponent(labelPersonalizado1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimosActionPerformed
        // TODO add your handling code here:
        int ini = Integer.parseInt(txtIni.getText());
        int fin = Integer.parseInt(txtFin.getText());
        
        //pongo el rango en el progress bar
        pbPrimos.setMinimum(0);
        pbPrimos.setMaximum(fin - ini);
        
        btnGuess.setEnabled(false);
        
        lbSuma.setText("Escribe dos numeros");
        
        //creo el hilo con los dos parametros
        primos = new Hilo1(ini, fin);
        //añado el listener
        primos.addPropertyChangeListener(new PropertyChangeListener(){
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if (evt.getPropertyName() == "progress"){
                    pbPrimos.setValue((int) evt.getNewValue());
                    lbSuma.setText("Calculando...");
                }
                    
                    
                if(evt.getNewValue() == SwingWorker.StateValue.DONE){
                    try {
                        res = (int) ((Hilo1) evt.getSource()).get();
                        lbSuma.setText("CALCULADO, ADIVINA");
                        btnGuess.setEnabled(true);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(DI_Examen2_SergioBallesteros.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ExecutionException ex) {
                        Logger.getLogger(DI_Examen2_SergioBallesteros.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        //lo ejefuto
        primos.execute();
    }//GEN-LAST:event_btnPrimosActionPerformed

    private void btnGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuessActionPerformed
        // TODO add your handling code here:
        int guess = Integer.parseInt(txtGuess.getText());
        bd = new Hilo2(res, guess);
        //change listener
        bd.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if(evt.getNewValue() == SwingWorker.StateValue.DONE){
                    
                    String msg = res == guess ? "HAS ACERTADO :D" : "HAS PERDIDO :C";
                    JOptionPane.showMessageDialog(padre, msg, "resutado", JOptionPane.INFORMATION_MESSAGE);
                    
                    //inicializo la tabla
                    initTable();
                    
                    //texto de color
                    if (txtGuess.isComprobarValidez()){
                        txtGuess.setBackground(res == guess ? Color.GREEN : Color.RED);
                    }
                }
            }
        });
        bd.execute();
    }//GEN-LAST:event_btnGuessActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DI_Examen2_SergioBallesteros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DI_Examen2_SergioBallesteros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DI_Examen2_SergioBallesteros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DI_Examen2_SergioBallesteros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DI_Examen2_SergioBallesteros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuess;
    private javax.swing.JButton btnPrimos;
    private javax.swing.JScrollPane jScrollPane1;
    private di_examen2_sergioballesteros.LabelPersonalizado labelPersonalizado1;
    private javax.swing.JLabel lbSuma;
    private javax.swing.JProgressBar pbPrimos;
    private javax.swing.JTable tbSumas;
    private javax.swing.JTextField txtFin;
    private di_examen2_sergioballesteros.TextFieldPersonalizado txtGuess;
    private javax.swing.JTextField txtIni;
    // End of variables declaration//GEN-END:variables
}
