import java.util.ArrayList;

/**
 * Uso de un ArrayList de objetos
 *
 *
 */

public class UsoArrayListObjetos {
    public static void main(String[] args) throws Exception {

        ArrayList<Gatitos> g = new ArrayList<Gatitos>();

        g.add(new Gatitos("Garfield", "naranja", "mestizo"));
        g.add(new Gatitos("Pepe", "gris", "angora"));
        g.add(new Gatitos("Mauri", "blanco", "manx"));
        g.add(new Gatitos("Ulises", "marrón", "persa"));

        System.out.println("\nDatos de los gatos:\n");

        for (Gatitos gatoAux : g) {
            System.out.println(gatoAux + "\n");
        }
    }
}