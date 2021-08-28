
package mx.com.gm.peliculas.datos;

import java.util.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

public interface AccesoDatos {
    
    public abstract boolean existe(String nombreArchivo) throws AccesoDatosEx;
    
    public abstract List<Pelicula> listar(String nombre)throws LecturaDatosEx;
    
    public abstract void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;
    
    public abstract String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;
    
    public abstract void crear(String nombreArchivo) throws AccesoDatosEx;
    
    public abstract void borrar(String nombreArchivo) throws AccesoDatosEx;
    
}
