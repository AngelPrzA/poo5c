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
public class Policia extends Persona{
    //Variables de clase
    private String patrulla;
    private String medallas;
    private String tipo_casco;
    
    //Constructor vacio
    public Policia(){
    this.patrulla="";
    this.medallas="";
    this.tipo_casco="";
    }
    //Constructor con parametros
    public Policia(String patrulla,String medallas, String tipo_casco){
        this.patrulla=patrulla;
        this.medallas=medallas;
        this.tipo_casco=tipo_casco;
    }
    public String getPatrulla(){
        return patrulla;
        
    }
    public void setPatrulla(String patrulla){
        this.patrulla=patrulla;
    }
    public String getMedallas(){
        return medallas;
    }
    public void setMedallas(String medallas){
        this.medallas=medallas;
    }
    public String getTipo_casco(){
        return tipo_casco;
    }
    public void setTipo_Casco(String tipo_casco){
        this.tipo_casco=tipo_casco;
    }
    
    
    
}
