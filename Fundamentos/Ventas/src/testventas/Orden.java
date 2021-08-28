
package testventas;

import ventas.Producto;


public class Orden {
    private static int totalOrden;
    private int idOrden;
    private Producto productos[] = new Producto[10];
    private static final int MAX_PRODUCTOS = 2;
    private int totalProduct = 0;
    public Orden() {
        totalOrden++;
        this.idOrden =totalOrden;
    }
    
    public void agregarProducto(Producto product){
//        for(int i = 0; i < this.productos.length; i++){
//            if(this.productos[i] != null){
//                this.totalProduct++;
//            }
//        }
                
        if(  totalProduct >= MAX_PRODUCTOS){
            System.out.println("No tiene más capacidad para agregar otro Producto");
        }else{
            totalProduct++;
            this.productos[this.totalProduct - 1] = product;
            System.out.println("Agregado con éxito");
        }
    }
    
    public double calcularTotal(){
        double total = 0.0;
        for(int i = 0; i < this.totalProduct; i++){
            total += this.productos[i].getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        for(int i = 0; i < this.totalProduct; i++){
            System.out.println("Productos: " + this.productos[i]);
        }
        
        double total = this.calcularTotal();
        
        System.out.println("Total a pagar $"+total);
    }
    
}
