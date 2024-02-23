import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * Definición de la clase Diccionario
 * 
 * @author David Martín García
 */

public class Diccionario {

    // HashMap que almacena las palabras en inglés y sus significados
    private HashMap<String, ArrayList<String>> diccionarioInglesEspanol;

    // Constructor que inicializa el HashMap
    public Diccionario() {
        this.diccionarioInglesEspanol = new HashMap<String, ArrayList<String>>();
    }

    /**
     * Método para añadir palabras en inglés y sus significados
     *
     * @param ingles  palabra en inglés
     * @param espanol palabra en español
     */
    public void addPalabraInglesEspanol(String ingles, String espanol) {

        // Obtener la lista de significados asociados a una palabra en inglés concreta
        ArrayList<String> listaPalabrasEspanol = diccionarioInglesEspanol.get(ingles.toLowerCase());

        // Si la lista es nula, significa que la palabra no tiene un significado
        // asociado, por lo que se crea una nueva lista y se añade al HashMap
        if (listaPalabrasEspanol == null) {
            listaPalabrasEspanol = new ArrayList<String>();
            diccionarioInglesEspanol.put(ingles.toLowerCase(), listaPalabrasEspanol);
        }

        // Añadir el significado en español a la lista
        listaPalabrasEspanol.add(espanol);
    }

    /**
     * Método para obtener los significados asociadas a una palabra en inglés
     *
     * @param ingles palabra en inglés
     * @return <code>new ArrayList<>()</code> si no contiene ninguna palabra la
     *         lista
     * @return <code>listaPalabrasEspanol</code> la lista de palabras en español
     */
    public ArrayList<String> obtenerPalabrasEspanol(String ingles) {

        // Obtener la lista de significados asociados a una palabra en inglés concreta
        ArrayList<String> listaPalabrasEspanol = diccionarioInglesEspanol.get(ingles.toLowerCase());

        // Si la lista es nula, significa que la palabra no tiene un significado
        // asociado, por lo que se devuelve una lista vacía
        if (listaPalabrasEspanol == null) {

            System.out.println("La palabra '" + ingles + "' no contiene ningún significado en el diccionario.");
            return new ArrayList<>();

        } else {
            // En caso contrario, se devuelve la lista de significados
            return listaPalabrasEspanol;
        }
    }

    /**
     * Método para eliminar una palabra en inglés y todos sus significados asociados
     *
     * @param ingles palabra en inglés
     */
    public void removeIngles(String ingles) {

        // Se verifica si la palabra existe en el diccionario
        if (diccionarioInglesEspanol.containsKey(ingles.toLowerCase())) {

            // Si la palabra existe, se elimina del diccionario
            diccionarioInglesEspanol.remove(ingles.toLowerCase());

        } else {
            // Si la palabra no existe, se muestra un mensaje de error
            System.out.println("La palabra '" + ingles + "' no existe en el diccionario.");
        }
    }

    /**
     * Método para eliminar un significado específico de una palabra en inglés
     *
     * @param ingles  palabra en inglés
     * @param espanol palabra en español
     */
    public void removeSignificado(String ingles, String espanol) {

        // Obtener la lista de significados asociados a una palabra en inglés concreta
        ArrayList<String> listaPalabrasEspanol = diccionarioInglesEspanol.get(ingles.toLowerCase());

        // Si la lista es nula, significa que la palabra no tiene un significado
        // asociado
        if (listaPalabrasEspanol != null) {

            // Si la lista contiene la palabra en español, la borra
            if (listaPalabrasEspanol.contains(espanol.toLowerCase())) {

                // Se elimina el significado concreto de la lista
                listaPalabrasEspanol.remove(espanol.toLowerCase());

            } else {
                // Si la palabra en español no existe, se muestra un mensaje de error
                System.out.println(
                        "La palabra '" + espanol + "' no existe en la lista de significados de '" + ingles + "'.");
            }

        } else {
            // Si la palabra en inglés no existe, se muestra un mensaje de error
            System.out.println("La palabra '" + ingles + "' no existe en el diccionario.");
        }
    }
}