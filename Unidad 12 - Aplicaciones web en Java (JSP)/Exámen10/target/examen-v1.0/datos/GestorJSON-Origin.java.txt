import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class GestorJSON {

  public static void main(String[] args) throws Exception {
    GestorJSON gestor = new GestorJSON();
    gestor.exportarJSON("./src/cliente.json");
    gestor.importarJSON("./src/cliente.json");
  }

  @SuppressWarnings("unchecked")
  public void exportarJSON(String nombreFichero) {
    // Creamos un objeto cliente
    JSONObject cliente = new JSONObject();
    cliente.put("Identificador", 1);
    cliente.put("Nombre", "Pepe Jiménez");
    cliente.put("Correo electrónico", "pepe.jimenez@fpaltanturing.es");
    cliente.put("Edad", 32);

    // Creamos un objeto dirección
    JSONObject dirección = new JSONObject();
    dirección.put("Calle", "Avenida Almogía, 143");
    dirección.put("Ciudad", "Málaga");
    dirección.put("Provincia", "Málaga");
    dirección.put("Código postal", 29007);

    // Añadimos el objeto dirección al cliente
    cliente.put("Dirección", dirección);

    // Añadimos un array con los métodos de pago del cliente
    JSONArray métodosPago = new JSONArray();
    métodosPago.addAll(Arrays.asList("PayPal", "Stripe", "Mastercard"));
    cliente.put("Métodos de pago", métodosPago);

    // Creamos un array para guardar los proyectos del cliente
    JSONArray proyectos = new JSONArray();

    // Creamos el primer proyecto
    JSONObject p1 = new JSONObject();
    p1.put("Título", "Sitio web de un negocio");
    p1.put("Presupuesto", 4500);

    // Creamos el segundo proyecto
    JSONObject p2 = new JSONObject();
    p2.put("Título", "Portal de ventas");
    p2.put("Presupuesto", 8500);

    // Añadimos los proyectos al array 'proyectos'
    proyectos.addAll(Arrays.asList(p1, p2));

    // Añadimos el array 'proyectos' al objeto cliente
    cliente.put("Proyectos", proyectos);

    // Escribimos al fichero
    try {
      FileWriter file = new FileWriter(nombreFichero);
      file.write(cliente.toJSONString());
      file.flush();
      file.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println(cliente.toJSONString());
    System.out.println();
  }

  @SuppressWarnings("unchecked")
  public void importarJSON(String nombreFichero) {
    try {
      JSONParser parser = new JSONParser();
      Reader reader = new FileReader(nombreFichero);
      Object jsonObj = parser.parse(reader);
      JSONObject jsonObject = (JSONObject) jsonObj;

      // Leemos los detalles del cliente
      Long id = (Long) jsonObject.get("Identificador");
      String nombre = (String) jsonObject.get("Nombre");
      String email = (String) jsonObject.get("Correo electrónico");
      Long edad = (Long) jsonObject.get("Edad");

      System.out.println("Identificador: " + id);
      System.out.println("Nombre: " + nombre);
      System.out.println("Correo electrónico: " + email);
      System.out.println("Edad: " + edad);

      // Leemos la dirección del cliente en un objeto Map. 
      // Al imprimir los elementos de un objeto Map no tiene por qué seguirse
      // el orden con que esos elementos se introdujeron.
      Map<Object, Object> dirección = (Map<Object, Object>) jsonObject.get(
        "Dirección"
      );
      dirección.forEach((clave, valor) -> System.out.println(clave + ": " + valor));

      // Leemos los métodos de pago
      JSONArray métodosPago = (JSONArray) jsonObject.get("Métodos de pago");
      métodosPago.forEach(System.out::println);

      // Leemos la lista de proyectos del cliente
      JSONArray proyectos = (JSONArray) jsonObject.get("Proyectos");
      proyectos.forEach(entry -> {
        JSONObject proyecto = (JSONObject) entry;
        System.out.println(proyecto.get("Título"));
        System.out.println(proyecto.get("Presupuesto"));
      });

      // Cerramos el lector
      reader.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
