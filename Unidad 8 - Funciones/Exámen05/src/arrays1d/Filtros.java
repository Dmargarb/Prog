package arrays1d;

/**
 *
 *
 * @author David Martín García
 */

/**
 * Devuelve un array con todos los
 * números que contienen una cifra que se pasa
 * como parámetro y que se encuentran en otro array.
 *
 * @param arrayIntroducido un array unidimencional
 * @param cifra un número entero
 * @return <code>resultado</code> el array creado
 *
 */

public class Filtros {

  public static int[] filtraConCifra(int[] arrayIntroducido, int cifra) {
    int contador = 0;

    for (int numero : arrayIntroducido) {
      int temp = numero;
      while (temp != 0) {
        if (temp % 10 == cifra) {
          contador++;
          break; // Romper el bucle si se encuentra la cifra en el número
        }
        temp /= 10;
      }
    }

    // Si no hay números que cumplan con la condición, devolver un array vacío
    if (contador == 0) {
      return new int[0];
    }

    // Crear un array para almacenar los números que cumplen con la condición
    int[] resultado = new int[contador];
    int index = 0;

    // Almacenar los números que cumplen con la condición en el nuevo array
    for (int numero : arrayIntroducido) {
      int temp = numero;
      while (temp != 0) {
        if (temp % 10 == cifra) {
          resultado[index++] = numero;
          break; // Romper el bucle si se encuentra la cifra en el número
        }
        temp /= 10;
      }
    }

    return resultado;
  }
}
