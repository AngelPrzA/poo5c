package Practica8;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Valeria
 */
public class Practica8 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        try
        {/*
        ArrayList<Usuario> arreglo=new ArrayList<>();
        arreglo.get(0).getCorreo();
            
*/
            int a=10,b=11;
            if(a > b){
        System.out.println("Todo esta bien");
        //este en caso de que este bien
        }
        else{
            //throw new ArrayIndexOutOfBoundsException();
            throw new IOException();
            }
}
        
        //este es de jeraraquia menor
        catch(IOException e)
        {
            System.out.println("Esta mal el arreglo por posicion de arreglo");   
        }
        //este es de jeraraquia mayor
        catch(Exception e)
        {
            System.out.println("Este es el error"+e.getMessage());  
        }
        finally{
            System.out.println("Aqui se puede agregar el dato");  
        }
       
    }}
