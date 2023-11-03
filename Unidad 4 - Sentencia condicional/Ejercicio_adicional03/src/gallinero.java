import java.util.Scanner;

public class gallinero {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("");
    System.out.println("                  ENTRADAS");
    System.out.println(" ----------------------------------------");
    System.out.print("Introduzca el precio de la entrada general: ");
    double precio = s.nextDouble();

    System.out.println("");
    System.out.println("       ENTRADAS");
    System.out.println(" -----------------------");
    System.out.println(" 1. Entrada al palco");
    System.out.println(" 2. Entrada al gallinero");
    System.out.print("\n Elija una opción (1-2): ");
    int entrada1 = s.nextInt();

    System.out.println("");
    System.out.println("              ENTRADAS");
    System.out.println(" -------------------------------------");
    System.out.println(" 1. Entrada de público con invitación");
    System.out.println(" 2. Entrada de público local");
    System.out.println(" 3. Entrada de público foráneo");
    System.out.print("\n Elija una opción (1-3): ");
    int entrada2 = s.nextInt();
    System.out.println("");

    if ((entrada1 != 1) || (entrada1 != 2)) {
      System.out.println("Error, el número introducido no es válido.");
    } else if ((entrada2 != 1) || (entrada2 != 2) || (entrada2 != 3)) {
      System.out.println("Error, el número introducido no es válido.");
    } else if ((entrada1 == 1) && (entrada2 == 1)) {
      double descuento = precio * 0.10;
      double precioFinal = precio - descuento;
      System.out.println(
        "El precio final de tu entrada es de: " + precioFinal + " euros."
      );
    } else if ((entrada1 == 1) && (entrada2 == 2)) {
      System.out.println(
        "El precio final de tu entrada es de: " + precio + " euros."
      );
    } else if ((entrada1 == 1) && (entrada2 == 3)) {
      double precioFinal = precio * 1.10;
      System.out.println(
        "El precio final de tu entrada es de: " + precioFinal + " euros."
      );
    } else if ((entrada1 == 2) && (entrada2 == 1)) {
      double descuento = precio * 0.05;
      double precioFinal = precio - descuento;
      System.out.println(
        "El precio final de tu entrada es de: " + precioFinal + " euros."
      );
    } else if ((entrada1 == 2) && (entrada2 == 2)) {
      System.out.println(
        "El precio final de tu entrada es de: " + precio + " euros."
      );
    } else if ((entrada1 == 2) && (entrada2 == 3)) {
      double precioFinal = precio * 1.05;
      System.out.println(
        "El precio final de tu entrada es de: " + precioFinal + " euros."
      );
    } else {
      System.out.println("Error, el número introducido no es válido.");
    }
    s.close();
  }
}
