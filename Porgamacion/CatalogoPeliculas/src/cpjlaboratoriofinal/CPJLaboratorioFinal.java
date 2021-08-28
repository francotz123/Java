package cpjlaboratoriofinal;

import java.util.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;
import mx.com.gm.peliculas.negocio.*;

public class CPJLaboratorioFinal {

    public static void main(String[] args) throws EscrituraDatosEx, AccesoDatosEx, LecturaDatosEx {
        comenzar();
    }

    public static void comenzar() throws AccesoDatosEx{
        Scanner sc = new Scanner(System.in);
        int opcion;

        String menu = """
                      Elige opcion: 
                       1.- Iniciar catalogo peliculas 
                       2.- Agregar pelicula 
                       3.- Listar Peliculas 
                       4.- Buscar Pelicula 
                       0.- Salir""";

        do {
            System.out.println(menu);
            opcion = comprobarOpcion(sc.nextLine());
        } while (opcion == -1);

        realizarOpcion(opcion);
    }
    
    
    public static void realizarOpcion(int opcion) throws EscrituraDatosEx, AccesoDatosEx, LecturaDatosEx {
        String nombreArchivo = "c:\\CatalogoPeliculas\\peliculas.txt";
        Scanner sc = new Scanner(System.in);
        Pelicula pelicula = new Pelicula();
        CatalogoPeliculas catalogoPelicula = new CatalogoPeliculasImpl() {
        };
        switch (opcion) {
            case 1:
                catalogoPelicula.iniciarArchivo(nombreArchivo);
                break;
            case 2:
                System.out.println("Introduce el nombre de una pelicula a agregar: ");
                pelicula.setNombre(sc.nextLine());
                catalogoPelicula.agregarPelicula(pelicula.getNombre(), nombreArchivo);
                break;
            case 3:
                catalogoPelicula.listarPeliculas(nombreArchivo);
                break;
            case 4:
                System.out.println("Introduce el nombre de una pelicula a buscar: ");
                pelicula.setNombre(sc.nextLine());
                catalogoPelicula.buscarPelicula(nombreArchivo, pelicula.getNombre());
                break;
            case 0:
                System.exit(0);
                break;
        }
        seguir();
    }

    public static int comprobarOpcion(String opcionString) {
        int opcion = -1;

        switch (opcionString) {
            case "1":
                opcion = 1;
                break;
            case "2":
                opcion = 2;
                break;
            case "3":
                opcion = 3;
                break;
            case "4":
                opcion = 4;
                break;
            case "0":
                opcion = 0;
                break;
            default:
                System.out.println("Ingrese un valor valido");
                opcion = -1;
        }
        return opcion;
    }

    public static void seguir() throws AccesoDatosEx {
        Scanner sc = new Scanner(System.in);
        String respuesta;
        System.out.println("Desea realizar otra operación? Y/N");
        respuesta = sc.nextLine();
        
        if(respuesta.equals("Y") ||respuesta.equals("y") ){
            comenzar();
        }else{
            System.exit(0);
        }
    }
}
