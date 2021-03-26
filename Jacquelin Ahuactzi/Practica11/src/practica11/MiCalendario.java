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
public class MiCalendario implements IFecha, Festivos{
    
    //Sobreescritura de métodos
    @Override
    public String dia() {
        String dia = "";
        if(IFecha.DIA_SEMANA == 1){
            dia = "lunes";
        }
        return "El día "+IFecha.DIA_DE_MES+" es"+dia;
    }
    
    //Sobreescritura de métodos
    @Override
    public String mes() {
        String mes = "";
        if(IFecha.MES_DEL_AÑO ==1){
            mes = "Enero";
        }
        return "El mes "+IFecha.MES_DEL_AÑO+" es "+mes;
    }
    
    //Sobreescritura de métodos
    @Override
    public String año() {
        String año = "";
        if(IFecha.AÑO == 1){
            año = "2001";
        }
       return "El año "+IFecha.AÑO+" es"+año;
    }

    @Override
    public String festivo() {
        String festivo = "";
        if(IFecha.DIA_DE_MES == 8 & IFecha.MES_DEL_AÑO == 9){
            festivo = "Felicidades por tu cumpleaños";
        }
        return "";
    }

    @Override
    public String conmemorativo() {
        return "";
    }

    @Override
    public String festivo(int dia, int mes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
