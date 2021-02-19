/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

import java.util.ArrayList;

/**
 *
 * @author samf3
 */
public class Practica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        ArrayList<Jardin> arreglo = new ArrayList<>();
        Jardin florUno=new Jardin();
        florUno.setNombre("Crisantemo");
        florUno.setDiseño("Suave");
        florUno.setColor("Blanco");
        florUno.setAroma("Sin aroma");
        florUno.setTipo("Soleada");
        
        Jardin florDos=new Jardin();
        florDos.setNombre("Rosa");
        florDos.setDiseño("Espiñoza");
        florDos.setColor("Rosa");
        florDos.setAroma("Dulce");
        florDos.setTipo("Agua y sol");
        
        Jardin florTres=new Jardin();
        florTres.setNombre("Nube");
        florTres.setDiseño("Suave");
        florTres.setColor("Blanca");
        florTres.setAroma("Sin aroma");
        florTres.setTipo("Nublado");
        
        Jardin florCuatro=new Jardin();
        florCuatro.setNombre("Alcatraz");
        florCuatro.setDiseño("Suave");
        florCuatro.setColor("Amarillo");
        florCuatro.setAroma("Dulce");
        florCuatro.setTipo("Soleada");
        
        Jardin florCinco=new Jardin();
        florCinco.setNombre("Girasoles");
        florCinco.setDiseño("Redondo");
        florCinco.setColor("Amarrillo o Marron");
        florCinco.setAroma("Sin Aroma");
        florCinco.setTipo("Soleada");
        
        //Segundo arreglo
        ArrayList<Jardin> arregloDos = new ArrayList<>();
        
        Jardin florSeis=new Jardin();
        florSeis.setNombre("Hortencia");
        florSeis.setDiseño("Suaves");
        florSeis.setColor("Azules");
        florSeis.setAroma("Sin aroma");
        florSeis.setTipo("Soleada");
        
        Jardin florSiete=new Jardin();
        florSiete.setNombre("Tulipan");
        florSiete.setDiseño("Campanita");
        florSiete.setColor("Azul");
        florSiete.setAroma("Sin aroma");
        florSiete.setTipo("Soleada");
        
        Jardin florOcho=new Jardin();
        florOcho.setNombre("Gladiola");
        florOcho.setDiseño("Camote");
        florOcho.setColor("Rosa");
        florOcho.setAroma("Sin aroma");
        florOcho.setTipo("Soleada");
        
        Jardin florNueve=new Jardin();
        florNueve.setNombre("Nardo");
        florNueve.setDiseño("Suave");
        florNueve.setColor("Blanca con rosa");
        florNueve.setAroma("Agradable");
        florNueve.setTipo("Soleada");
        
        Jardin florDiez=new Jardin();
        florDiez.setNombre("Clavel");
        florDiez.setDiseño("Suave");
        florDiez.setColor("Rojo");
        florDiez.setAroma("Sin aroma");
        florDiez.setTipo("Soleada");
        
        arreglo.add(florUno);
        arreglo.add(florDos);
        arreglo.add(florTres);
        arreglo.add(florCuatro);
        arregloDos.add(florCinco);
        arregloDos.add(florSeis);
        arregloDos.add(florSiete);
        arregloDos.add(florOcho);
        arregloDos.add(florNueve);
        arregloDos.add(florDiez);
        
        ArrayList<ArrayList<Jardin>> matriz = new ArrayList<>();
        matriz.add(arreglo);
        matriz.add(arregloDos);
        
        //for mejorado
        for(ArrayList<Jardin> arregloFlor: matriz){
        for(Jardin flor : arregloFlor){
            System.out.println("El nombre es: \n"+flor.getNombre()+"\nEl diseño es:\n"+flor.getDiseño()+"\nEl color de la flor es:\n"+flor.getColor()+"\nEl aroma es:\n"+flor.getTipo());
        }      
   }
        System.out.println("Flor 1");
        florUno.absorcion();
        florUno.circulacion();
        florUno.fotosintesis();
        florUno.respiracion();
        
        System.out.println("Flor 2");
        florDos.absorcion();
        florDos.circulacion();
        florDos.fotosintesis();
        florDos.respiracion();
        
        System.out.println("Flor 3");
        florTres.absorcion();
        florTres.circulacion();
        florTres.fotosintesis();
        florTres.respiracion();
        
        System.out.println("Flor 4");
        florCuatro.absorcion();
        florCuatro.circulacion();
        florCuatro.fotosintesis();
        florCuatro.respiracion();
        
        
        System.out.println("Flor 5");
        florCinco.absorcion();
        florCinco.circulacion();
        florCinco.fotosintesis();
        florCinco.respiracion();
        
        System.out.println("Flor 6");
        florSeis.absorcion();
        florSeis.circulacion();
        florSeis.fotosintesis();
        florSeis.respiracion();
        
        System.out.println("Flor 7");
        florSiete.absorcion();
        florSiete.circulacion();
        florSiete.fotosintesis();
        florSiete.respiracion();
        
        System.out.println("Flor 8");
        florOcho.absorcion();
        florOcho.circulacion();
        florOcho.fotosintesis();
        florOcho.respiracion();
        
        System.out.println("Flor 9");
        florNueve.absorcion();
        florNueve.circulacion();
        florNueve.fotosintesis();
        florNueve.respiracion();
        
        System.out.println("Flor 10");
        florDiez.absorcion();
        florDiez.circulacion();
        florDiez.fotosintesis();
        florDiez.respiracion();
        
        
        
        
    
}
    
    }
    


    
    

