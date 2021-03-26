/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica12;

/**
 *
 * @author Jorge Luis Mendoza
 */
import Practica12.Practic12.Friends;
import Practica12.LaPractica12.Friend;
import Practica12.LaPractica12.Persona;
import Practica12.LaPractica12.Name;
import Practica12.LaPractica12.Personas;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Archivo archivo = new Archivo("archivos/JSON.txt");
        String temp = archivo.leer();
        System.out.println("Es es el json "+temp);
        
        try{
            Gson gson= new Gson();
            Personas arreglo= gson.fromJson(temp, Personas.class);
            System.out.println("El arreglo de amigos contiene: "+arreglo.getPersonas().size());
            for(int i= 0;i < arreglo.getPersonas().size();i++){
                System.out.println("Numero de persona: "+i);
                System.out.println("El nombre de la persona es:  "+arreglo.getPersonas().get(i).getName());
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());    
        }
    }
    
}
