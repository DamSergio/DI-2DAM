/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import javax.swing.SwingWorker;

/**
 *
 * @author Sergio
 */
public class CountDown extends SwingWorker{

    @Override
    protected Object doInBackground() throws Exception {
        for (int i = 1; i <= 60; i++){
            if (isCancelled()){
                return i;
            }
            
            Thread.sleep(1000);
            setProgress(i);
            i++;
        }
        
        return 60;
    }

    @Override
    protected void done() {
        System.out.println("Se ha finalizado la tarea.");
    }
    
}
