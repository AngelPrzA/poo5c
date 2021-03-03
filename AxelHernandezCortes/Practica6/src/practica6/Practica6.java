/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;
import java.util.ArrayList;

/**
 *
 * @author Valeria
 */
public class Practica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // este es una variable de tipo Poliformica
        ArrayList<Celular> arreglo = new ArrayList<>();
        
        arreglo.add(new Samnsung());
        arreglo.add(new Huawei());
        
        System.out.println(arreglo.get(0).imprimirmarca());
        System.out.println(arreglo.get(1).imprimirmarca());
        
        System.out.println(arreglo.get(0).imprimirInformacion());
        System.out.println(arreglo.get(1).imprimirInformacion());
    }
    
}
