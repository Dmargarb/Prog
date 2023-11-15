import java.util.Scanner;

public class baseExponenteBucle {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int resultado;
    int exponente;
    int exponenteFinal;
    int base;

    System.out.print("Introduce la base del número: ");
    base = s.nextInt();
    System.out.print("Introduce el exponente del número (entero positivo): ");
    exponenteFinal = s.nextInt();

    if (exponenteFinal < 0) {
      System.out.println("El exponente tiene que ser positivo.");
    } else {
      for (int i = 1; i <= exponenteFinal; i++) {
        resultado = 1;
        exponente = i;

        for (int x = 0; x < exponente; x++) {
          resultado *= base;
        }

        System.out.println(base + "^" + i + " = " + resultado);
      }
    }
    s.close();
  }
}
