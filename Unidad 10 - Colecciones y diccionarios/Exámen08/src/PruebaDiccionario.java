import java.util.ArrayList;

/**
 *
 * Definición de la clase PruebaDiccionario
 * 
 * @author David Martín García
 */

public class PruebaDiccionario {
    public static void main(String[] args) throws Exception {

        Diccionario diccionario = new Diccionario();
        int opcion = 0;

        do {
            try {
                System.out.println("\nMini-diccionario inglés-español");
                System.out.println("(1) Consultar el diccionario");
                System.out.println("(2) Añadir una entrada al diccionario");
                System.out.println("(3) Borrar una entrada completa del diccionario");
                System.out.println("(4) Borrar un significado en castellano del diccionario");
                System.out.println("(5) Salir del programa");
                System.out.print("\nElija una opción (1-5): ");
                opcion = Integer.parseInt(System.console().readLine());

                switch (opcion) {
                    case 1:
                        System.out.print("\nIntroduce la palabra en inglés: ");
                        String ingles = System.console().readLine();
                        ArrayList<String> listaPalabrasEspanol = diccionario.obtenerPalabrasEspanol(ingles);
                        System.out.println(ingles + ": " + listaPalabrasEspanol);
                        break;
                    case 2:
                        System.out.print("\nIntroduce la palabra en inglés: ");
                        String inglesAñadir = System.console().readLine();
                        System.out.print("\nIntroduce la palabra en español: ");
                        String espanolAñadir = System.console().readLine();
                        diccionario.addPalabraInglesEspanol(inglesAñadir, espanolAñadir);
                        break;
                    case 3:
                        System.out.print("\nIntroduce la palabra en inglés a borrar: ");
                        String inglesBorrar = System.console().readLine();
                        diccionario.removeIngles(inglesBorrar);
                        break;
                    case 4:
                        System.out.print("\nIntroduce la palabra en inglés: ");
                        String inglesIntroducido = System.console().readLine();
                        System.out.print("\nIntroduce la palabra en español: ");
                        String espanolBorrar = System.console().readLine();
                        diccionario.removeSignificado(inglesIntroducido, espanolBorrar);
                        break;
                    default:
                        System.out.println("\nIntroduce una opción válida.");
                }

            } catch (Exception e) {
                System.out.println("\nLa opción introducida no es válida");
            }

        } while (opcion != 5);
    }
}