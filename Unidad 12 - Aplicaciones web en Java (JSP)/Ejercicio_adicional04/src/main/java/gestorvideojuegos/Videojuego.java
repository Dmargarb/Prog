package gestorvideojuegos;

/**
 *
 * @author 
 * @date Apr 24, 2024, 5:06:10 PM
 */
public class Videojuego {

    private final String nombre;
    private final String descripción;
    private final String imagen;

    // Constructor
    public Videojuego(String nombre, String imagen, String descripción) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.descripción = descripción;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public String getImagen() {
        return imagen;
    }

    @Override
    public String toString() {
        return "<div class=\"tarjeta\">\n"
             + "    <div class=\"titulo\">" + nombre + "</div>\n"
             + "    <div class=\"descripcion\">" + descripción + "</div>\n"
             + "    <img src=\"" + imagen + "\" alt=\"" + nombre + "\">\n"
             + "</div>\n";
    }
    
}
