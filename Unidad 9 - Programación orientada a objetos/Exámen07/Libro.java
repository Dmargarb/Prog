/**
 *
 * Definición de la clase Libro
 * 
 * @author David Martín García
 */
public class Libro extends Publicacion implements Prestable {

    private String isbn;
    private boolean prestado;

    /**
     * @param isbn              El ISBN del libro
     * @param titulo            El título del libro
     * @param anioDePublicacion el año de publicación
     */
    public Libro(String isbn, String titulo, int anioDePublicacion) { // Constructor
        super(titulo, anioDePublicacion);
        this.isbn = isbn;
        this.prestado = false;
    }

    /**
     * @param isbn              El ISBN del libro
     * @param anioDePublicacion el año de publicación
     */
    public Libro(String isbn, int anioDePublicacion) { // Constructor
        super("Sin título", anioDePublicacion); // El título se establece a "Sin título"
        this.isbn = isbn;
        this.prestado = false;
    }

    @Override
    public void presta() { // Método para prestar el libro
        if (!estaPrestado()) {
            prestado = true;
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    @Override
    public void devuelve() { // Método para devolver el libro
        if (estaPrestado()) {
            prestado = false;
        } else {
            System.out.println("El libro no está prestado.");
        }
    }

    @Override
    public boolean estaPrestado() { // Método para ver si el libro está prestado
        return prestado;
    }

    @Override
    public String toString() { // toString que muestra los datos
        return super.toString() + ", ISBN: " + isbn + ", Prestado: " + (prestado ? "Sí" : "No");
    }
}
