/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

/**
 *
 * @author arendycuahutencosdiyarza
 */
public class Usuario {
     //Variables de clase 
    private String nombre;
    private String correo;
    
    //Constructor vacio
    public Usuario(){
        this.nombre =" ";
        this.correo =" ";    
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}//end of class Ususario


