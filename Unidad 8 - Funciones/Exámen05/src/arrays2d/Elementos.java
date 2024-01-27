package arrays2d;

/**
 *
 *
 * @author David Martín García
 */

/**
 * Devuelve un número entero
 * escogido al azar entre todos los disponibles.
 *
 *
 * @param array2D un array bidimensional
 * @return <code>numero</code> el número aleatorio
 * @return <code>-1</code> si el array está vacío
 */

public class Elementos {

  public static int aleatorioDeArray2D(int[][] array2D) {
    int total = 0;
    for (int[] fila : array2D) {
      total += fila.length;
    }

    int indiceAleatorio = (int) (Math.random() * total); //Número aleatorio

    int contador = 0;
    for (int[] fila : array2D) {
      for (int numero : fila) {
        if (contador == indiceAleatorio) {
          return numero; //Se devuelve el número aleatorio
        }
        contador++;
      }
    }
    return -1;
  }
}
