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
public class Samsung extends Celular {

    @Override
    public String imprimirInformacion() {
        return "esto se esta imprimiendo desde la clase hijo de samsung";
    }
    @Override
    public String imprimirMarca() {
       return "este celular es de marca samsug"; 
    }
    
}
