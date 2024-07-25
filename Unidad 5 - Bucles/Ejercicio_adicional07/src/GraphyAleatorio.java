/**
 * La clase GraphyAleatorio genera un número aleatorio de 10 dígitos,
 * lo representa de manera simple o colorida en la consola.
 */
public class GraphyAleatorio {

    /**
     * Método principal que inicia el programa.
     * 
     * @param args Argumentos de línea de comandos (no se utilizan).
     * @throws Exception Si ocurre un error durante la ejecución.
     */
    public static void main(String[] args) throws Exception {
        int min = 0;
        int max = 9;
        long numeroFinal = generarNumeroFinal(min, max); // Genera un número aleatorio de 10 dígitos.
        boolean correcto = false;

        do {
            System.out.print("\nSelecciona Simple o en Color (S/C):");
            String eleccion = System.console().readLine().toLowerCase();

            switch (eleccion) {
                case "s":
                    simple(numeroFinal); // Muestra el número en formato simple.
                    correcto = true;
                    break;
                case "c":
                    System.out.println("En construcción..."); // Indica que la opción de color está en construcción.
                    correcto = true;
                    break;
                default:
                    System.out.println("\nElige S o C"); // Pide una entrada válida.
            }
        } while (!correcto);
    }

    /**
     * Genera un número aleatorio entre min y max.
     * 
     * @param min Valor mínimo.
     * @param max Valor máximo.
     * @return Un número aleatorio entre min y max.
     */
    public static int generarNumerosAleatorios(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1) + min);
    }

    /**
     * Genera un número aleatorio de 10 dígitos concatenados.
     * 
     * @param min Valor mínimo para cada dígito.
     * @param max Valor máximo para cada dígito.
     * @return Un número largo compuesto de 10 dígitos aleatorios.
     */
    public static long generarNumeroFinal(int min, int max) {
        String numeroCombinado = "";

        for (int i = 0; i < 10; i++) {
            numeroCombinado += generarNumerosAleatorios(min, max); // Concatena 10 dígitos aleatorios.
        }

        return Long.parseLong(numeroCombinado); // Convierte la cadena en un número largo.
    }

    /**
     * Divide un número largo en sus dígitos individuales.
     * 
     * @param numeroIntroducido El número largo a dividir.
     * @return Un array de enteros que contiene los dígitos del número.
     */
    public static int[] dividirDigitoFuncion(long numeroIntroducido) {
        int longitud = longitudFuncion(numeroIntroducido); // Obtiene la longitud del número.
        int[] digitos = new int[longitud];
        int j = 0;

        while (numeroIntroducido > 0) {
            digitos[j] = (int) (numeroIntroducido % 10); // Extrae el último dígito.
            j++;
            numeroIntroducido /= 10; // Elimina el último dígito.
        }

        // Invertir el array antes de devolverlo
        int[] resultado = new int[digitos.length];
        for (int i = 0; i < digitos.length; i++) {
            resultado[i] = digitos[digitos.length - i - 1];
        }
        return resultado;
    }

    /**
     * Calcula la longitud de un número.
     * 
     * @param numero El número cuyo longitud se desea calcular.
     * @return La longitud del número.
     */
    public static int longitudFuncion(long numero) {
        int longitud = 0;

        while (numero != 0) {
            numero = numero / 10; // Divide el número por 10.
            longitud++;
        }
        return longitud;
    }

    /**
     * Encuentra el dígito mayor en un array de dígitos.
     * 
     * @param digitos El array de dígitos.
     * @return El dígito mayor en el array.
     */
    public static int numeroMayor(int[] digitos) {
        int numeroMax = 0;

        for (int digito : digitos) {
            if (numeroMax < digito) {
                numeroMax = digito; // Actualiza el dígito mayor.
            }
        }
        return numeroMax;
    }

    /**
     * Muestra el número en formato simple en la consola.
     * 
     * @param numeroFinal El número a mostrar.
     */
    public static void simple(long numeroFinal) {
        int[] digitos = dividirDigitoFuncion(numeroFinal); // Divide el número en dígitos.
        int digitoMax = numeroMayor(digitos); // Encuentra el dígito mayor.

        for (int digito : digitos) {
            // Dibujar la línea superior
            for (int j = 0; j <= digitoMax; j++) {
                System.out.print(" ---");
            }
            System.out.println();

            // Dibujar las celdas y las líneas verticales
            for (int j = 0; j <= digitoMax; j++) {
                if (j == 0) {
                    // Mostrar el número en la primera celda
                    System.out.printf("| %d ", digito);
                } else if (j <= digito) {
                    // Rellenar las celdas a la derecha de la primera con asteriscos
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
