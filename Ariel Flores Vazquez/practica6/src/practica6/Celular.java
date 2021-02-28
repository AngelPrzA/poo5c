/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

/**
 *
 * @author Ariel Flores
 */
public abstract class Celular {
    private String marca;
    private String procesador;
    private String diagonaldepantalla;
    private String tamanobateria;
    private String modelo;
    
    
    //constructor vacio
    public Celular () {
        this.marca = "";
        this.procesador = "";
        this.diagonaldepantalla = "";
        this.tamanobateria = "";
        this.modelo = "";
    
    }
    //metodo
    public String imprimirInformacion(){
        return"La maraca de mi telefono es:   "+marca
                +" y ademas tiene tiene una pantalla de "+diagonaldepantalla
                +"pulgadas";
    }
    public abstract String imprimirMarca();
    
}
