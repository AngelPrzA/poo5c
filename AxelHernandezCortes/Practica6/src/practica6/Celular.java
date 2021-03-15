/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

/**
 *
 * @author Valeria
 */
public abstract class Celular {
    // variables de clase 
    private String marca;
    private String procesador;
    private String diagonaldepantalla;
    private String tamañodebateria;
    private String modelo;
    
    //Constructo vacio
    public Celular (){
        this.marca="";
        this.procesador="";
        this.diagonaldepantalla="";
        this.tamañodebateria="";
        this.modelo="";
}
    public String imprimirInformacion(){
        return "la marca de mi telefono es"+marca+
                "y ademas tiene una pantalla de"+diagonaldepantalla+
                "pulgadas";
    
    }
    
    public abstract String imprimirmarca();
    
}
