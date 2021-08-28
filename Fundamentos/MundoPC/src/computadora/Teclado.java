
package computadora;


public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        Teclado.contadorTeclados++;
        this.setIdTeclado(contadorTeclados);
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    private void setIdTeclado(int idTeclado) {
        this.idTeclado = idTeclado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{idTeclado=").append(idTeclado);
        sb.append(" {").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
