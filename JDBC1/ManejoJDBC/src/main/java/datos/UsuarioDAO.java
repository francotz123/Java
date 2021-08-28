
package datos;

import static datos.Conexion.getConnection;
import domain.Persona;
import domain.Usuario;
import java.sql.*;
import java.util.*;



public class UsuarioDAO {
    private static final String SQL_SELECT = "SELECT * FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario(usuario, password) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE  usuario SET usuario = ? , password = ? WHERE idusuario = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE idusuario = ?";
    
     public List<Usuario> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        Usuario usuario = null;
        ResultSet st = null;
        List<Usuario> usuarios = new ArrayList();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            st = stmt.executeQuery();
            while (st.next()) {
                int idUsuario = st.getInt("idusuario");
                String usuarioName = st.getString("usuario");
                String password = st.getString("password");
                usuario = new Usuario(idUsuario, usuarioName, password);
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(conn);
                Conexion.close(stmt);
                Conexion.close(st);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }

        return usuarios;
    }
     
     
     public int insertar(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            registros = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(conn);
                Conexion.close(stmt);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }
        return registros;

    }
     
     public int actualizar(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            stmt.setString(3, String.valueOf(usuario.getIdUsuario()));
            registros = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(conn);
                Conexion.close(stmt);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }
        return registros;

    }
     
     public int eliminar(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, String.valueOf(usuario.getIdUsuario()));
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(conn);
                Conexion.close(stmt);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
