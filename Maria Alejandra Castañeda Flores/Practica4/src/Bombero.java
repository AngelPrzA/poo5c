/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;
/**
 *
 * @author samf3
 */
public class Bombero extends Persona {
    //Variables de clase
    public String estacion;
    public String anios_servicio;
    public String unidad;
    
    //Constructor vacio
    public Bombero(){
       this.estacion="";
       this.anios_servicio="";
       this.unidad="";
        
    }
    //Constructor con parametros
    public Bombero(String estacion,String anios_servicio, String unidad){
        this.estacion=estacion;
        this.anios_servicio=anios_servicio;
        this.unidad=unidad;
                
    }

    public Bombero(String nombre, String curp, String numero_pasaporte, String estacion) {
        super(nombre,curp,numero_pasaporte);
        this.estacion=estacion;
    }
    
    public String getEstacion(){
        return estacion;
    }
    public void setEstacion(String estacion){
        this.estacion=estacion;
    }
    public String getAnios_servicio(){
        return anios_servicio;
    }
    public void setAnios_servicio(String anios_servicio){
        this.anios_servicio=anios_servicio;
    }
    public String getUnidad(){
        return unidad;
    }
    public void setUnidad(String unidad){
        this.unidad= unidad;
    }
}
        
    
           
    

