/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uptlax.Practica10;
import java.io.Serializable;
/**
 *
 * @author Itzel
 */
public class Persona implements Serializable {
    //VARIABLES DE CLASE
    private String id;
    private String nombre;
    private String correo;
    private String edad;
    private String compania;
    private String email;
    private String telefono;
    private String direccion;
    private String acerca_de;
    
    //CONSTRUCTOR VACIO
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
    
    //GETTERS
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getEdad() {
        return edad;
    }

    public String getCompania() {
        return compania;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getAcerca_de() {
        return acerca_de;
    }
    //SETTERS

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setAcerca_de(String acerca_de) {
        this.acerca_de = acerca_de;
    }   
}