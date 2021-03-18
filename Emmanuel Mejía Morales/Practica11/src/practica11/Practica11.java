/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica11;

/**
 *
 * @author armma
 */
public class Practica11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // classe primitivas
        int entero=100;
        double doble=10.50;
        float flotante=11.10f;
        
        System.out.println("El valor del doble es:"+doble);
        System.out.println("El valor casteado del doble es:"+((int)doble));
        
        System.out.println("El valor del entero es:"+entero);
        System.out.println("El valor casteado del enero es:"+((double)entero));
        // Tclase vrapper
        String cadena="";
        Integer enteroClase=10;
        
        Integer enteroClaseDos=20;
        Double dobleClase=10.50;
        Float flotanteClase=11.50f;
        Character caracterclase;
        
        enteroClase.compareTo(enteroClaseDos);
        Integer miEntero = Integer.parseInt("100");
        System.out.println("El valor de la clase es: "+miEntero);
        try{
            Double.parseDouble("t");
        }catch(NumberFormatException ex){
            //ex.printStackTrace();
        }catch(Exception e){
            //e.printStackTrace();
        }
        MiCalendario calendario = new MiCalendario();
        System.out.println(calendario.dia());
        System.out.println(calendario.mes());

        
        
    }
    
}
