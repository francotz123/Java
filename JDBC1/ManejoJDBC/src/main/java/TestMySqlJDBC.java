
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class TestMySqlJDBC {
    public static void main(String[] args) {
        var  url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=True&serverTimezone=UTC&allowPublicKeyRetrival=True";
        
        try {
           // Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conection = DriverManager.getConnection(url,"root", "admin");
           Statement instruccion = conection.createStatement();
           String sql = "SELECT idpersona, nombre, apellido FROM persona;";
           ResultSet resultado = instruccion.executeQuery(sql);
           while(resultado.next()){
               System.out.print(" id " + resultado.getInt("idpersona"));
               System.out.print(", nombre = "+ resultado.getString("nombre"));
               System.out.print(", apellido = "+ resultado.getString("apellido"));
           }
           resultado.close();
           instruccion.close();
           conection.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
