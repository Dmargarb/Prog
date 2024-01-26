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

    int[] digitos = dividirDigitoFuncion(numeroIntroducido);
    int digitoMax = numeroMayor(digitos);
    int longitud = longitudFuncion(numeroIntroducido);

    switch (elecion) { // Según la elección se ejecuta una instrucción diferente
      case "s":
        for (int i = 0; i < digitos.length; i++) {
          System.out.println(" --- ");
          System.out.println("| " + digitos[i] + " |");

          if (i == longitud - 1) {
            System.out.println(" --- ");
          }
          for (int j = 0; j < digitoMax + 1; j++) {
            System.out.print(" --- ");
            System.out.print("|   |");

            if (i == longitud - 1) {
              System.out.print(" --- ");
            }
          }
          System.out.println("");
        }
        break;
      case "c":
        break;
      default:
        System.out.println("No entendí tu elección");
    }
    s.close();
  }

  public static int[] dividirDigitoFuncion(long numeroIntroducido) { // Se divide el número para obtener los dígitos
    int longitud = longitudFuncion(numeroIntroducido);
    int[] digitos = new int[longitud];
    int j = 0;

    for (int i = longitud - 1; i >= 0; i--) {
      long digito = numeroIntroducido / (int) Math.pow(10, i);
      digitos[j] = (int) digito;
      j++;
      numeroIntroducido = numeroIntroducido % (int) Math.pow(10, i);
    }
    return digitos;
  }

  public static int longitudFuncion(long numero) { // Se obtiene la longitud del número
    int longitud = 0;

    while (numero != 0) {
      numero = numero / 10;
      longitud++;
    }
    return longitud;
  }

  public static int numeroMayor(int[] digitos) {
    int numeroMax = 0;

    for (int i = 0; i < digitos.length; i++) {
      if (numeroMax < digitos[i]) {
        numeroMax = digitos[i];
      }
    }
    return numeroMax;
  }
}
