import java.util.Scanner;

public class PruebaDeFunciones {

  public static double sumaFuncion(double x, double y) {
    return x + y;
  }

  public static boolean EsParFuncion(double x) {
    if (x % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean esPrimoFuncion(double x) {
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.print("Primer Número: ");
    double x = s.nextDouble();
    System.out.print("Segundo Número: ");
    double y = s.nextDouble();

    double suma = sumaFuncion(x, y);
    boolean esPar = EsParFuncion(suma);
    boolean esPrimo = esPrimoFuncion(suma);

    System.out.println("\nSuma: " + suma);
    System.out.println("Par: " + esPar);
    System.out.println("Primo: " + esPrimo);

    s.close();
  }
}
