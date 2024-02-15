import java.util.ArrayList;

public class ListaEstudiantesArray {
    public static void main(String[] args) {

        // Crear un ArrayList de nombres
        ArrayList<String> nombres = new ArrayList<>();

        // Agregar nombres a la lista
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Carlos");

        // Mostrar los nombres
        System.out.println("Lista de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
