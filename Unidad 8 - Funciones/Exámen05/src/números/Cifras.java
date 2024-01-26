package números;

/**
*
*
* @author David Martín García
*/

/**
* Devuelve verdadero si el número que
* se pasa como argumento contiene una cifra que también
* se pasa como argumento.
*
* @param numeroIntroducido un número entero
* @param cifra un número entero
* @return <code>true</code> si la cifra está dentro del número
* @return <code>false</code> si no lo está
*/

public class Cifras {

  public static boolean contieneCifra(long numeroIntroducido, int cifra) {
    int longitud = 0;
    long numero = numeroIntroducido;

    while (numero != 0) {
      numero = numero / 10;
      longitud++;
    }

    for (int i = longitud - 1; i >= 0; i--) {
      long digito = numeroIntroducido / (int) Math.pow(10, i);

      if (digito == cifra) {
        return true;
      }
      numeroIntroducido = numeroIntroducido % (int) Math.pow(10, i);
    }
    return false;
  }
}
