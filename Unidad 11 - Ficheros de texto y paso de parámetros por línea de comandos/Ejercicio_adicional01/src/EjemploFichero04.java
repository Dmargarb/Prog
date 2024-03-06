import java.io.File;

/**
 * Ejemplo de uso de la clase File
 * Listado de los archivos del directorio actual
 *
 *
 */

class EjemploFichero04 {
  public static void main(String[] args) {

    File f = new File("C:\\Users\\Luma\\Documents\\Grado\\Entornos de desarrollo\\Prog\\lib"); // se indica la ruta entre comillas
    // el punto (.) es el directorio actual

    String[] listaArchivos = f.list();
    for (String nombreArchivo : listaArchivos) {
      System.out.println(nombreArchivo);
    }
  }
}
