package unidad8.arrays2d;

public class Elementos {

    /**
     * Devuelve un número del array de una posición n
     *
     * @param array El array bidimensional del que se seleccionará el número.
     * @return numero el número de la posición que se quiere saber.
     * @return -1 si no existe la posición dentro del array.
     */
    public static int nEsimo(int[][] array, int posicion) {

        int contador = 0;
        for (int[] fila : array) {
            for (int numero : fila) {
                if (contador == posicion) {
                    return numero;
                }
                contador++;
            }
        }
        return -1;
    }
}
