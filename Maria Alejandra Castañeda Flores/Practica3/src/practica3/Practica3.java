/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;
import java.util.ArrayList;
/**
 *
 * @author samf3
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Persona> arreglo = new ArrayList<>();
        Persona personaUno=new Persona();
        personaUno.setNombre("Alelei");
        
        Persona personaDos=new Persona();
        personaDos.setNombre("Fatima");
        
        Persona personaTres= new Persona();
        personaTres.setNombre("Akram");
        
        Persona personaCuatro=new Persona();
        personaCuatro.setNombre("Juan Antonio");
        
        Persona personaCinco=new Persona();
        personaCinco.setNombre("Adán");
        
        arreglo.add(personaUno);
        arreglo.add(personaDos);
        arreglo.add(personaTres);
        arreglo.add(personaCuatro);
        arreglo.add(personaCinco);
        
        //for normal
        
        for (int i=0;i<arreglo.size();i++){
        System.out.println(arreglo.get(i).getNombre());
        }
        //for mejorado
        for(Persona persona:arreglo){
        System.out.println(persona.getNombre());}
        
        //int i=0 ;
        //do{
        //System.out.println(arreglo.get(i).getNombre());
        //i++;
        //}
        //while(i<arreglo.size());
        Persona.caminar();
        
        ArrayList<Persona> arregloDos = new ArrayList<>();
        Persona personaCatorce = new Persona();
        personaCatorce.setNombre("Akram");
        arregloDos.add(personaCatorce);
        
        Persona personaQuince = new Persona();
        personaQuince.setNombre("Adan");
        arregloDos.add(personaQuince);
        
        Persona personaDiezySeis = new Persona();
        personaDiezySeis.setNombre("Alelei");
        arregloDos.add(personaDiezySeis);
        
        ArrayList<ArrayList<Persona>> matriz = new ArrayList<>();
        matriz.add(arreglo);
        matriz.add(arregloDos);
        
        for(int i=0; i<matriz.size();i++)
        {
        for(int j=0; j<matriz.get(i).size();j++){
        System.out.println("El objeto de la matriz con la posición (i="+i+") (j="+j+") es :"+matriz.get(i).get(j).getNombre());
        }
        }
        System.out.println("El numero del arreglo en la matriz es: "+matriz.size());
      
        
        
        System.out.println("El numero de elementos del arreglo son "+arreglo.size());
        
    }
    

    }
    

