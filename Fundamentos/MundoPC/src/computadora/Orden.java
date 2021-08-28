
package computadora;


public class Orden {
    private int idOrden;
    private int maxComputadora = 10;
    private Computadora computadoras[] = new Computadora[maxComputadora];
    private static int contadorOrdenes;
    private int contadorComputadora = 0;
    
    public Orden(){
       Orden.contadorOrdenes++;
       this.setIdOrden(Orden.contadorOrdenes);
    }
    
    
    public void agregarComputadora(Computadora computadora){
        
        if(this.getContadorComputadora() < this.maxComputadora){
            this.computadoras[this.getContadorComputadora()] = computadora;
            this.setContadorComputadora(this.getContadorComputadora() + 1);
            System.out.println("Agregado con Éxito");
        }else{
            System.out.println("No se puede agregar más");
        }
        
    }

    
    public void mostrarOrden(){
        for(int i=0;i<this.getContadorComputadora(); i++){
            System.out.println("Orden : ");
            System.out.println(this.computadoras[i]);
        }
    }
    
    
    public int getIdOrden() {
        return idOrden;
    }

    private void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public static int getContadorOrdenes() {
        return contadorOrdenes;
    }

    public static void setContadorOrdenes(int contadorOrdenes) {
        Orden.contadorOrdenes = contadorOrdenes;
    }

    public int getContadorComputadora() {
        return contadorComputadora;
    }

    public void setContadorComputadora(int contadorComputadora) {
        this.contadorComputadora = contadorComputadora;
    }
    
    
}
