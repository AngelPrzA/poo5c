/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAVID
 */
public class HiloUno extends Thread{

    @Override
    public void run() {
        try {
            sleep(5000);
            for (int i=0;1<=1000;i++){
            }
          System.out.println("termine ejecucion del hilo");
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloUno.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    

}
