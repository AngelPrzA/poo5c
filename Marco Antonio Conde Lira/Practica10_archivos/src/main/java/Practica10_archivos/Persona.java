/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica10_archivos;

import java.io.Serializable;

/**
 *
 * @author Antonio Conde
 */
public class Persona implements Serializable {
    private String id;
    private String nombre;
    private String correo;
    private String edad;
    private String compania;
    private String email;
    private String telefono;
    private String direccion;
    private String acerca_de;
    
    
    public Persona() {
        this.id = "";
        this.acerca_de = "";
        this.compania = "";
        this.correo = "";
        this.edad = "";
        this.email = "";
        this.nombre = "";
        this.telefono = "";
        this.direccion = "";
    }
}
