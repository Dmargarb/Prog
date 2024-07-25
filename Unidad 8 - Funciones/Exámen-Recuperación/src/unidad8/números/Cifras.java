package unidad8.números;

public class Cifras {

    /**
     * Devuelve true o false si el número es Primo.
     * 
     * @param numero número a comprobar.
     * @return true si es Primo.
     * @return false en caso contrario.
     */
    public static boolean esPrimo(int numero) {

        if (numero < 2) {

            return false;

        } else {

            for (int i = numero / 2; i >= 2; i--) {
                if (numero % i == 0) {

                    return false;

                }
            }

        }

        return true;
    }
}
