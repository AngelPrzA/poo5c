/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

/**
 *
 * @author samf3
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Secretaria secreUno=new Secretaria();
        System.out.println(secreUno.getPuesto());
        System.out.println(secreUno.getHorario());
        
        Secretaria secreDos = new Secretaria();
        System.out.println(secreDos.getPuesto());
        System.out.println(secreDos.getHorario());
        
        Recepcionista recepUno=new Recepcionista();
        System.out.println(recepUno.getServicio());
        System.out.println(recepUno.getPresentacion());
        
    }
    
}
