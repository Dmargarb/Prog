import java.util.Scanner;

public class ecuacionPrimer {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.println(
      "Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0"
    );
    System.out.print("Por favor, introduzca el valor de a: ");
    double a = s.nextDouble();
    System.out.print("Por favor, introduzca el valor de b: ");
    double b = s.nextDouble();
    if (a == 0) {
      System.out.println("Esa ecuación no tiene solución real.");
    } else {
      double total = (-1 * b) / a;
      System.out.println("x = " + total + ".");
    }
    s.close();
  }
}