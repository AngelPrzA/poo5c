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
//Clase hijo
public class Samsung extends Celular {

    @Override
    public String imprimirInformacion(){
        return "Esto se esta imprimiendo donde la clase hijo de Samsung";
    }
    
    @Override
    public String imprimirMarca() {
         return "Este es un celular de marca Samsung";
    }
    
    
}
