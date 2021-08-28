/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.UsuarioDAO;
import domain.Persona;
import domain.Usuario;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class TestManejoUsuario {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        List<Usuario> usuarios = new ArrayList();
        Usuario user = new Usuario(1, "francotz123", "123");
        usuarioDAO.actualizar(user);
        //usuarioDAO.eliminar(user);
        usuarios = usuarioDAO.seleccionar();
        
        for(Usuario usuario : usuarios){
            System.out.println("Usuario: " + usuario.getUsuario());
        }
        
    }
}
