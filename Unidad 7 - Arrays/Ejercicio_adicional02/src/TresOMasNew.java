import java.util.Scanner;

/**
 * Simula el juego "Tres o más" para dos jugadores con 5 dados de 6 caras.
 * El objetivo del juego es sacar tres dados iguales o más en una tirada.
 * 3 dados iguales puntúan con 3 puntos, 4 dados iguales con 6 puntos y 5 dados
 * iguales con 12 puntos.
 * Si salen dos dados iguales no se puntúa pero se gana el derecho de volver a
 * tirar.
 */
public class TresOMasNew {
    public static void main(String[] args) {
        int rondas = 10; // Número de rondas
        int dados = 5; // Número de dados
        int caras = 6; // Número de caras de cada dado
        int[] puntuaciones = new int[2]; // Puntuaciones de los jugadores

        Scanner scanner = new Scanner(System.in);

        System.out.println("TRES O MÁS");

        // Bucle principal del juego para cada ronda
        for (int ronda = 1; ronda <= rondas; ronda++) {
            // Bucle para cada jugador
            for (int jugador = 0; jugador < 2; jugador++) {
                boolean tiradaExtra;

                do {
                    int[] tiradaDados = new int[dados];
                    for (int i = 0; i < dados; i++) {
                        // Generar un número aleatorio entre 1 y 6 para cada dado
                        tiradaDados[i] = (int) (Math.random() * caras) + 1;
                    }

                    // Mostrar la tirada del jugador
                    System.out.print("Tirada " + ronda + " del jugador " + (jugador + 1) + ": ");
                    for (int i = 0; i < dados; i++) {
                        System.out.print(tiradaDados[i]);
                        if (i < dados - 1) {
                            System.out.print("-");
                        }
                    }

                    // Calcular los puntos de la tirada
                    int puntos = calcularPuntos(tiradaDados);
                    System.out.print(" ; " + puntos + " puntos");
                    puntuaciones[jugador] += puntos;

                    // Verificar si hay tirada extra
                    if (existenPares(tiradaDados)) {
                        tiradaExtra = true;
                        System.out.println(" ; Tirada extra");
                    } else {
                        tiradaExtra = false;
                        System.out.println();
                    }

                } while (tiradaExtra);
            }

            // Mostrar el resultado de la ronda
            System.out.println("Fin de ronda " + ronda + " ; Jugador 1 - " + puntuaciones[0] + " puntos ; Jugador 2 - "
                    + puntuaciones[1] + " puntos");
            System.out.println("Pulse INTRO para la siguiente ronda");
            scanner.nextLine();
        }

        // Mostrar el resultado final del juego
        System.out.println("Fin de la partida");
        if (puntuaciones[0] > puntuaciones[1]) {
            System.out.println("¡Gana el jugador 1 con " + puntuaciones[0] + " puntos!");
        } else if (puntuaciones[1] > puntuaciones[0]) {
            System.out.println("¡Gana el jugador 2 con " + puntuaciones[1] + " puntos!");
        } else {
            System.out.println("¡Es un empate con " + puntuaciones[0] + " puntos!");
        }

        scanner.close();
    }

    /**
     * Calcula los puntos obtenidos en una tirada de dados.
     *
     * @param dados Array de enteros que representa los valores de los dados en la
     *              tirada.
     * @return Puntos obtenidos en la tirada.
     */
    public static int calcularPuntos(int[] dados) {
        int[] conteo = new int[6]; // Conteo de ocurrencias de cada valor de dado
        for (int dado : dados) {
            conteo[dado - 1]++;
        }

        // Determinar los puntos según las reglas del juego
        for (int i = 0; i < conteo.length; i++) {
            if (conteo[i] >= 5)
                return 12;
            if (conteo[i] == 4)
                return 6;
            if (conteo[i] == 3)
                return 3;
        }

        return 0;
    }

    /**
     * Verifica si existen pares de dados en una tirada.
     *
     * @param dados Array de enteros que representa los valores de los dados en la
     *              tirada.
     * @return true si existen pares, false en caso contrario.
     */
    public static boolean existenPares(int[] dados) {
        int[] conteo = new int[6]; // Conteo de ocurrencias de cada valor de dado
        for (int dado : dados) {
            conteo[dado - 1]++;
        }

        // Verificar si hay al menos un par de dados (dos o más dados iguales)
        for (int i = 0; i < conteo.length; i++) {
            if (conteo[i] == 2) {
                return true;
            }
        }

        return false;
    }
}
