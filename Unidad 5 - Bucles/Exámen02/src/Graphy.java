/**
 * Graphy
 *
 *
 * @author David Martín García
 */
import java.util.Scanner;

public class Graphy {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    long numeroIntroducido = 0;

    do {
      System.out.print("Introduzca un número: ");
      numeroIntroducido = s.nextLong(); // Se introduce el número

      if (numeroIntroducido <= 0) { // Se comprueba que el número sea mayor a 0
        System.out.println("El número tiene que ser mayor a 0");
      }
    } while (numeroIntroducido <= 0);

    System.out.print("Simple o en Color (escriba S o C): ");
    String elecion = System.console().readLine();

    elecion = elecion.toLowerCase(); // Se convierte en minúscula la elección

    switch (elecion) {  // Según la elección se ejecuta una instrucción diferente
      case "s":
        long numero = numeroIntroducido;
        int longitud = 0;
        long numeroMayor = 0;

        while (numero != 0) { // Se obtiene la longitud del número
          numero = numero / 10;
          longitud++;
        }

        for (int i = longitud - 1; i >= 0; i--) { // Se divide el número para obtener los dígitos
          long digito = numeroIntroducido / (int) Math.pow(10, i);

          System.out.printf("%4s\n", "---");
          System.out.printf("| %d |\n", digito);
          System.out.printf("%4s\n", "---");

          if (numeroMayor < digito) { // Se obtiene el dígito mayor
            numeroMayor = digito;
          }

          numeroIntroducido = numeroIntroducido % (int) Math.pow(10, i); // Se repite el proceso
        }
        break;
      case "c":
        
        break;
      default:
        System.out.println("No entendí tu elección");
    }
    s.close();
  }
}
