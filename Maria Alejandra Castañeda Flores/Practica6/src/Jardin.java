/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;
/**
 *
 * @author samf3
 */
public class Jardin {
    //variables de clase
    private String flor;
    private String nombre;
    private String diseño;
    private String color;
    private String aroma;
    private String tipo;
    
    //constructor vacio
    public Jardin(){
    this.flor="";
    this.nombre="";
    this.diseño="";
    this.color="";
    this.aroma="";
    this.tipo="";
}//end constructor
    
    void setFlor(String flor) {
        this.flor=flor;
    }
    void setNombre(String nombre){
        this.nombre=nombre;
    }
    void setDiseño(String diseño){
        this.diseño=diseño;
    }
    void setColor(String color){
        this.color=color;
    }
    void setAroma(String aroma){
        this.aroma=aroma;
    }      
    void setTipo(String tipo){
        this.tipo=tipo;
    }//end of setFlor
    public String getFlor() {
        return flor;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDiseño() {
        return diseño;
    }
    public String getColor() {
        return color;
    }
    public String getAroma() {
        return aroma;
    }
    public String getTipo() {
        return tipo;
    }//end of get
     public void absorcion(){
    System.out.println("Esta absorbiendo con las raices el agua y los minerales");
    }//end of absorcion
      public static void circulacion(){
    System.out.println("Estan circulando el agua y los minerales");
    }//end of circulacion
    
       public static void fotosintesis(){
    System.out.println("Se realiza en las hojas, que se orientan hacia la luz y atrapan la luz del sol");
    }//end of fotosintesis
     
        public static void respiracion(){
    System.out.println("Toman oxigeno y expulsan dioxido de carbono");
    }//end of caminar
}
//end of class jardin
    



