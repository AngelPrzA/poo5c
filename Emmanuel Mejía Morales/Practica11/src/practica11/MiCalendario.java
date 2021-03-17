/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica11;

/**
 *
 * @author armma
 */
public class MiCalendario implements IFecha{

    @Override
    public String dia() {
       String dia ="";
        if(IFecha.DIA_DE_MES == 1){
            dia="lunes";
        }else{
            if(IFecha.DIA_DE_MES == 2){
                dia="martes";
            }else{
                if(IFecha.DIA_DE_MES == 3){
                dia="miercoles";
            }else{
                if(IFecha.DIA_DE_MES == 4){
                dia="Jueves";
            }else{
                if(IFecha.DIA_DE_MES == 5){
                dia="viernes";
            }else{
                if(IFecha.DIA_DE_MES == 6){
                dia="sabado";
            }else{
                if(IFecha.DIA_DE_MES == 7){
                dia="domingo";
            }else{
                
            }
            }
            }
            }
            }
            }
        }
        return "El dia"+IFecha.DIA_DE_MES+" es "+dia;
        }

    @Override
    public String mes() {
    String mes ="";
        if(IFecha.MES_DEL_ANIO == 1){
            mes="Enero";
        }else{
            if(IFecha.MES_DEL_ANIO == 2){
                mes="febrero";
            }else{
                if(IFecha.MES_DEL_ANIO == 3){
                mes="marzo";
            }else{
                if(IFecha.MES_DEL_ANIO == 4){
                mes="Abril";
            }else{
                if(IFecha.MES_DEL_ANIO == 5){
                mes="Mayo";
            }else{
                if(IFecha.MES_DEL_ANIO == 6){
                mes="Junio";
            }else{
                if(IFecha.MES_DEL_ANIO == 7){
                mes="Julio";
            }else{
                if(IFecha.MES_DEL_ANIO == 8){
                mes="agosto";
            }else{
             if(IFecha.MES_DEL_ANIO == 9){
                mes="Septiembre";
            }else{
             if(IFecha.MES_DEL_ANIO == 10){
                mes="Octubre";
            }else{
             if(IFecha.MES_DEL_ANIO == 11){
                mes="Noviembre";
            }else{
             if(IFecha.MES_DEL_ANIO == 12){
                mes="diciembre";
            }else{
                
            }   
            }   
            }   
            }   
            }
            }
            }
            }
            }
            }
            }
        }
        return "El mes del año"+IFecha.MES_DEL_ANIO+" es "+mes;
    }

    @Override
    public String anio() {
    return "";
    }
    
}

    
