package unidad8.arrays2d;

/**
 * Clase Elementos que ofrece funciones para arrays bidimensionales.
 */
public class Elementoss {
    /**
     * Devuelve un número aleatorio de un array bidimensional.
     *
     * @param array El array bidimensional del que se seleccionará el número.
     * @return Un número entero seleccionado aleatoriamente del array.
     */
    public static int aleatorioDeArray2D(int[][] array) {
        int filas = array.length;
        int columnas = array[0].length;

        int filaAleatoria = (int) (Math.random() * filas);
        int columnaAleatoria = (int) (Math.random() * columnas);

        return array[filaAleatoria][columnaAleatoria];
    }
}
