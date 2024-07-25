package unidad8.arrays1d;

import unidad8.números.Cifras;

public class Filtros {

    /**
     * Devuelve un array con los números primos que hay en otro array.
     * 
     * @param numeros array de números
     * @return arrayFinal array con los números primos de numeros
     */
    public static int[] filtraPrimos(int numeros[]) {

        int[] numerosPrimos = new int[numeros.length];
        int contador = 0;

        for (int numero : numeros) {
            if (Cifras.esPrimo(numero)) {
                numerosPrimos[contador] = numero;
                contador++;
            }
        }

        int[] arrayFinal = new int[contador];

        for (int i = 0; i < contador; i++) {
            arrayFinal[i] = numerosPrimos[i];
        }

        return arrayFinal;
    }
}
