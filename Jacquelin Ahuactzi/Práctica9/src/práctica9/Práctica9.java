/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica9;

/**
 *
 * @author jacqu
 */
public class Práctica9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hilo hilo = new Hilo(15000);
        hilo.start();
        Hilo segundoHilo = new Hilo(1000);
        segundoHilo.start();
        
        Hilo tercerHilo = new Hilo(20000);
        tercerHilo.start();
        
        Hilo cuartoHilo = new Hilo(20000);
        cuartoHilo.start();
        
        HiloDos hiloDos = new HiloDos();
        hiloDos.start();
    }
    
}
