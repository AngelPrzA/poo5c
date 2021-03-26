/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica11;

/**
 *
 * @author jacqu
 */
public class Practica11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Clases wrapper
        int entero = 100;
        double doble = 10.50;
        float flotante = 11.50f;
        char caracter;
        
        System.out.println("El valor del doble es: "+doble);
        //Hacemos un casteo de variable
        System.out.println("El valor casteado de doble es "+((int)doble));
        
        System.out.println("El valor de entero es: "+entero);
        //Hacemos un casteo de variable
        System.out.println("El valor csteado de entero a doble es: "+((double)entero));
        
        //Clases wrapper
        String cadena = "";
        Integer enteroClase = 10;
        Integer enteroClaseDos = 20;
        Double dobleClase = 10.50;
        Float flotanteClase = 11.50f;
        
        //==
        enteroClase.compareTo(enteroClaseDos);
        
        Integer miEntero = Integer.parseInt ("100");
        System.out.println("El valor de la clase es: "+miEntero);
        
        MiCalendario calendario = new MiCalendario ();
        CalendarioMexico calendarioMexico = new CalendarioMexico();
        String tempo = calendarioMexico.festivo(15,9);
        System.out.println(tempo);
        System.out.println(calendario.dia());
        
        
        
        
    }
    
}
