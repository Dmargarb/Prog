import java.util.Scanner;

/**
 * Tres o más
 *
 *
 * @author David Martín García
 */

public class TresOMas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rondas = 10; // Rondas
        int puntosJugador1 = 0; // Puntos del Jugador 1
        int puntosJugador2 = 0; // Puntos del Jugador 2

        for (int ronda = 1; ronda <= rondas; ronda++) { // Bucle de las 10 rondas del juego
            System.out.println("TRES O MÁS");

            int[] tiradaJugador1 = new int[5];  // Tirada del jugador 1
            for (int i = 0; i < tiradaJugador1.length; i++) {
                tiradaJugador1[i] = (int) (Math.random() * 6) + 1;
            }

            int[] tiradaJugador2 = new int[5]; // Tirada del jugador 2
            for (int i = 0; i < tiradaJugador2.length; i++) {
                tiradaJugador2[i] = (int) (Math.random() * 6) + 1;
            }

            int puntosJ1 = 0; // Puntos del jugador 1
            int[] contadorJ1 = new int[7];
            for (int valor : tiradaJugador1) {
                contadorJ1[valor]++;
            }

            for (int i = 1; i <= 6; i++) { // Sumando puntos del jugador 1
                if (contadorJ1[i] >= 3) {
                    if (contadorJ1[i] == 3) {
                        puntosJ1 += 3;
                    } else if (contadorJ1[i] == 4) {
                        puntosJ1 += 6;
                    } else if (contadorJ1[i] == 5) {
                        puntosJ1 += 12;
                    }
                }
            }

            System.out.print("Tirada " + ronda + " del jugador 1: "); // Imprime datos del jugador 1
            for (int i = 0; i < tiradaJugador1.length; i++) {
                System.out.print(tiradaJugador1[i]);
                if (i < tiradaJugador1.length - 1) {
                    System.out.print("-");
                }
            }
            System.out.println(" ; " + puntosJ1 + " puntos");

            int puntosJ2 = 0; // Puntos del jugador 2
            int[] contadorJ2 = new int[7]; 
            System.out.print("Tirada " + ronda + " del jugador 2: "); // Imprime datos del jugador 2
            for (int i = 0; i < tiradaJugador2.length; i++) {
                System.out.print(tiradaJugador2[i]);
                if (i < tiradaJugador2.length - 1) {
                    System.out.print("-");
                }
            }
            System.out.println(" ; 0 puntos ; Tirada extra");

            for (int i = 0; i < tiradaJugador2.length; i++) {
                tiradaJugador2[i] = (int) (Math.random() * 6) + 1;
            }

            for (int valor : tiradaJugador2) {
                contadorJ2[valor]++;
            }

            for (int i = 1; i <= 6; i++) { // Sumando puntos del jugador 2
                if (contadorJ2[i] >= 3) {
                    if (contadorJ2[i] == 3) {
                        puntosJ2 += 3;
                    } else if (contadorJ2[i] == 4) {
                        puntosJ2 += 6;
                    } else if (contadorJ2[i] == 5) {
                        puntosJ2 += 12;
                    }
                }
            }

            System.out.print("Tirada " + ronda + " del jugador 2: "); // Imprime datos del jugador 2
            for (int i = 0; i < tiradaJugador2.length; i++) {
                System.out.print(tiradaJugador2[i]);
                if (i < tiradaJugador2.length - 1) {
                    System.out.print("-");
                }
            }
            System.out.println(" ; " + puntosJ2 + " puntos");

            puntosJugador1 += puntosJ1;
            puntosJugador2 += puntosJ2;

            System.out.println("Fin de ronda " + ronda + " ; Jugador 1 - " + puntosJugador1 + " puntos ; Jugador 2 - " + puntosJugador2 + " puntos");
            System.out.println("Pulse INTRO para la siguiente ronda");
            scanner.nextLine(); // Fin de la ronda
        }

        System.out.println("Fin de la partida"); // Fin de la patida y resultado de los puntos
        if (puntosJugador1 > puntosJugador2) {
            System.out.println("¡Gana el jugador 1 con " + puntosJugador1 + " puntos!");
        } else if (puntosJugador2 > puntosJugador1) {
            System.out.println("¡Gana el jugador 2 con " + puntosJugador2 + " puntos!");
        } else {
            System.out.println("¡Es un empate! el jugador 1 tiene "+ puntosJugador1 + "puntos y el jugador 2 tiene "+ puntosJugador2 +"puntos.");
        }
        scanner.close();
    }
}
