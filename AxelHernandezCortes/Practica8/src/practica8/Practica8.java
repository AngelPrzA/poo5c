/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8;
import java.util.ArrayList;
/**
 *
 * @author Valeria
 */
public class Practica8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            ArrayList<Usuario>arreglo= new ArrayList<>();
            arreglo.get(0).getCorreo();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Acabas de entrar en un error de posicion de arreglo"+e.getMessage());
        }
        catch(Exception e){
            System.out.println("Aca pueden poner codigo ue quieren t+yty+  ");
        }
        
    }
    
}
