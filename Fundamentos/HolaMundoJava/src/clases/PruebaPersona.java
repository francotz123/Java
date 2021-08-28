
package clases;

public class PruebaPersona {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Franco","Telliz");
        if(persona1.getApellido() == "Telliz"){
            System.out.println("Soy Yo"); 
        }else{
            System.out.println("No soy yo");
        }
        
    }
}
