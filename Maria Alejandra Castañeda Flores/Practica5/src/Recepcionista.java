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
public class Recepcionista extends Jefe{
    //variables de clase
    
    public String servicio;
    public String presentacion;
    
    //constructor vacio
    public Recepcionista(){
        
        this.servicio="";
        this.presentacion="";
        
    }
    //constructor con parametros hijo
    public Recepcionista(String nombre, String telefono, String direccion,String puesto, String horario,String servicio,String presentacion){
        //Invocacion de clase constructor de la clase padre
        super(nombre , telefono ,direccion);
        this.servicio=servicio;
        this.presentacion=presentacion;
        
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }
}
