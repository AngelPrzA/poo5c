/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica11;

import java.io.IOException;

/**
 *
 * @author samf3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Archivo archivo =  new Archivo("archivos/persona.txt");
        String temp = archivo.leer();
        System.out.println(temp);
        
        archivo.escribir("archivos/nuevo_archivo.txt" , "Esto es nuevo", false);
        
        Persona persona = new Persona();
        persona.setNombre("Alelei");
        persona.getCompania("Tesla");
        persona.setId("2");
        persona.getEdad("35");
        
        archivo.escribirObjeto(persona,"archivos/persona.data");
        
        Persona personaDesdeArchivo = archivo.leerObjeto("archivos/persona.data");
        System.out.println(personaDesdeArchivo.getNombre());
        System.out.println(personaDesdeArchivo.getCompania());
        
    }
    
}
