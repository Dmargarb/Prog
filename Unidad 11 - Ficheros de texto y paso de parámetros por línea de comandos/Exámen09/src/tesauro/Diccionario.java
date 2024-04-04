package tesauro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Diccionario implements Serializador {

  private HashMap<String, ArrayList<String>> glosario;

  public Diccionario() {
    glosario = new HashMap<String, ArrayList<String>>();
  }

  /**
   * @param palabraInglés      Se pide la palabra en ingles
   * @param significadoEspañol Se pide un significado de la palabra en inglés
   *                           anterior
   */
  public void añadirEntrada(String palabraInglés, String significadoEspañol) {
    if (glosario.containsKey(palabraInglés)) {
      if (!glosario.get(palabraInglés).contains(significadoEspañol))
        glosario
            .get(palabraInglés)
            .add(significadoEspañol);
    } else {
      ArrayList<String> significado = new ArrayList<String>();
      significado.add(significadoEspañol);
      glosario.put(palabraInglés, significado);
    }
  }

  /**
   * @param palabraInglés Se pide la palabra en inglés para borrarla completamente
   *                      del diccionario.
   */
  public void eliminarEntrada(String palabraInglés) {
    glosario.remove(palabraInglés);
  }

  /**
   * @param palabraInglés      Se pide la palabra en inglés
   * @param significadoEspañol Se pide el significado que quiere borrarse de la
   *                           palabra en inglés
   */
  public void eliminarSignificado(
      String palabraInglés,
      String significadoEspañol) {
    if (glosario.containsKey(palabraInglés)) {
      glosario.get(palabraInglés).remove(significadoEspañol);
    }
  }

  /**
   * @param palabraInglés Se pide la palabra en inglés para saber sus
   *                      significados.
   * @return Devuelve los significados de la palabra enviada.
   */
  public ArrayList<String> consultar(String palabraInglés) {
    if (glosario.containsKey(palabraInglés)) {
      return glosario.get(palabraInglés);
    } else {
      return new ArrayList<String>();
    }
  }

  /**
   * Añade datos desde un fichero
   * 
   * @param nombreFichero
   */
  public void importar(String nombreFichero) {
    
    try {

      // Se intenta leer el fichero
      BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
      String linea;

      // Sigue leyendo hasta que no queden líneas por leer
      while ((linea = br.readLine()) != null) {

        // Se añade al array los datos desserializados
        String[] datosEntrada = deserializar(linea);

        // Se guarda la palabra en inglés
        String palabraInglés = datosEntrada[0];

        // Bucle que añadirá todas las entradas
        for (int i = 1; i < datosEntrada.length; i++) {
          añadirEntrada(palabraInglés, datosEntrada[i]);
        }
      }

      br.close();

    } catch (FileNotFoundException e) {
      System.out.println("No se encuentra el archivo " + nombreFichero);
    } catch (IOException e) {
      System.out.println("No se puede leer el archivo " + nombreFichero);
    }

  }

  /**
   * Exporta los datos actuales del diccionario a un fichero
   * 
   * @param nombreFichero
   */
  public void exportar(String nombreFichero) {

    try {

      // Se intenta escribir en el fichero
      BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero));

      // Bucle con la lista de entradas del diccionario
      for (String palabra : glosario.keySet()) {

        // Lista con los significados de la palabra
        ArrayList<String> significados = glosario.get(palabra);

        // Se serializa la entrada
        String entradaSerializada = serializar(palabra, significados);

        // Se escribe en el fichero
        bw.write(entradaSerializada);
        bw.newLine();
      }

      bw.close();

    } catch (FileNotFoundException e) {
      System.out.println("No se encuentra el archivo " + nombreFichero);
    } catch (IOException e) {
      System.out.println("No se puede leer el archivo " + nombreFichero);
    }

  }

  /**
   * @return Número de entradas del diccionario
   */
  public int númeroEntradas() {
    int numeroEntradas = glosario.size();
    return numeroEntradas;
  }

  /**
   * @param palabraInglés palabra en inglés
   * @param significados  lista con las acepciones en castellano de la palabra
   *                      inglesa
   * @return cadena de caracteres conteniendo los datos de la entrada del
   *         diccionario
   */
  @Override
  public String serializar(
      String palabraInglés,
      ArrayList<String> significados) {

    // Se pone primero la palabra en inglés
    String datosSerializados = palabraInglés;

    // Bucle con la lista de significados
    for (String significado : significados) {
      // Se agrega cada significado separado por ';
      datosSerializados += ";" + significado;
    }

    // Se devuelve el array
    return datosSerializados;
  }

  /**
   * @param líneaFichero datos en el fichero de una entrada del diccionario
   * @return array de Strings con la palabra en inglés en primera posición seguida
   *         de los signficados en español.
   */
  @Override
  public String[] deserializar(String líneaFichero) {
    String[] datosDeserializados = líneaFichero.split(";");
    // Se utiliza split para almacenar en el array las palabras entre ; y se
    // devuelve el array
    return datosDeserializados;
  }
}