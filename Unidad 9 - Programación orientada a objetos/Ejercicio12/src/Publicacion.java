/**
 *
 * Definición de la clase Publicacion
 * 
 * @author David Martín García
 */
public abstract class Publicacion {

    private String codigoISBN;
    private String titulo;
    private int añoDePublicacion;

    public Publicacion(String isbn, String titulo, int año) {
        this.codigoISBN = isbn;
        this.titulo = titulo;
        this.añoDePublicacion = año;
    }

    public String toString() {
        return "ISBN: " + codigoISBN + ", título: " + titulo + ", año de publicación: " + añoDePublicacion;
    }

}
