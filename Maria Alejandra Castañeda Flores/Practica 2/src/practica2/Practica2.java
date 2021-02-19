/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author samf3
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pastel pastelUno = new Pastel();
        pastelUno.setColor("Morado");
        pastelUno.setTamano("Mediano");
        pastelUno.setSabor("Fresa");
        pastelUno.setForma("Rectangular");
        pastelUno.setDecoracion("Velitas");
        
        Pastel pastelDos = new Pastel();
        pastelDos.setColor("Rojo");
        pastelDos.setTamano("Grande");
        pastelDos.setSabor("Vainilla");
        pastelDos.setForma("Circular");
        pastelDos.setDecoracion("Corazones");
        
        Pastel pastelTres = new Pastel("Verde", "Chico");
        
        System.out.println("Mi pastel uno es de color: "+pastelUno.getColor());
        System.out.println("Mi pastel dos es de color: "+pastelDos.getColor());
        System.out.println("Mi pastel tres es de color: "+pastelTres.getColor());
        
        
        
        
        
        
    }
    
}
