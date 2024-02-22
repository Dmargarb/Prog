import java.util.ArrayList;
import java.util.Collections;

public class OrdenarArrayList {
    public static void main(String[] args) throws Exception {

        int i = 0;
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        do {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros.add(Integer.parseInt(System.console().readLine()));
            i++;
        } while (i < 10);

        System.out.print("\nLos números introducidos son: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        Collections.sort(numeros);

        System.out.print("\n\nLos números ordenados son: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
