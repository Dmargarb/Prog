import java.util.ArrayList;
import java.util.Collections;

/**
 * Ordenación de un ArrayList de objetos
 *
 *
 */

public class UsoArrayListOrdenarObjetos {
    public static void main(String[] args) {

        ArrayList<Gatitos> g = new ArrayList<Gatitos>();

        g.add(new Gatitos("Garfield", "naranja", "mestizo"));
        g.add(new Gatitos("Pepe", "gris", "angora"));
        g.add(new Gatitos("Mauri", "blanco", "manx"));
        g.add(new Gatitos("Ulises", "marrón", "persa"));
        g.add(new Gatitos("Adán", "negro", "angora"));

        Collections.sort(g);

        System.out.println("\nDatos de los gatos ordenados por nombre:");

        for (Gatitos gatoAux : g) {
            System.out.println(gatoAux + "\n");
        }
    }
}