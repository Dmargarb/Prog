import java.util.HashMap;

public class SaberTodasLasClaves {
    public static void main(String[] args) {

        // Crear un HashMap
        HashMap<Integer, String> miDiccionario = new HashMap<Integer, String>();

        // Agregar elementos al HashMap
        miDiccionario.put(1, "valor1");
        miDiccionario.put(2, "valor2");
        miDiccionario.put(3, "valor3");
        miDiccionario.put(4, "valor4");
        miDiccionario.put(5, "valor5");

        System.out.println("Número total de claves en el HashMap: " + miDiccionario.size() + ".");

        int totalClaves = miDiccionario.size();
        int contador = 0;

        // Mostrar todas las claves
        System.out.print("\nClaves en el HashMap: ");
        for (Integer clave : miDiccionario.keySet()) {

            contador++;

            if (contador == totalClaves) {
                System.out.print(clave + ".");

            } else if (contador == totalClaves - 1) {
                System.out.print(clave + " y ");

            } else {
                System.out.print(clave + ", ");
            }
        }

        // Pedir al usuario que elija una clave
        System.out.print("\n\nElija una clave para mostrar su valor: ");
        int claveElegida = Integer.parseInt(System.console().readLine());

        // Obtener y mostrar el valor asociado a la clave elegida
        String valor = miDiccionario.get(claveElegida);

        if (valor != null) {
            System.out.println("\nEl valor asociado a la clave " + claveElegida + " es: " + valor + ".");
        } else {
            System.out.println("\nLa clave ingresada no existe en el HashMap.");
        }
    }
}
