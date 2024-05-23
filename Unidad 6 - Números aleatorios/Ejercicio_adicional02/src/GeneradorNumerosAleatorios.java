import java.io.IOException;
import java.util.Scanner;

public class GeneradorNumerosAleatorios {

  public static void main(String[] args) throws IOException, InterruptedException {
    Scanner scanner = new Scanner(System.in);
    boolean completado = false;
    int min = 1;
    int max = 10;
    int numeroAleatorio;
    int numeroIntroducido;

    do {
      try {

        // Limpiar la pantalla antes de imprimir cada mensaje
        limpiarPantalla();

        System.out.println("*** Generador de números aleatorios v2.0 ***\n");
        System.out.println("Número mínimo actual: " + min);
        System.out.println("Número máximo actual: " + max);
        System.out.println("");
        System.out.println("|------------------------------------------|");
        System.out.println("| 1. Generar un número aleatorio           |");
        System.out.println("|------------------------------------------|");
        System.out.println("| 2. Generar varios números aleatorios     |");
        System.out.println("|------------------------------------------|");
        System.out.println("| 3. Establecer número mínimo              |");
        System.out.println("|------------------------------------------|");
        System.out.println("| 4. Establecer número máximo              |");
        System.out.println("|------------------------------------------|");
        System.out.println("| 5. Salir                                 |");
        System.out.println("|------------------------------------------|\n");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        // Consumir el carácter de nueva línea
        scanner.nextLine();

        switch (opcion) {
          case 1:
            numeroAleatorio = generarNumeroAleatorio(max, min);
            System.out.println("\nEl número generado es el: " + numeroAleatorio);
            break;
          case 2:
            System.out.print("\nIntroduce la cantidad de números a generar: ");
            numeroIntroducido = scanner.nextInt();
            scanner.nextLine(); // Consumir el carácter de nueva línea
            if (numeroIntroducido > 1) {
              generarVariosNumeros(max, min, numeroIntroducido);
            } else {
              System.out.println("\nLa cantidad de números tiene que ser mayor a 1.");
            }
            break;
          case 3:
            System.out.print("\nIntroduce el número mínimo: ");
            numeroIntroducido = scanner.nextInt();
            scanner.nextLine(); // Consumir el carácter de nueva línea
            if (numeroIntroducido < max) {
              min = numeroIntroducido;
              System.out.println("\nEl número mínimo se ha establecido a " + min + ".");
            } else {
              System.out.println("\nEl número mínimo tiene que ser menor al número máximo.");
            }
            break;
          case 4:
            System.out.print("\nIntroduce el número máximo: ");
            numeroIntroducido = scanner.nextInt();
            scanner.nextLine(); // Consumir el carácter de nueva línea
            if (numeroIntroducido > min) {
              max = numeroIntroducido;
              System.out.println("\nEl número máximo se ha establecido a " + max + ".");
            } else {
              System.out.println("\nEl número máximo tiene que ser mayor al número mínimo.");
            }
            break;
          case 5:
            completado = true;
            break;
          default:
            System.out.println("\n¡Esa opción no es válida! :(");
        }

        if (!completado) {
          // Esperar a que el usuario presione Enter antes de continuar
          System.out.print("\nPresiona Enter para continuar...");
          scanner.nextLine();
        }

      } catch (Exception e) {
        System.out.println("\nAlgo salió mal... D: ");
        scanner.nextLine(); // Consumir el carácter de nueva línea

        // Esperar a que el usuario presione Enter antes de continuar
        System.out.print("\nPresiona Enter para continuar...");
        scanner.nextLine();
      }

    } while (!completado);
    scanner.close();
  }

  private static int generarNumeroAleatorio(int max, int min) {
    int numeroAleatorio = (int) (Math.random() * ((max - min) + 1) + min);
    return numeroAleatorio;
  }

  private static void generarVariosNumeros(int max, int min, int cantidad) {
    System.out.println("\nGenerando " + cantidad + " números aleatorios...\n");
    for (int i = 0; i < cantidad; i++) {
      int numeroAleatorio = generarNumeroAleatorio(max, min);
      System.out.println("Número " + (i + 1) + ": " + numeroAleatorio);
    }
  }

  private static void limpiarPantalla() throws IOException, InterruptedException {
    ProcessBuilder builder = new ProcessBuilder("cmd", "/c", "cls");
    builder.inheritIO();
    Process process = builder.start();
    process.waitFor();
  }
}
