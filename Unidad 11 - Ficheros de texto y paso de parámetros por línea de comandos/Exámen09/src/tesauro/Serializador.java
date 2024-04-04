package tesauro;

import java.util.ArrayList;

public interface Serializador {
  /** Serializa los datos de una entrada del diccionario en un String de la siguiente forma:
   *  palabraInglés;significadoEspañol1;significadoEspañol2;significadoEspañol3;significadoEspañol4...
   *  Útil para salvar los datos del diccionario sobre un fichero.
   * @param palabraInglés palabra en inglés
   * @param significados lista con las acepciones en castellano de la palabra inglesa
   * @return cadena de caracteres conteniendo los datos de la entrada del diccionario
   */
  public String serializar(
    String palabraInglés,
    ArrayList<String> significados
  );

  /** Deserializa los datos de una entrada del diccionario convirtiéndola en un array de Strings.
   *  Los datos se reciben de la forma:
   *  palabraInglés;significadoEspañol1;significadoEspañol2;significadoEspañol3;significadoEspañol4...
   *  Útil para leer la información que previamente se guardó en un fichero en forma serializada.
   * @param líneaFichero datos en el fichero de una entrada del diccionario
   * @return array de Strings con la palabra en inglés en primera posición y seguida de sus signficados en español.
   */
  public String[] deserializar(String líneaFichero);
}
