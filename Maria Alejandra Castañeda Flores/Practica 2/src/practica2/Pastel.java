/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;
/**
 *
 * @author samf3
 */
public class Pastel {
    //Variables de clase//
    String color;
    String tamano;
    String sabor;
    String forma;
    String decoracion;
    
    
    public Pastel(String color, String tamano){
        this.color = color;
        this.tamano = tamano;
    }
    
    //Constructor vacío//
    public Pastel(){
        color = "";
        tamano = "";
        sabor = "";
        forma = "";
    }
    
    public void setcolor(String color){
      this.color = color;  
    }
    public void settamano(String tamano){
        this.tamano = tamano; 
    }
    public void setsabor(String sabor){
        this.sabor = sabor;
    }
    public void setforma(String forma){
        this.forma = forma;
    }
    public void setdecoracion (String decoracion){
        this.decoracion = decoracion;
    }
    public String getColor(){
        return this.color;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setTamano(String tamano) {
        this.tamano = tamano;
    }

    void setSabor(String sabor) {
        this.sabor = sabor;
    }

    void setForma(String forma) {
        this.forma= forma;
    }

    void setDecoracion(String decoracion) {
        this.decoracion= decoracion;
    }

   

    
        
       
    
    
}
