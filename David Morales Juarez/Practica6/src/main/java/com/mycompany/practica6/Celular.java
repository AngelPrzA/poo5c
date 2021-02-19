/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica6;

/**
 *
 * @author DAVID
 */
public abstract class Celular {
    private String marca;
    private String procesador;
    private String diagonaldepantalla;
    private String tamanoBateria;
    private String modelo;
    
    public Celular(){
        this.marca="";
        this.procesador="";
        this.diagonaldepantalla="";
        this.tamanoBateria="";
        this.modelo="";   
    }
    public String imprimirInformacion(){
        return"la marca de mi tlefono es:"+marca
                +"y ademas tiene una pantalla de"+diagonaldepantalla
                +"pulgadas";
    }
    public abstract String imprimirMarca();
            
}
