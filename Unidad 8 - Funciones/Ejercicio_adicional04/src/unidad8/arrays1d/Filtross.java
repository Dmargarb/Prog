package unidad8.arrays1d;

import java.util.ArrayList;

/**
 * Clase Filtros que ofrece funciones de filtrado para arrays unidimensionales.
 */
public class Filtross {
    /**
     * Filtra los números de un array que contienen una cifra específica.
     *
     * @param array El array de números a filtrar.
     * @param cifra La cifra que deben contener los números filtrados.
     * @return Un array con los números que contienen la cifra buscada.
     */
    public static int[] filtraConCifra(int[] array, int cifra) {
        ArrayList<Integer> resultado = new ArrayList<>();
        for (int numero : array) {
            if (unidad8.numeros.Cifrass.contieneCifra(numero, cifra)) {
                resultado.add(numero);
            }
        }
        int[] arrayResultado = new int[resultado.size()];
        for (int i = 0; i < resultado.size(); i++) {
            arrayResultado[i] = resultado.get(i);
        }
        return arrayResultado;
    }
}
