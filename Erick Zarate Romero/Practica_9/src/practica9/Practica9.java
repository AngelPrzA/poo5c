/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9;

/**
 *
 * @author erick zarate
 */
public class Practica9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HiloUno hilo = new HiloUno(15000);
        hilo.start();
        HiloUno hilodos = new HiloUno(20000);
        hilodos.start();
        
        HiloUno hilotres = new HiloUno(5000);
        hilotres.start();
        
        
        
    }
    
}
