/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author samf3
 */
public class Practica1 {
    int entero = 0;
    float flotante = 0.0f;
    double doble = 0.0d;
    String cadena = "";
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("!Hola Alelei!");
        
        int entero = 20;
        int enteroDos = 10;
        float flotante = 5.2f;
        float flotanteDos = 100.2f;
        double doble = 2830.79;
        double dobleDos = 279.94;
        
        String cadena = "Hola";
        String cadenaDos = "Mundo Alelei";
        
        System.out.println("Hola mundo!");
        /*OPERACIONES ARITMETICAS*/
        //SUMA//
        System.out.println("Suma: "+ (entero+enteroDos));
        System.out.println("Suma de flotantes:"+(flotante+flotanteDos));
        System.out.println("Suma de doubles:"+(doble+dobleDos));
        System.out.println("");
        /*OPERACIONES ARITMETICAS*/
        //RESTA//
        System.out.println("Resta: "+ (entero-enteroDos));
        System.out.println("Resta de flotantes:"+(flotante-flotanteDos));
        System.out.println("Resta de doubles:"+(doble-dobleDos));
        System.out.println("");
        /*OPERACIONES ARITMETICAS*/
        //MULTIPLICACIÓN//
        System.out.println("Multiplicacion: "+ (entero*enteroDos));
        System.out.println("Multiplicacion de flotantes:"+(flotante*flotanteDos));
        System.out.println("Multiplicacion de doubles:"+(doble*dobleDos));
        System.out.println("");
        /*OPERACIONES ARITMETICAS*/
        //DIVISION//
        System.out.println("Division: "+ (entero/enteroDos));
        System.out.println("Division de flotantes:"+(flotante/flotanteDos));
        System.out.println("Division de doubles:"+(doble/dobleDos));
        System.out.println("");
        
        
        System.out.println(cadena.concat(cadenaDos).concat(" esto es el final de la cadena"));
        System.out.println(cadena.equals(cadenaDos));
        System.out.println(cadena.equals(cadena));
        cadena ="Hola  mundo";
        System.out.println(cadena);
        System.out.println(cadena.trim());
        cadena = "Alelei";
        cadenaDos= "Alelei";
        System.out.println(cadena.compareTo(cadenaDos));
        System.out.println(cadena.compareToIgnoreCase(cadenaDos));
        
        //OPERADORES LÓGICOS//
        //O Y NEGACIÓN//
        if(cadena.equals(cadenaDos)){
            System.out.println("Las cadenas son identicas");
        }
        else{
            System.out.println("Las cadenas son diferentes");
        }
        
        if(!cadena.equals(cadenaDos)){
            System.out.println("Las cadenas son identicas");
        }
        else{
            System.out.println("Las cadenas son diferentes");
        }
        
    }
    
}
