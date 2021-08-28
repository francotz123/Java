
package computadora;


public class Computadora {
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Raton raton;
    private Teclado teclado;
    private static int totalComputadoras;

    private Computadora(){
        Computadora.totalComputadoras++;
        this.setIdComputadora(Computadora.totalComputadoras);
    }
    
    public Computadora(String nombre, Monitor monitor, Raton raton, Teclado teclado) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.raton = raton;
        this.teclado = teclado;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    private void setIdComputadora(int idComputadora) {
        this.idComputadora = idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computadora{idComputadora=").append(idComputadora);
        sb.append(", ").append(nombre);
        sb.append(", ").append(monitor);
        sb.append(", ").append(raton);
        sb.append(", ").append(teclado);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
