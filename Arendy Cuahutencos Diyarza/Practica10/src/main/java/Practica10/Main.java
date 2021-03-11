/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica10;

/**
 *
 * @author arendycuahutencosdiyarza
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Archivo archivo = new Archivo("archivos/personas.txt"); 
        String temp = archivo.leer();
        System.out.println(temp);
        
        archivo.escribir("archivos/nuevo_archivo.txt", false);
    }
    
    
}
