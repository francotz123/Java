/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Cliente extends Persona {
    private Date fechaRegistro;

    public Cliente(Date fechaResgistro, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.fechaRegistro = fechaResgistro;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{fechaRegistro=").append(fechaRegistro);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
