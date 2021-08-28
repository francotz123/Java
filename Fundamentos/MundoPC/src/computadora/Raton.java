
package computadora;

public class Raton extends DispositivoEntrada{
    private int idRaton ;
    private static int contadorRatones ;
    
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        Raton.contadorRatones++;
        this.setIdRaton(contadorRatones);
    }

    public int getIdRaton() {
        return idRaton;
    }

    private void setIdRaton(int idRaton) {
        this.idRaton = idRaton;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{idRaton=").append(idRaton);
        sb.append(" {").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
