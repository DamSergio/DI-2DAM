/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosdeejecución;

import java.util.Random;
import javax.swing.SwingWorker;

/**
 *
 * @author Tarde
 */
public class HilosDeEjecución extends SwingWorker{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    protected Object doInBackground() throws Exception {
        int numero = 0;
        Random rd = new Random();
        while(numero < 10){
            if (isCancelled()){
                return numero;
            }
            
            numero++;
            Thread.sleep(rd.nextInt(1000));
            setProgress(numero);
        }
        return numero;
    }

    @Override
    protected void done() {
        System.out.println("Se ha finalizado la tarea.");
    }
    
}
