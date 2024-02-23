import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class CodigoPostalHashMap {

    // HashMap que almacena las ciudades y los códigos postales
    private HashMap<String, ArrayList<Integer>> codigoPostalCiudad;

    // Constructor que inicializa el HashMap
    public CodigoPostalHashMap() {
        this.codigoPostalCiudad = new HashMap<String, ArrayList<Integer>>();
    }

    // Método para añadir un código postal a una ciudad
    public void addCodigoPostalCiudad(String ciudad, Integer codigoPostal) {

        // Obtener la lista de códigos postales asociados a la ciudad
        ArrayList<Integer> listaCodigoPostal = codigoPostalCiudad.get(ciudad.toLowerCase());

        // Si la lista es nula, significa que la ciudad no tiene códigos postales asociados,
        // por lo que se crea una nueva lista y se añade al HashMap
        if (listaCodigoPostal == null) {
            listaCodigoPostal = new ArrayList<Integer>();
            codigoPostalCiudad.put(ciudad.toLowerCase(), listaCodigoPostal);
        }

        // Añadir el código postal a la lista
        listaCodigoPostal.add(codigoPostal);
    }

    // Método para eliminar una ciudad y todos sus códigos postales asociados
    public void removeCiudad(String ciudad) {

        // Verificar si la ciudad existe en el mapa
        if (codigoPostalCiudad.containsKey(ciudad.toLowerCase())) {

            // Si la ciudad existe, eliminarla del mapa
            codigoPostalCiudad.remove(ciudad.toLowerCase());

        } else {
            // Si la ciudad no existe, imprimir un mensaje de advertencia
            System.out.println("La ciudad '" + ciudad + "' no existe en el HashMap de códigos postales.");
        }
    }
    

    // Método para eliminar un código postal específico de una ciudad
    public void removeCodigoPostal(String ciudad, Integer codigoPostal) {

        // Obtener la lista de códigos postales asociados a la ciudad
        ArrayList<Integer> listaCodigoPostal = codigoPostalCiudad.get(ciudad.toLowerCase());

        // Si la lista no es nula, significa que la ciudad tiene códigos postales asociados
        if (listaCodigoPostal != null) {

            // Eliminar el código postal de la lista
            listaCodigoPostal.remove(codigoPostal);

            // Si la lista queda vacía después de eliminar el código postal, se elimina la ciudad del HashMap
            if (listaCodigoPostal.isEmpty()) {
                codigoPostalCiudad.remove(ciudad.toLowerCase());
            }

        } else {
            // Si la ciudad no existe, imprimir un mensaje de advertencia
            System.out.println("La ciudad '" + ciudad + "' no existe en el HashMap de códigos postales.");
        }
    }

    // Método para consultar todas las ciudades del HashMap
    public ArrayList<String> consultarCiudades() {

        // Devolver una lista con todas las claves del mapa, que representan las ciudades
        return new ArrayList<String>(codigoPostalCiudad.keySet());
    }

    // Método para obtener todos los códigos postales asociados a una ciudad
    public ArrayList<Integer> obtenerCodigosPostales(String ciudad) {

        // Obtener la lista de códigos postales asociados a la ciudad
        ArrayList<Integer> codigosPostales = codigoPostalCiudad.get(ciudad.toLowerCase());

        // Si la lista es nula, significa que la ciudad no tiene códigos postales asociados,
        // por lo que se devuelve una lista vacía
        if (codigosPostales == null) {

            System.out.println("La ciudad '" + ciudad + "' no contiene códigos postales en el HashMap.");
            return new ArrayList<>();

        } else {
            // En caso contrario, se devuelve la lista de códigos postales
            return codigosPostales;
        }
    }

    // Método para ordenar los códigos postales asociados a una ciudad
    public void ordenarCodigosPostales(String ciudad) {

        // Obtener la lista de códigos postales asociados a la ciudad
        ArrayList<Integer> listaCodigoPostal = codigoPostalCiudad.get(ciudad.toLowerCase());

        // Si la lista no es nula, significa que la ciudad tiene códigos postales asociados
        if (listaCodigoPostal != null) {

            // Ordenar la lista de códigos postales
            Collections.sort(listaCodigoPostal);

        } else {
            // Si la ciudad no existe, imprimir un mensaje de advertencia
            System.out.println("La ciudad '" + ciudad + "' no existe en el HashMap de códigos postales.");
        }
    }

    // Método para mostrar todas las ciudades con sus códigos postales asociados
    public void mostrarCiudadesConCodigosPostales() {

        // Iterar sobre todas las ciudades presentes en el HashMap
        for (String ciudad : codigoPostalCiudad.keySet()) {

            // Imprimir el nombre de la ciudad
            System.out.println("\nCiudad: " + ciudad);

            // Imprimir los códigos postales asociados a la ciudad
            System.out.println("Códigos Postales: " + codigoPostalCiudad.get(ciudad));
        }
    }
}
