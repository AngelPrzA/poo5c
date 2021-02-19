/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;
/**
 *
 * @author samf3
 */
public class Persona {
    //Variables de clase
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;
    private String correo;
    private String telefono;
    private String municipio;
    private int codigoPostal;
    private String ocupacion;
    private String escolaridad;
    
    
    //Constructor vacio
    public Persona(){
        this.nombre="";
        this.paterno="";
        this.materno="";
        this.edad=0;
        this.correo="";
        this.telefono="";
        this.municipio = "";
        this.codigoPostal = 0;
        this.ocupacion="";
        this.escolaridad="";
        //end of constructor
        
        
    }

    void setNombre(String nombre) {
        this.nombre=nombre;
    }
    void setPaterno(String paterno){
        this.paterno=paterno;
    }
    void setMaterno(String materno){
        this.materno=materno;
    }
    void setEdad(String edad){
        this.edad=0;
    }
    void setCorreo(String correo){
        this.correo=correo;
    }
    void setTelefono(String telefono){
        this.telefono=telefono;
    }   
    void setMunicipio(String municipio){
        this.municipio=municipio;
    }
    void setCodigoPostal(String codigopostal){
        this.codigoPostal=0;
    }
    void setOcupacion(String ocupacion){
        this.ocupacion=ocupacion;
    }
    void setEscolaridad(String escolaridad){
        this.escolaridad=escolaridad;
    }
    
    
//end of setNombre
    public String getNombre() {
        return nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public static void caminar(){
    System.out.println("Estoy caminando");
    }//end of caminar
   
    
   

    

}//end of class Persona
