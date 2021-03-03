/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8;

/**
 *
 * @author Antonio Conde
 */
public abstract class Celular {
    //Variables de clase.
    private String marca;
    private String procesador;
    private String diagonalPantalla;
    private String tamanioBateria;
    private String modelo;
    
    //Constructor vacío.
    public Celular() {
    this.marca = "";
    this.procesador = "";
    this.diagonalPantalla = "";
    this.tamanioBateria = "";
    this.modelo = ""; 
    }
    
    //Métodos.
    public String imprimirInformacion() {
        return "La marca de mi telefono es: "+marca
                +" y además tiene una pantalla de "+diagonalPantalla
                +" pulgadas";
    }
    
    public String imprimirMarca() {
        return "Este mensaje sale del método imprimir marca y la marca de este telefono es: "+marca;
    }
}
