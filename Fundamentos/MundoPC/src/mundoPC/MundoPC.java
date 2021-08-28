
package mundoPC;

import computadora.*;
public class MundoPC {
    public static void main(String[] args) {
        Teclado teclado1 = new Teclado("USB", "Logitech");
        Raton raton1 = new Raton("USB", "Genius");
        Monitor monitor1 = new Monitor("LG", 19.0);
        Computadora compu1 = new Computadora("PC express", monitor1, raton1, teclado1);
        
        Teclado teclado2= new Teclado("USB", "Scorpion");
        Raton raton2 = new Raton("USB", "Net");
        Monitor monitor2 = new Monitor("Samsung", 24.0);
        Computadora compu2 = new Computadora("PC Gamer", monitor2, raton2, teclado2);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(compu1);
        orden1.agregarComputadora(compu2);

        orden1.mostrarOrden();
        
    }
    
    
}
