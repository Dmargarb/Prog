package gestorvideojuegos;

/**
 *
 * @author @date Apr 24, 2024, 5:06:10 PM
 */
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Map;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GestorJSON {

  private final ArrayList<Videojuego> listaVideojuegos;

  public GestorJSON() {
    this.listaVideojuegos = new ArrayList<>();
  }

  public void importarJSON(String nombreFichero, String cadenaBusqueda) {
    try {
      JSONParser parser = new JSONParser();
      Reader reader;
      reader = new FileReader(nombreFichero);
      Object jsonObj = parser.parse(reader);
      JSONObject jsonObject = (JSONObject) jsonObj;

      // Leemos el conjunto de videojuegos
      Map<Object, Object> videojuegos = (Map<Object, Object>) jsonObject;

      // recorrer el mapa, crear un JSONObject por cada valor y recuperar de él los campos deseados
      // Si cadenaBusqueda es null añadimos al ArrayList todos los videojuegos
      // En otro caso, los añadimos solo si cadenaBusqueda se encuentra contenida en el nombre o la descripción
      for (Map.Entry<Object, Object> entry : videojuegos.entrySet()) {

        JSONObject juego = (JSONObject) entry.getValue();

        String name = (String) juego.get("name");
        String img = (String) juego.get("header_image");
        String desc = (String) juego.get("short_description");

        if (cadenaBusqueda == null || cadenaBusqueda.equals("") || (name.toLowerCase()).contains(cadenaBusqueda.toLowerCase()) || (desc.toLowerCase()).contains(cadenaBusqueda.toLowerCase())) {
          Videojuego videojuego = new Videojuego(name, img, desc);
          listaVideojuegos.add(videojuego);
        }
      }

      // Cerramos el lector
      reader.close();

    } catch (IOException | ParseException ex) {
      System.out.println(ex);
    }
  }

  public ArrayList<Videojuego> getListaVideojuegos() {
    return listaVideojuegos;
  }
}
