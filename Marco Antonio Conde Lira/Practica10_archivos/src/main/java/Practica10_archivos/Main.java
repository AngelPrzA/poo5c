/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica10_archivos;

/**
 *
 * @author Antonio Conde
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
        
        archivo.escribir("archivos/nuevo_archivo.txt",false);
        
        Persona persona = new Persona();
        persona.setNombre("Marco");
        persona.setCompania("UPTx");
        persona.setId("1987774151");
        persona.setEdad("20");
        
        archivo.escribirObjeto(persona, "archivos/persona.data");
        
        Persona personaDesdeArchivo = archivo.leerObjeto("archivos/persona.data");
        System.out.println(personaDesdeArchivo.getNombre());
        System.out.println(personaDesdeArchivo.getCompania());
    } 
}
