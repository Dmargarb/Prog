import java.util.ArrayList;

/**
 *
 * Definición de la clase Repaso
 * 
 * @author David Martín García
 */
public class Repaso {

    public static void main(String[] args) throws Exception {
        int min = 10;
        int max = 10000;
        int numeroAleatorio = generarNumeroAleatorio(min, max); // Genera un número aleatorio.
        mostrarNumeros(numeroAleatorio); // Muestra el número aleatorio.
    }

    /**
     * Genera un número aleatorio entre min y max (inclusive).
     *
     * @param min el valor mínimo del número aleatorio
     * @param max el valor máximo del número aleatorio
     * @return el número aleatorio generado
     */
    public static int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1) + min);
    }

    /**
     * Calcula la longitud de un número.
     *
     * @param numero el número del que se desea calcular la longitud
     * @return la longitud del número
     */
    public static int longitud(int numero) {
        int longitud = 0;
        while (numero != 0) {
            numero = numero / 10;
            longitud++;
        }
        return longitud;
    }

    /**
     * Divide un número en sus dígitos y los devuelve en el mismo orden.
     *
     * @param numero el número a dividir
     * @return una lista de enteros con los dígitos del número
     */
    public static ArrayList<Integer> dividirDigitos(int numero) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<Integer> numerosEnOrden = new ArrayList<Integer>();
        int longitud = longitud(numero);

        // Agrega cada dígito del número a la lista de números
        for (int i = 0; i < longitud; i++) {
            numeros.add(numero % 10);
            numero = numero / 10;
        }

        // Ordena los dígitos en la lista en el orden inicial
        for (int i = 0; i < longitud; i++) {
            numerosEnOrden.add(numeros.get(longitud - i - 1));
        }

        return numerosEnOrden;
    }

    /**
     * Encuentra el dígito máximo en una lista de números.
     *
     * @param numeros la lista de números
     * @return el dígito máximo en la lista de números
     */
    public static int digitoMaximo(ArrayList<Integer> numeros) {
        int max = 0;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > max) {
                max = numeros.get(i);
            }
        }
        return max;
    }

    /**
     * Muestra un número aleatorio y su representación en una tabla de celdas.
     *
     * @param numero el número aleatorio a mostrar
     */
    public static void mostrarNumeros(int numero) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros = dividirDigitos(numero); // Divide el número en dígitos.
        int digitoMax = digitoMaximo(numeros); // Encuentra el dígito mayor.

        System.out.println("El número aleatorio es: " + numero);
        System.out.println("El dígito mayor es: " + digitoMax + "\n");

        // Dibuja la tabla de celdas
        for (int i = 0; i < numeros.size(); i++) {

            // Dibujar la línea superior de la celda
            for (int j = 0; j <= digitoMax; j++) {
                System.out.print(" ---");
            }
            System.out.println();

            // Dibujar las celdas y las líneas verticales
            for (int j = 0; j <= digitoMax; j++) {
                if (j == 0) {
                    // Mostrar el número en la primera celda
                    System.out.printf("| %d ", numeros.get(i));
                } else if (j <= numeros.get(i)) {
                    // Rellenar las celdas siguientes con asteriscos
                    System.out.print("| * ");
                } else {
                    // Rellenar el resto de las celdas con espacios
                    System.out.print("|   ");
                }
            }
            // Añadir la línea vertical final
            System.out.println("|");
        }

        // Dibujar la línea inferior de la celda
        for (int j = 0; j <= digitoMax; j++) {
            System.out.print(" ---");
        }
        System.out.println();
    }

}
