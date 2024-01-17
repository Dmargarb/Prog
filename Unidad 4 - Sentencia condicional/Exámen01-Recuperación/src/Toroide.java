import java.util.Scanner;

/**
 * Volumen de un toroide
 *
 *
 * @author David Martín García
 */

public class Toroide {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.println("\033[1;30mVOLUMEN DE UN TOROIDE\033[0m"); // En negrita
    System.out.println("=====================");
    System.out.print("Introduzca el radio mayor (cms): ");
    double radioMayor = s.nextDouble(); // variable con el radio mayor
    System.out.print("Introduzca el radio menor (cms): ");
    double radioMenor = s.nextDouble(); // variable con el radio menor

    double volumen =
      2 * (Math.pow((Math.PI), 2)) * radioMayor * Math.pow(radioMenor, 2);
    // variable con el volumen siguiendo la fórmula

    System.out.println(
      "El volumen del toroide es de \033[1;31m" + volumen + "\033[0m cm\u00B3."
    ); // en rojo el volumen
    s.close();
  }
}
