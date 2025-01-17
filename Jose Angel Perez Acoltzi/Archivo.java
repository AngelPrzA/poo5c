/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uptlax.Practica10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;        


/**
 *
 * @author AngelPerez
 */
public class Archivo {
   //Variable de clase 
    private String ruta;
    
    //Constructor con parametros
    public Archivo(String ruta){
        this.ruta = ruta;
    }
    
    //MÈtodos de clase
    public String leer(){
        String contenido = "";
        File archivo = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            archivo = new File(this.ruta);
            fileReader = new FileReader(archivo);
            bufferedReader = new BufferedReader(fileReader);
            String linea;
            while((linea = bufferedReader.readLine())!= null){
               contenido += linea.replace(" ",""); 
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
            bufferedReader.close();
        } catch (IOException ex){
            ex.printStackTrace();
            }
        }
        return contenido;
    
    }
    
    public void escribir(String ruta, boolean concatenar){
        FileWriter archivo = null;
        PrintWriter printWriter = null;
        try{
            archivo = new FileWriter(ruta, concatenar);
            printWriter = new PrintWriter(archivo);
            for(int i = 0; i < 10; i++){
                printWriter.println("Linea: "+i);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                archivo.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }
            
        }
    }
}
 
    

