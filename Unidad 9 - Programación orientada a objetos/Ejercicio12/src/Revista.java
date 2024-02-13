/**
 *
 * Definición de la clase Revista
 * 
 * @author David Martín García
 */
public class Revista extends Publicacion {

    private int numero;

    public Revista(String isbn, String titulo, int año, int numero) {
        super(isbn, titulo, año);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString() + " (Nº: " +numero+ ")";
    }

}
