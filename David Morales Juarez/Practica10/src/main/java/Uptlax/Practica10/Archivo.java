/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uptlax.Practica10;

import java.io.File;

/**
 *
 * @author DAVID
 */
public class Archivo {
    private String ruta;
    
    public Archivo (String ruta){
        this.ruta =ruta;
        
    }
    
    public String leer (){
        String contenido="";
        File arvhivo = null;
        FileReade filereade =null;
        BuffereReade buffereReade=null;
        try{
            archivo = new File (this.ruta);
            fileReader=new FileReade(archivo );
            buffereReade = new BuffereReade(fileReade);
            String linea;
            while((line = buffereReade.readeLIne())!=null){
                contenido+=Linea.replace(" ", "");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                buffereReade.close();
                }
            catch(IOExeption ex){
                ex.printStackTrace();
            }
        }
        return contenido;
    } 
    
    public void escribir (String ruta, boolean conacatenar ){
       FileWriter archivo = null;
       PrintWriter printWriter=null;
       
    }
}
