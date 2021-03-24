/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica11;

/**
 *
 * @author Antonio Conde
 */
public class MiCalendario implements IFecha, DiasFestivos {

    
    //Sobrescritura de metodos.
    @Override
    public String dia() {
        String dia = " ";
        if(IFecha.DIA_DE_SEMANA == 1){
          dia = "Lunes";  
        }
        return "El día "+IFecha.DIA_DE_SEMANA+ " es: "+dia;
    }

    @Override
    public String mes() {
        String mes = "";
        if(IFecha.MES_DEL_ANIO == 1) {
            mes = "Enero";
        }
        return "El mes " +IFecha.MES_DEL_ANIO+" es "+mes;
    }

    @Override
    public String anio() {
        String anio = "";
        if (IFecha.ANIO == 2021) {
            anio = "Año pasado";
        }
        return "El año "+IFecha.ANIO+ "es "+anio;
    }

    @Override
    public String festivosMexico() {
       String festivo = "";
       if(IFecha.DIA_DE_SEMANA == 8 & IFecha.MES_DEL_ANIO == 9) {
           festivo = "Felicidades por algo";
       }
     return "";   
    }

    @Override
    public String conmemorativo() {
     
        return "";
    }
    
}
