/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica8;

import java.io.IOException;

/**
 *
 * @author DAVID
 */
public class Practica8 {
     public static void main(String[] args) {
        
        try{
            //El arreglo de objetos está vacío
            //ArrayList<Usuario> arreglo = new ArrayList<>();
            //arreglo.get(0).getCorreo();
            //throw new ArrayIndexOutOfBoundsException();
            
            int a=10, b=13;
            
            if(a>b) {
                System.out.println("Todo está bien");
            }
            else{
                throw new IOException();
            }
        }
        
        catch(IOException e){
            System.out.println("Este es un error de lectura y escritura de archivos");
        }
        
        //Este error es de jerarquia menor
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Acabas de entrar a un error de posicion de arreglo");
        }
        
        //Este error es de jerarquia mayor.
        catch (Exception e){
            System.out.println("Esto es un error "+e.getMessage());
        }
        finally{
            System.out.println("Aca pueden poner codigo que quieren que se ejecute despues de una exception");
        }
    }
}

