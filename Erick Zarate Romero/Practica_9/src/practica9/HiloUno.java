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
 * @author erick zarate
 */
public class HiloUno extends Thread{
    //variables de clase
    private int tiempo;
    //constructor con parametros
    public HiloUno(int tiempo){
    this.tiempo = tiempo;
    }
    
    
    @Override
    public void run(){
        try {
            sleep(10000);
            for (int i=0;i <= 1000;i++){
            }
            System.out.println("Termine la ejecucion del hilo con tiempo: "+(tiempo/1000)+" segundos");
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloUno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
