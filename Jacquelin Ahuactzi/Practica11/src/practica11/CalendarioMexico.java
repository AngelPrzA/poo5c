/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica11;

/**
 *
 * @author jacqu
 */
public class CalendarioMexico implements IFecha, Festivos{

    @Override
    public String dia() {
        return "";
    }

    @Override
    public String mes() {
        return "";
    }

    @Override
    public String año() {
        return "";
    }

    @Override
    public String festivo() {
        String festivo = "";
        if(IFecha.DIA_DE_MES == 15 & IFecha.MES_DEL_AÑO == 9){
            festivo = "Guerra de la independencia de México";
        }
        return "festivo";
    }

    @Override
    public String conmemorativo() {
        return "";
    }

    @Override
    public String festivo(int dia, int mes) {
        String festivo ="";
        if(IFecha.DIA_DE_MES == dia & IFecha.MES_DEL_AÑO == mes){
           festivo = "Guerra de la independencia de México";
        }
        else{
           festivo = "No se encuentra ningún día festivo";     
        }
        return festivo;
    }
    
}
