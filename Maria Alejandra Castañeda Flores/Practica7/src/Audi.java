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
public class Audi extends Automovil {
    //variables de clase
    private String equipoSonido;
    private int caballosDeFuerza;
    private boolean deportivo;
    
    //Constructor vacio
    public Audi(){
        this.equipoSonido="";
        this.caballosDeFuerza=0;
        this.deportivo=false;
        
    }
    //Constructor con parametros hijo
    public Audi (String marca, int anio,int num_puertas,String equipoSonido,int caballosDeFuerza,boolean deportivo){
        super(marca,anio,num_puertas);
        this.equipoSonido=equipoSonido;
        this.caballosDeFuerza=caballosDeFuerza;
        this.deportivo=deportivo; 
        
    }

    public String getEquipoSonido() {
        return equipoSonido;
    }

    public void setEquipoSonido(String equipoSonido) {
        this.equipoSonido = equipoSonido;
    }

    public int getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public void setCaballosDeFuerza(int caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }

    public boolean isDeportivo() {
        return deportivo;
    }

    public void setDeportivo(boolean deportivo) {
        this.deportivo = deportivo;
    }
}
