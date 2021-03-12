/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9;
import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author samf3
 */
public class Practica9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //el arreglo de objetos esta vacio
            //ArrayList<Usuario>arreglo=new ArrayList<>();
            //arreglo.get(0).getCorreo();
            int a=10,b=11;
            if(a < b){
                System.out.println("Todo esta bien");
                //Mas codigo de la ejecuicion de nuestro programa
            }
            else{
                throw new IOException();
                
            }
        }
        catch(IOException e){
            System.out.println("Este es un error de lectura y escritura de archivos"+e.getMessage());
        }
        //este error es de jerarquia menor
        catch(ArrayIndexOutOfBoundsException e){
             System.out.println("Acabas de entrar en un error de posicion de arreglo"+e.getMessage());
        }
        //Este error es de jerarquia mayor
        catch(Exception e){
            System.out.println("Este es un error"+e.getMessage());
        }
        finally{
            System.out.println("Puedes poner codigo despues de una excepcion");
        }
    }
    
}
