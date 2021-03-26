/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica12;
/**
 *
 * @author samf3
 */
public class CalendarioMexico implements DiasFestivos{

    @Override
    public String festivo() {
        String festivo = "";
        if(IFecha.DIA_DE_MES ==15 & IFecha.MES_DEL_ANIO == 9){
            festivo = "Guerra de la independencia de Mexico";
        }
        return festivo;
    }

    @Override
    public String festivo(int dia, int mes) {
        return "";
    }

    @Override
    public String conmemorativo() {
        return "";
    }
    
}
