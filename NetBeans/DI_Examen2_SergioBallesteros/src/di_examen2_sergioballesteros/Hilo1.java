/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di_examen2_sergioballesteros;

import javax.swing.SwingWorker;

/**
 *
 * @author Sergio
 * ESTE HILO ES PARA CALCULAR LOS PRIMOS
 */
public class Hilo1 extends SwingWorker {
    private int inicio;
    private int fin;
    
    public Hilo1 (int inicio, int fin){
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    protected Object doInBackground() throws Exception {
        int suma = 0;
        int progress = 0;
        //calculo la suma de primos
        for (int i = inicio; i <= fin; i++){
            this.setProgress(progress);
            
            boolean esPrimo = true;
            for (int j = 2; j <= i/2; j++){
                if (i % j == 0){
                    esPrimo = false;
                }
            }
            
            if (esPrimo){
                suma += i;
            }
            
            Thread.sleep(100);
            
            progress++;
        }
        
        return suma;
    }
    
}
