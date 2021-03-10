/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8;

/**
 *
 * @author Valeria
 */
public class Usuario {
    //Variables de clas
    private String Nombre;
    private String Correo;
    
    //Contructor vacio
    public Usuario(){
        this.Correo="";
        this.Nombre="";
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    
}
