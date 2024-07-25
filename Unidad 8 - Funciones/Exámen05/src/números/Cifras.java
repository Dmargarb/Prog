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
    // Verificar cada dígito del número
    while (numeroIntroducido != 0) {
      int digito = (int) numeroIntroducido % 10; // Obtener el último dígito
      if (digito == cifra) {
        return true; // Se encontró la cifra en el número
      }
      numeroIntroducido /= 10; // Eliminar el último dígito
    }

    // La cifra no se encontró en el número
    return false;
  }
}
