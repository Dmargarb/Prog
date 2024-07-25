import java.util.Scanner;

public class Sprac {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("SPRAC");
        System.out.print("¿Cuánto dinero quiere apostar? ");
        int dinero = s.nextInt();

        int dado1 = (int) (Math.random() * 6 + 1); // dado 1
        int dado2 = (int) (Math.random() * 6 + 1); // dado 2
        int dado3 = (int) (Math.random() * 6 + 1); // dado 3
        int sumaDados = dado1 + dado2 + dado3; // Suma de los 3 dados

        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Dado 3: " + dado3);
        System.out.println("Suma: " + sumaDados);

        switch (sumaDados) {
            // Si sale 3, 6 o 9 pierde la partida.
            case 3:
            case 6:
            case 9:
                System.out.println("¡Lo siento, ha perdido los " + dinero + " €!");
                break;
            // Si sale 12, 15 o 18 gana la partida.
            case 12:
            case 15:
            case 18:
                dinero = dinero * 2;
                System.out.println("¡Enhorabuena! ¡Ha ganado " + dinero + " €!");
                break;
            // En los demás casos empieza la segunda fase.
            default:

                boolean completado = false;

                System.out.println("Tiene que seguir tirando, debe conseguir sumar " + sumaDados + " para ganar.");
                System.out.println("Si obtiene un 12, perderá la partida.");
                System.out.println("Pulse INTRO para tirar los dados.");
                System.console().readLine();

                do {

                    dado1 = (int) (Math.random() * 6 + 1); // dado 1
                    dado2 = (int) (Math.random() * 6 + 1); // dado 2
                    dado3 = (int) (Math.random() * 6 + 1); // dado 3
                    int sumaDados2 = dado1 + dado2 + dado3; // Suma de los 3 dados

                    System.out.println("Dado 1: " + dado1);
                    System.out.println("Dado 2: " + dado2);
                    System.out.println("Dado 3: " + dado3);
                    System.out.println("Suma: " + sumaDados2);

                    if (sumaDados2 == sumaDados) {
                        // Si la suma de los dados es igual al de la fase anterior, gana la partida.
                        dinero = dinero * 2;
                        System.out.println("¡Enhorabuena! ¡Ha ganado " + dinero + " €!");
                        completado = true;

                    } else if (sumaDados2 == 12) {
                        // Si la suma de los dados es igual a 12 pierde la partida.
                        System.out.println("¡Lo siento, ha perdido los " + dinero + " €!");
                        completado = true;

                    } else {
                        // En cualquier otro caso, se vuelven a tirar los dados.
                        System.out.println("Continúe jugando.");
                        System.out.println("Pulse INTRO para tirar los dados.");
                        System.console().readLine();

                    }

                } while (!completado);
        }
        s.close();
    }
}
