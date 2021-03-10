/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10_hilos;

import java.lang.System.Logger;

/**
 *
 * @author Antonio Conde
 */
public class HiloDos extends Thread{
    
    @Override
    public void run(){
        try {
            sleep(5000);
            for (int i = 0 ; i <= 1000 ; i++){
                }
             System.out.println("Terminé la ejecución de hilo dos con tiempo" );
        } catch (InterruptedException ex) {
            //System.Logger.getLogger(HiloDos.class.getName()).Log(Level.SEVERE, null, ex)
        }  
    }
}
