/**
 *
 * Definición de la clase PruebaBiblioteca
 * 
 * @author David Martín García
 */
public class PruebaBiblioteca {
    public static void main(String[] args) {

        Libro[] libros = new Libro[3];
        libros[0] = new Libro("1234", "HTML", 2005);
        libros[1] = new Libro("5678", "Java", 2010);
        libros[2] = new Libro("1122", 2020);

        libros[0].presta();
        libros[0].devuelve();
        libros[1].presta();

        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}