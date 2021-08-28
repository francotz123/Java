
package domain;


public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    static{
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersona;
        //idPersona = 10;
    }
    
    {
        System.out.println("Ejecucion bloque No estatico");
        this.idPersona = Persona.contadorPersona;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }
    
    
}
