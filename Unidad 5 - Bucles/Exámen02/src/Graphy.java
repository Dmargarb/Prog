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
      System.out.print("Introduzca un número mayor que 0: ");
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

    switch (elecion) { // Según la elección se ejecuta una instrucción diferente
      case "s":
        for (int i = 0; i < digitos.length; i++) {
          // Dibujar la línea superior
          for (int j = 0; j <= digitoMax; j++) {
            System.out.print(" ---");
          }
          System.out.println();

          // Dibujar las celdas y las líneas verticales
          for (int j = 0; j <= digitoMax; j++) {
            if (j == 0) {
              // Mostrar el número en la primera celda
              System.out.printf("| %d ", digitos[i]);
            } else if (j <= digitos[i]) {
              // Rellenar las celdas a la derecha de la primera con asteriscos
              System.out.print("| * ");
            } else {
              // Rellenar el resto de las celdas con espacios
              System.out.print("|   ");
            }
          }
          // Añadir la línea vertical final
          System.out.println("|");

          // Dibujar la línea inferior de la celda
          for (int j = 0; j <= digitoMax; j++) {
            System.out.print(" ---");
          }
          System.out.println();
        }
        break;
      case "c":
        System.out.println("No se ha implementado la opción 'Color' aún.");
        break;
      default:
        System.out.println("No entendí tu elección");
    }
    s.close();
  }

  public static int[] dividirDigitoFuncion(long numeroIntroducido) {
    int longitud = longitudFuncion(numeroIntroducido);
    int[] digitos = new int[longitud];
    int j = 0;

    while (numeroIntroducido > 0) {
      digitos[j] = (int) (numeroIntroducido % 10);
      j++;
      numeroIntroducido /= 10;
    }

    // Invertir el array antes de devolverlo
    int[] resultado = new int[digitos.length];
    for (int i = 0; i < digitos.length; i++) {
      resultado[i] = digitos[digitos.length - i - 1];
    }
    return resultado;
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
