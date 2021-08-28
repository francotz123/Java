
package caja;


public class Caja {
    double ancho = 3;
    double profundo = 6;
    double alto= 2;

    public Caja(double ancho, double profundo, double alto){
        this.ancho = ancho;
        this.profundo = profundo;
        this.alto = alto;
    }
    public Caja(){
        System.out.println("Constructor activo");
    }
    public double calcularVolumen(){
        return this.getAncho() * this.getAlto() * this.getProfundo();
    }
    
    public double getAncho(){
        return this.ancho;
    }
    public double getProfundo(){
        return this.profundo;
    }
    public double getAlto(){
        return this.alto;
    }
}
