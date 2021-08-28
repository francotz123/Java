
package test;
import java.util.Date;
import person.*;

public class TestPersona {
    
    public static void main(String[] args) {
        Empleado e1 = new Empleado(150.0, "Franco1", "Apelldio", 27);
        Cliente c1 = new Cliente(new Date(), "Cliente1", "Cliente1", 20);
        
       //System.out.println("Empleado = " + e1);
        System.out.println("Cliente = " + c1);
    }
    
}
