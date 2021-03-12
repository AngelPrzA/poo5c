/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package práctica9;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jacqu
 */
public class Hilo extends Thread{
    //Variables de clase
    private int tiempo;
    
    //Constructor con parametros 
    public Hilo(int tiempo){
        this.tiempo = tiempo;
    }
    //Sobreescritura de metodos 
    @Override
    public void run(){
        try{
            sleep(tiempo);
            for(int i = 0; i <= 100; i++){
            }
            System.out.println("Termina la ejecución de hilo con tiempo "+(tiempo/1000)+" segundos");
        }catch(InterruptedException ex){
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
}
