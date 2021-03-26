/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica11;

import java.util.Calendar;

/**
 *
 * @author Antonio Conde
 */
public class Practica11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Varibales de tipo primitivo
        int entero = 100;
        double doble = 10.50 ;
        float flotante = 11.50f;
        char caracter;
        
        System.out.println("El valor del doble es: "+doble);
        
        //Aqui se hace un casteo de variable
        System.out.println("el valor casteado del doble es: " +((int)doble));
        
        System.out.println("el valor de entero es: " +entero);
        //Aqui se hace un casteo de variable
        System.out.println("el valor casteado de entero a doble es: "+((double)entero));
        
        //Clases wrapper
        String cadena;
        Integer enteroClase = 100;
        Double doubleClass = 10.50;
        Float flotanteClase = 11.50f;
        Character caracterClase;
        
        enteroClase.compareTo(10);
        
        Integer miEntero = Integer.parseInt("100");
        System.out.println("El valor de la clase es: " +miEntero.doubleValue());
        
        Double miDouble = doubleClass.parseDouble("4561");
        System.out.println("El valor del double es: "+miDouble);
        
        try {
           doubleClass.parseDouble(""); 
        }
        catch (NumberFormatException ex ) {
            ex.printStackTrace();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
        
        MiCalendario calendario1 = new MiCalendario();
        CalendarioMexico calendarioMexico1 = new CalendarioMexico();
        
        System.out.println(calendario1.dia()+calendario1.mes());
    }
    
}
