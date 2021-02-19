/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;

/**
 *
 * @author samf3
 */
public class Practica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Audi miAudi= new Audi();
        System.out.println(miAudi.getMarca());
        System.out.println(miAudi.getAnio());
        System.out.println(miAudi.getNum_puertas());
        System.out.println("");
        
         Audi miAudi2= new Audi("Audi",2021,4,"Xplode",3000,true);
        System.out.println(miAudi2.getMarca());
        System.out.println(miAudi2.getAnio());
        System.out.println(miAudi2.getNum_puertas());
        
    }
    
}
