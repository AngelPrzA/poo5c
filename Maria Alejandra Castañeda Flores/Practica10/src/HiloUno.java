/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10;
/**
 *
 * @author samf3
 */
public class HiloUno extends Thread{
    //variables de clase 
    private int tiempo;
    
    //constructor con parametros
    public HiloUno(int tiempo){
        this.tiempo = tiempo;
    }
    //sobreescritura de metodos
    @Override
    public void run(){
        try{
            sleep(tiempo);
            for(int i = 0; i<= 1000; i++){
                
            }
            System.out.println("Termine la ejecucion de hilo con tiempo" +(tiempo/1000)+ "segundos");
            
        }catch(InterruptedException ex){
            
        }
    }
}
