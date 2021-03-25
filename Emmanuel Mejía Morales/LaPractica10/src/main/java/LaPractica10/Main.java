/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaPractica10;

import LaPractica10.Uptlax.Persona;
import LaPractica10.Uptlax.Personas;


/**
 *
 * @author armma
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Archivo archivo = new Archivo("archivos/personas.txt"); 
        String temp = archivo.leer();
        System.out.println("Este es el Json"+temp);
        try{
            Gson gson = new Gson();
            Personas arregloPersonas= gson.fromJson(temp, Personas.class);
            System.out.println("Nuestro arreglo de personas contiene"+arregloPersonas.getPersonas().size());
            for(int i= 0;i < arregloPersonas.getPersonas().size();i++){
                System.out.println("Numero de persona: "+i);
                System.out.println("El nombre de la persona es:  "+arregloPersonas.getPersonas().get(i).getNombre().getNombre());
                System.out.println("La esdad  es:  "+arregloPersonas.getPersonas().get(i).getEdad());
            }
        }catch(Exception e){
            System.out.println(e.getMessage());    
        }
        
        /*
        
        System.out.println(temp);
        
        archivo.escribir("archivos/nuevo_archivo.txt","Esto es nuevo", false);
        Persona persona = new Persona();
        persona.setNombre("Andres");
        persona.setTelefono("2642215003");
        persona.setId("234342");
        persona.setEdad("18");
        persona.setCompania("La tiendita de la esquina");
        
        archivo.escribirObjeto(persona,"archivos/persona.data");
        Persona personaDesdeArchivo = archivo.leerObjeto("archivos/persona.data");
        System.out.println(personaDesdeArchivo.getNombre());
        System.out.println(personaDesdeArchivo.getCompania());
    */
}
    
    
}
