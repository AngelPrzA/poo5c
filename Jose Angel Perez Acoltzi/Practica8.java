/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author AngelPerez
 */
public class Practica8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //El arreglo de objetos esta vacio
            //ArrayList<Usuario> arreglo= new ArrayList<>();
            //arreglo.get(O).getCorreo();
            int a=10,b=11;
          
            if (a > b){
                System.out.println("Todo esta bien");
                //Mas codigo de la ejecucion de nuestro programa
 
            }
            else{
                throw new IOException();
            }
        }
        catch (IOException e) {
            System.out.println("Esto es un error de lectura y escritura de archivos"+e.getMessage());
        }
        //Este es un error de jerrarquia menor
        catch(ArrayIndexOutOfBoundsException e ){
        System.out.println("Esto es un error "+e.getMessage());    
    }
    finally{
            System.out.println("Aca pueden poner codigo que quieren que se ejecute despues de la exception");
    }
}
}
  
