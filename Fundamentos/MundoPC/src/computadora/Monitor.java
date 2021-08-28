
package computadora;

public class Monitor {
    private int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    public Monitor(){
        Monitor.contadorMonitores++;
        this.setIdMonitor(Monitor.contadorMonitores);
    }
    
    public Monitor(String marca, double tamanio) {
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    private int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor{idMonitor=").append(idMonitor);
        sb.append(", marca=").append(marca);
        sb.append(", tamaño=").append(tamanio + " pulgadas");
        sb.append('}');
        return sb.toString();
    }
    
    
}
