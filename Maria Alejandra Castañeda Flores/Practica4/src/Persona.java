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
public class Persona {
    //Variables de clase
    public String nombre;
    public String curp;
    public String numero_pasaporte;
    
    
    //Constructor vacio
    public Persona(){
        this.nombre="";
        this.curp="";
        this.numero_pasaporte="";
    }
    //Constructor con parametros
    public Persona(String nombre,String curp,String numero_pasaporte){
        this.nombre=nombre;
        this.curp=curp;
        this.numero_pasaporte=numero_pasaporte;
        
    
        
    }
    public String getNombre(){
        return nombre;
        
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getCurp(){
        return curp;
    }
    public void setCurp(String curp){
        this.curp=curp;
    }
    public String getNumero_pasaporte(){
        return numero_pasaporte;
    }
    public void setNumero_pasaporte(String numero_pasaporte){
        this.numero_pasaporte=numero_pasaporte;
    }
    
        
    
}
