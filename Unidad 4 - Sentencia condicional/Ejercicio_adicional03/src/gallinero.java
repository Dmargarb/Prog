import java.util.Scanner;

public class gallinero {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca el precio de la entrada general: ");
    double precio = s.nextDouble();

    System.out.println("Introduzca opción a elegir:");
    System.out.println("1. Entrada al palco.");
    System.out.println("2. Entrada al gallinero.");
    int entrada1 = s.nextInt();

    System.out.println("Introduzca opción a elegir:");
    System.out.println("1. Entrada de público con invitación.");
    System.out.println("2. Entrada de público local.");
    System.out.println("3. Entrada de público foráneo.");
    int entrada2 = s.nextInt();

    if ((entrada1 != 1) && (entrada1 != 2)) {
      System.out.println("Error, el número introducido no es válido.");
    } else if ((entrada2 != 1) && (entrada2 != 2) && (entrada2 != 3)) {
      System.out.println("Error, el número introducido no es válido.");
    } else if ((entrada1 == 1) && (entrada2 == 1)) {
      System.out.println("Hola1");
    } else if ((entrada1 == 1) && (entrada2 == 2)) {
      System.out.println("Hola2");
    } else if ((entrada1 == 1) && (entrada2 == 3)) {
      System.out.println("Hola3");
    } else if ((entrada1 == 2) && (entrada2 == 1)) {
      System.out.println("Hola4");
    } else if ((entrada1 == 2) && (entrada2 == 2)) {
      System.out.println("Hola5");
    } else if ((entrada1 == 2) && (entrada2 == 3)) {
      System.out.println("Hola6");
    } else {
      System.out.println("Error, el número introducido no es válido.");
    }
    s.close();
  }
}
