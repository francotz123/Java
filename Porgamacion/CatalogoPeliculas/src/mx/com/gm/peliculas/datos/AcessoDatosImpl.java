
package mx.com.gm.peliculas.datos;

import java.io.*;
import java.util.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;


public class AcessoDatosImpl implements AccesoDatos{

    @Override
    public boolean existe(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombre) throws LecturaDatosEx {
        var archivo = new File(nombre);
        List<Pelicula> peliculas = new ArrayList();
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            
            while(linea != null){
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            throw new LecturaDatosEx("Excepcion listar peliculas " + ex.getMessage());
        } catch (IOException ex) {
            throw new LecturaDatosEx("Excepcion listar pelicula" + ex.getMessage());
        }
        
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx{
        File archivo = new File(nombreArchivo);
        try {
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.getNombre());
            salida.close();
            System.out.println("Se ha agregado al archivo");
        } catch (IOException ex) {
            throw new EscrituraDatosEx("Excepcion escribir pelicula" + ex.getMessage());
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        var archivo = new File(nombreArchivo);
        String resultado = null;
        int indice = 0;
        
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            
            while(linea != null){
                if(buscar != null && buscar.equalsIgnoreCase(linea)){
                    resultado = "Pelicula: " + linea + " econtrado en el indice: " + indice;
                    break;
                }
                linea = entrada.readLine();
                indice++;
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            throw new LecturaDatosEx("Excepcion listar peliculas " + ex.getMessage());
        } catch (IOException ex) {
            throw new LecturaDatosEx("Excepcion listar pelicula" + ex.getMessage());
        }
        
        return resultado;
    }

    @Override
    public void crear(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void borrar(String nombreArchivo) {
        var archivo =  new File(nombreArchivo);
        if(archivo.exists()){
            archivo.delete();
            System.out.println("Archivo borrado");
        }else{
            System.out.println("No se encontró el archivo");
        }
    }
    
}
