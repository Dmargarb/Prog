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
* @return <code>digitos</code> el array creado
*
*/

public class Filtros {

  public static int[] filtraConCifra(int[] arrayIntroducido, int cifra) {
    int[] digitos = new int[arrayIntroducido.length];

    for (int i = 0; i < arrayIntroducido.length; i++) {
      int longitud = 0;
      long numero = arrayIntroducido[i];
      long numero2 = arrayIntroducido[i];

      while (numero != 0) {
        numero = numero / 10;
        longitud++;
      }

      int x = 0;
      for (int j = longitud - 1; j >= 0; j--) {
        long digito = numero2 / (int) Math.pow(10, i);

        if (digito == cifra) {
            digitos[x] = (int) digito;
            x++;
          }
        numero2 = numero2 % (int) Math.pow(10, i);
      }
    }
    return digitos;
  }
}
