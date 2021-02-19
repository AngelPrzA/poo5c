/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author arendycuahutencosdiyarza
 */
public abstract class Celular {
  // Variables de clase 
    private String marca;
    private String procesador;
    private String diagonalDepantalla;
    private String tamanoBateria;
    private String modelo;
    
    //Constructor vacio.
    public Celular(){
    this.marca = "";
    this.procesador ="";
    this.diagonalDepantalla ="";
    this.tamanoBateria ="";
    this.modelo ="";
    
    }
 
    //metodo
    public String imprimirInformacion(){
       return"La marca de mi telefono es; "+marca
               +"y ademas tiene una pantalla de " +diagonalDepantalla
               +"pulgadas";  
    }
    
public abstract String imprimirMarca();
 }  