/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pruebaswing;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Sergio
 */
public class Main extends JFrame {

    private JLabel lbSaludo;

    public Main() {
        initFrame();
        initComponent();
    }

    private void initFrame() {
        setSize(400, 300);
        setTitle("Hola swing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
    }

    private void initComponent() {
        lbSaludo = new JLabel("Hola swing 2");
        lbSaludo.setBounds(50, 50, 400, 20);
        lbSaludo.setOpaque(true);
        lbSaludo.setBackground(Color.black);
        lbSaludo.setForeground(Color.white);
        add(lbSaludo);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}
