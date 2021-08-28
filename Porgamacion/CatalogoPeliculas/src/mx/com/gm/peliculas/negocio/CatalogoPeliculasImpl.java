package mx.com.gm.peliculas.negocio;

import java.io.*;
import java.lang.System.Logger;
import java.util.*;
import mx.com.gm.peliculas.datos.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

public class CatalogoPeliculasImpl implements CatalogoPeliculas {

    AccesoDatos acceso = new AcessoDatosImpl();

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) throws EscrituraDatosEx {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        try {
            if (acceso.existe(nombreArchivo)) {
                acceso.escribir(pelicula, nombreArchivo, true);
            } else {
                System.out.println("ERROR : El archivo no existe, por favor, creelo utilizando la opcion 1.");
            }
        } catch (AccesoDatosEx ex) {
            throw new EscrituraDatosEx("Excepcion escribir pelicula" + ex.getMessage());
        }

    }

    @Override
    public void listarPeliculas(String nombreArchivo) throws LecturaDatosEx {
        List<Pelicula> peliculas = new ArrayList();
        try {
            if (acceso.existe(nombreArchivo)) {
                for (Pelicula pelicula : acceso.listar(nombreArchivo)) {
                    System.out.println(pelicula.getNombre());
                }
            } else {
                System.out.println("ERROR : El archivo no existe, por favor, creelo utilizando la opcion 1.");
            }
        } catch (AccesoDatosEx ex) {
            throw new LecturaDatosEx("Excepcion al leer las peliculas" + ex.getMessage());
        }
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) throws LecturaDatosEx {
        String resultado = null;
        try {
            if (acceso.existe(nombreArchivo)) {
                resultado = acceso.buscar(nombreArchivo, buscar);
                if( resultado != null){
                    System.out.println(resultado);
                }else{
                    System.out.println("Pelicula no encontrada.");
                }
            } else {
                System.out.println("ERROR : El archivo no existe, por favor, creelo utilizando la opcion 1.");
            }
        } catch (AccesoDatosEx ex) {
            throw new LecturaDatosEx("Excepcion al buscar la pelicula" + ex.getMessage());
        }
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) throws AccesoDatosEx {
        acceso.crear(nombreArchivo);
    }

}
