/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;
/**
 *
 * @author samf3
 */
public class Automovil {
    //variables de clase
    private String marca;
    private int anio;
    private int num_puertas;
    
    //Constructor vacia
    public Automovil(){
        this.marca="";
        this.anio=0;
        this.num_puertas=0;
        
    }
    //Constructor con parametros padre
    public Automovil(String marca,int anio,int num_puertas){
        this.marca=marca;
        this.anio=anio;
        this.num_puertas=num_puertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNum_puertas() {
        return num_puertas;
    }

    public void setNum_puertas(int num_puertas) {
        this.num_puertas = num_puertas;
    }
    
    
}
