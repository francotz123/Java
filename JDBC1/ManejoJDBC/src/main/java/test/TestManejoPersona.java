
package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.*;


public class TestManejoPersona {
    public static void main(String[] args) {
        PersonaDAO persona = new PersonaDAO();
        List<Persona> personas = new ArrayList();
        
        personas = persona.seleccionar();
        
        for(Persona person : personas){
            System.out.println("Persona: " + person.getNombre());
        }
        
        Persona persona2 = new Persona("Uriel2", "Alves2", "uriel@gmail.com", "21312312");
        persona2.setIdPersona(5);
        //Persona persona1 = new Persona(4);
       // persona.eliminar(persona1);
        persona.actualizar(persona2);
    }
}
