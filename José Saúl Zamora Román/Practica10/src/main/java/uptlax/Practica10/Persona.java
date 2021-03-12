/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uptlax.Practica10;

import java.io.Serializable;

/**
 *
 * @author JoséSaúlZamoraRomán
 */
public class Persona implements Serializable{
    //Variables de clase
    private String id;
    private String imagen;
    private String edad;
    private String nombre;
    private String compania;
    private String email;
    private String telefono;
    private String direccion;
    private String acerca_de;
    
    //Constructor vacio
    public Persona (){
        this.id = "";
        this.imagen = "";
        this.edad = "";
        this.nombre = "";
        this.compania = "";
        this.email = "";
        this.telefono = "";
        this.direccion = "";
        this.acerca_de = "";
        
    }
    
}
