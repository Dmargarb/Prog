package unidad8.numeros;

/**
 * Clase Cifras que ofrece funciones relacionadas con cifras en números.
 */
public class Cifrass {
    /**
     * Comprueba si un número contiene una cifra específica.
     *
     * @param numero El número en el que buscar.
     * @param cifra  La cifra que se busca.
     * @return true si el número contiene la cifra, false en caso contrario.
     */
    public static boolean contieneCifra(int numero, int cifra) {
        while (numero > 0) {
            int digito = numero % 10;
            if (digito == cifra) {
                return true;
            }
            numero /= 10;
        }
        return false;
    }
}
