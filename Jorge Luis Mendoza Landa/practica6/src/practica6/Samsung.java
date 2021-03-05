/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

/**
 *
 * @author JorgeLuis
 */
public class Samsung extends Celular1 {
     @Override
    public String imprimirInformacion(){
        return"Este este se esta imprimiendo desde la case hijo de Samsung";
    }
    @Override
    public String imprimirMarca(){
        return"Este es un celular de marca Samsung";
    }
    
}
