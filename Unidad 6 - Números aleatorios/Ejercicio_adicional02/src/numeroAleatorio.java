import java.util.Scanner;

public class numeroAleatorio {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    boolean completado = false;
    int min = 0;
    int max = 0;
    int numeroAleatorio;

    System.out.println("\nBienvenido al generador de números aleatorios.");
    System.out.println("¡Recuerda que tienen que ser números sin decimales!");

    do {
      System.out.println("\nIntroduzca la opción necesaria:");
      System.out.println("1. Establecer número mínimo");
      System.out.println("2. Establecer número máximo");
      System.out.println("3. Generar número");
      System.out.println("4. Salir");
      System.out.print("\nOpción:");
      int opcion = s.nextInt();

      switch (opcion) {
        case 1:
          System.out.print("\nIntroduce el número mínimo: ");
          min = s.nextInt();
          break;
        case 2:
          System.out.print("\nIntroduce el número máximo: ");
          max = s.nextInt();
          break;
        case 3:
          numeroAleatorio = (int) (Math.random() * ((max - min) + 1) + min);
          System.out.print("\nEl número generado es: " + numeroAleatorio);
          System.out.println("");
          break;
        case 4:
          System.out.println("\n¡Gracias por tu visita! :)");
          completado = true;
          break;
        default:
          System.out.println("\n¡Esa opción no es válida! :(");
      }
    } while (!completado);
    s.close();
  }
}
