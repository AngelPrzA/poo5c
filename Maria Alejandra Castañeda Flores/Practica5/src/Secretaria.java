/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;
/**
 *
 * @author samf3
 */
public class Secretaria extends Jefe{
    //variables de clase
    public String puesto;
    public String horario;
    
    //Constructor vacio
    public Secretaria(){
        this.puesto="";
        this.horario="";
        
        
    }
    //constructor con parametros hijo
    public Secretaria(String nombre, String telefono, String direccion,String puesto, String horario){
        //Invocacion de clase constructor de la clase padre
        super(nombre , telefono ,direccion);
        this.puesto=puesto;
        this.horario=horario;
        
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }


    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
