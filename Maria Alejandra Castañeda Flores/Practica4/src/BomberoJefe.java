/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;
/**
 *
 * @author samf3
 */
public class BomberoJefe extends Bombero{
    //variable de clase
    private String rango;
    
    //Constructor vacio
    public BomberoJefe(){
        this.rango="";
    }
    
    //Constructor con parametros
    public BomberoJefe(String rango){
        this.rango=rango;
    }
    
}
