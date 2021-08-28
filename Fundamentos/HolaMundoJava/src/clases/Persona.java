package clases;


public class Persona {
    //Atributos
    String nombre;
    String apellido;

    public Persona(String nom, String ape) {
        this.nombre = nom;
        this.apellido = ape;
    }
    
    
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    
}
