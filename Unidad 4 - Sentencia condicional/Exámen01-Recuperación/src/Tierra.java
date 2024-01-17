import java.util.Scanner;

/**
 * Vueltas de la tierra
 *
 *
 * @author David Martín García
 */

public class Tierra {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("VUELTAS DE LA TIERRA"); 
        System.out.println("====================");
        System.out.print("Introduzca un número de años: ");
        long años = s.nextLong(); // variable con el número de años

        long vueltas = años * 365; // variable con el número de vueltas

        System.out.println("La tierra habrá dado un total de "+vueltas+" vueltas en "+años+" años.");
        s.close();
    }
}
