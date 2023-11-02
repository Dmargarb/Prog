import java.util.Scanner;

public class segundoGrado {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca el valor de a:");
    double a = s.nextDouble();

    System.out.print("Introduzca el valor de b:");
    double b = s.nextDouble();

    System.out.print("Introduzca el valor de c:");
    double c = s.nextDouble();

    if (a == 0) {
      if (b == 0) {
        System.out.println("No tiene solución.");
      } else {
        double x = (-1 * c) / b;
        System.out.println("Solo hay una solución: X = " + x);
      }
    } else {
      double discriminante = b * b - (4 * a * c);
      if (discriminante < 0) {
        System.out.println("No tiene solución.");
      } else {
        if (discriminante == 0) {
          double x = (-1 * b) / (2 * a);
          System.out.println("Solo hay una solución: X = " + x);
        } else {
          double x1 = (-b + Math.sqrt(discriminante) / (2 * a));
          double x2 = (-b - Math.sqrt(discriminante) / (2 * a));
          System.out.println("La primera solución es: X = " + x1);
          System.out.println("La segunda solución es: X = " + x2);
        }
      }
    }
    s.close();
  }
}
