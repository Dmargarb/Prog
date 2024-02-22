import java.util.ArrayList;

public class ArrayListNombres {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<String>();

        nombres.add("José Manuel");
        nombres.add("Salvador");
        nombres.add("Rubén");
        nombres.add("Irene");
        nombres.add("Noemí");
        nombres.add("Begoña");

        System.out.println("Contenido de la lista: \n");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
