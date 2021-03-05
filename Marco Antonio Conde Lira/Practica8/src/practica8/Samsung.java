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
public class Samsung extends Celular{
    
    @Override
    public String imprimirInformacion() {
        return "Este mensaje es de la clase hijo Samsung";
    }
    
    @Override
    public String imprimirMarca() {
        return "Este celular es Samsung";
    }
}
