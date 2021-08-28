
package testventas;

import ventas.Producto;


public class VentaTest {
    
    public static void main(String[] args) {
        Producto product1 = new Producto("Iphone 6",50000.0);
        Producto product2 = new Producto("Iphone 7",100000.0);
        product1.setNombre("Iphone 8");
        System.out.println(product1.getNombre());
        
    }
  
    
}
