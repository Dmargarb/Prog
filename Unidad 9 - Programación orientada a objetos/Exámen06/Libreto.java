/**
 *
 * Definición de la clase Libreto
 * 
 * @author David Martín García
 */
public class Libreto {

    private int identificador;
    private String titulo;
    private int anioDePublicacion;

    /**
     * @param identificador     El identificador del libreto
     * @param titulo            El título del libro
     * @param anioDePublicacion el año de publicación
     */
    public Libreto(int identificador, String titulo, int anioDePublicacion) { // Constructor
        this.identificador = identificador;
        this.titulo = titulo;
        this.anioDePublicacion = anioDePublicacion;
    }

    public int getIdentificador() { // Getter
        return this.identificador;
    }

    public String getTitulo() { // Getter
        return this.titulo;
    }

    public int getAnioDePublicacion() { // Getter
        return this.anioDePublicacion;
    }

    public String toString() { // toString
        return "\nDatos del Libreto -> Identificador: " + identificador + ", titulo: "
                + titulo + ", año de publicación: " + anioDePublicacion + ".";
    }
}
