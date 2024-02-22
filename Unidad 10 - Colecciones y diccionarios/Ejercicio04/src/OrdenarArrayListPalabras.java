import java.util.ArrayList;
import java.util.Collections;

public class OrdenarArrayListPalabras {
    public static void main(String[] args) throws Exception {

        int i = 0;
        ArrayList<String> palabras = new ArrayList<String>();

        do {
            System.out.print("Introduce la palabra "+(i+1)+": ");
            palabras.add(System.console().readLine());
            i++;
          } while (i < 10);

          System.out.print("\nLas palabras introducidas son: ");
          for (String palabra : palabras) {
            System.out.print(palabra+" ");
        }

          Collections.sort(palabras);

          System.out.print("\n\nLas palabras ordenadas son: ");
          for (String palabra : palabras) {
            System.out.print(palabra+" ");
        }
    }
}
