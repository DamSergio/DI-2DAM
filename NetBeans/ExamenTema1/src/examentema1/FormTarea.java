/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package examentema1;

import dto.Tarea;
import Logic.TareaLogic;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;  
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.netbeans.validation.api.builtin.stringvalidation.StringValidators;
import org.netbeans.validation.api.ui.ValidationGroup;
import org.openide.util.Exceptions;

/**
 *
 * @author Sergio
 */
public class FormTarea extends javax.swing.JDialog {
    ExamenTema1 mainframe;

    /**
     * Creates new form FormTarea
     */
    public FormTarea(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        mainframe = (ExamenTema1) parent;
        btnAccept.setEnabled(false);
        
        //El validator te va a dar error porque yo tengo el jar en el escritorio, 
        //no se si tendras que importar de nuevo la libreria y el componente
        ValidationGroup form = validator.getValidationGroup();
        form.add(txtName, StringValidators.REQUIRE_NON_EMPTY_STRING);
        form.add(txtDesc, StringValidators.REQUIRE_NON_EMPTY_STRING);
        //Las dos siguientes las comento porque el validator no funciona con el spinner
        //form.add(spDateStart, StringValidators.REQUIRE_NON_EMPTY_STRING);
        //form.add(spDateEnd, StringValidators.REQUIRE_NON_EMPTY_STRING);
        validator.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent ce) {
                if (validator.getProblem() == null){
                    btnAccept.setEnabled(true);
                } else {
                    btnAccept.setEnabled(false);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbAsig = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        spDateStart = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        spDateEnd = new javax.swing.JSpinner();
        validator = new org.netbeans.validation.api.ui.swing.ValidationPanel();
        jLabel6 = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(5, 2, 10, 10));

        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName);

        jLabel2.setText("Descripcion");
        jPanel1.add(jLabel2);
        jPanel1.add(txtDesc);

        jLabel3.setText("Asignatura");
        jPanel1.add(jLabel3);

        cbAsig.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acceso a datos", "Programacion de procesos y servicios", "Desarrollo de interfaces", "Programacion multimedia" }));
        jPanel1.add(cbAsig);

        jLabel4.setText("Fecha inicio");
        jPanel1.add(jLabel4);

        spDateStart.setModel(new javax.swing.SpinnerDateModel());
        jPanel1.add(spDateStart);

        jLabel5.setText("Fecha fin");
        jPanel1.add(jLabel5);

        spDateEnd.setModel(new javax.swing.SpinnerDateModel());
        jPanel1.add(spDateEnd);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bloc notas.jpg"))); // NOI18N

        btnAccept.setText("Aceptar");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(validator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(427, 427, 427)
                        .addComponent(btnAccept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(validator, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnAccept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Confirmar creacion de tarea?", "Creacion de tarea", JOptionPane.INFORMATION_MESSAGE);
        if (response == JOptionPane.YES_OPTION){
            String name = txtName.getText();
            String desc = txtDesc.getText();
            String asig = cbAsig.getSelectedItem().toString();
            
            Date fechaIni = (Date) spDateStart.getValue();
            Date fechaFin = (Date) spDateEnd.getValue();
            
            Tarea t = new Tarea(name, desc, asig, fechaIni, fechaFin);
            TareaLogic.addTarea(t);
            String nombre = "";
            Date date;
            try {
                date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse("30/12/9999");
                for (Tarea l : TareaLogic.getLista()){
                    int res = l.getFechaFin().compareTo(date);
                    if (res < 0){
                        date = l.getFechaFin();
                        nombre = l.getNombre();
                    }
                }

                mainframe.lbTarea.setText("Tarea: " + nombre + " " + date);
            } catch (ParseException ex) {
                Exceptions.printStackTrace(ex);
            }
            
            this.dispose();
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

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
            java.util.logging.Logger.getLogger(FormTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormTarea dialog = new FormTarea(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JComboBox<String> cbAsig;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner spDateEnd;
    private javax.swing.JSpinner spDateStart;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtName;
    private org.netbeans.validation.api.ui.swing.ValidationPanel validator;
    // End of variables declaration//GEN-END:variables
}
