/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;
/**
 *
 * @author samf3
 */
public class Jefe {
    //variables de clase
    public String nombre;
    public String telefono;
    public String direccion;
    
    
    //Constructor vacio
    public Jefe(){
        this.nombre="";
        this.telefono="";
        this.direccion="";
        
        
        
    }
    //constructor con parametros padre
    public Jefe(String nombre,String telefono,String direccion){
        this.nombre=nombre;
        this.telefono=telefono;
        this.direccion=direccion;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

   
}
