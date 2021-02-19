/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

/**
 *
 * @author jacqu
 */
//Clase Padre
public abstract class Celular {
    //Variables de clase
    private String marca;
    private String procesador;
    private String diagonaldePantalla;
    private String tamanoBateria;
    private String modelo;
    
    //Constructor vacio
    public Celular (){
        this.marca = "";
        this.procesador = "";
        this.diagonaldePantalla = "";
        this.tamanoBateria = "";
        this.modelo = "";
    }
    
    //método
    public String imprimirInformacion (){
        return "La marca de mi telefono es: "+marca
                +" y además tienen una pantalla de "+diagonaldePantalla
                +" pulgadas";
    }
    
    //método abstract
    public abstract String imprimirMarca();
}
