/**
 *
 * Definición de la clase Publicacion
 * 
 * @author David Martín García
 */
public abstract class Publicacion {

    private String titulo;
    private int anioDePublicacion;

    /**
     * @param titulo            El título del libro
     * @param anioDePublicacion el año de publicación
     */
    public Publicacion(String titulo, int anioDePublicacion) { // Constructor
        this.titulo = titulo;
        this.anioDePublicacion = anioDePublicacion;
    }

    public String getTitulo() { // Getter del título
        return titulo;
    }

    public int getAnioDePublicacion() { // Getter del año de publicación
        return anioDePublicacion;
    }

    public String toString() { // toString que muestra los datos
        return "Título: " + titulo + ", Año de Publicación: " + anioDePublicacion;
    }

}
