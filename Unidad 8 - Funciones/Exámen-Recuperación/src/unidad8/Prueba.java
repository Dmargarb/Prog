package unidad8;

import unidad8.números.Cifras;
import unidad8.arrays1d.Filtros;
import unidad8.arrays2d.Elementos;

public class Prueba {
    public static void main(String[] args) {

        int numero = 23;
        System.out.print("¿Es primo el número " + numero + "? ");
        System.out.print(Cifras.esPrimo(numero));

        int[] numeros = { 1, 2, 3, 4, 5, 6, 13, 23, 99, 13, 0, 105 };

        System.out.println("\n\nArray completo: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        int[] numerosPrimos = Filtros.filtraPrimos(numeros);

        System.out.println("\n\nArray filtrado: ");
        for (int i = 0; i < numerosPrimos.length; i++) {
            System.out.print(numerosPrimos[i] + " ");
        }

        int posicion = 0;
        int[][] numeros2 = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        System.out.println("\n\n" + Elementos.nEsimo(numeros2, posicion));
    }
}