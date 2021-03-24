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
public class CalendarioMexico implements IFecha, DiasFestivos {

    @Override
    public String dia() {
       return ""; 
    }

    @Override
    public String mes() {
        return "";
    
    }

    @Override
    public String anio() {
        return "";
    }

    @Override
    public String festivosMexico() {
        String festivo = "";
        if (IFecha.DIA_DE_SEMANA == 15 & IFecha.MES_DEL_ANIO == 9) {
            festivo = "Guerra de la independencia de mexico";
        }
        else {
            festivo = "No se encuentra ningun festivo";
        }
        return festivo;
    }

    @Override
    public String conmemorativo() {
       return "";
    }
    
    
}
