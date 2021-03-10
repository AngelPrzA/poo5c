/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10_hilos;

/**
 *
 * @author Antonio Conde
 */
public class HiloUno extends Thread {
    
    private int tiempo;
    
    public HiloUno(int tiempo){
        this.tiempo = tiempo;
    }
    
    @Override
    public void run(){
        try {
            sleep(tiempo);
            for (int i = 0 ; i <= 1000 ; i++){
                }
             System.out.println("Terminé la ejecución de hilo uno con tiempo "
                        +(tiempo /1000) +" segundos");
        } catch (InterruptedException ex) {
            //System.Logger.getLogger(HiloDos.class.getName()).Log(Level.SEVERE, null, ex)
        }  
    }
    
}
