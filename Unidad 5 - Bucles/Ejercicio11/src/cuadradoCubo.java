import java.util.Scanner;

public class cuadradoCubo {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.print("\nIntroduce un número: ");
    int numero = s.nextInt();

    System.out.println("");
    System.out.println("Número   Cuadrado   Cubo");
    System.out.println("------------------------");

    for (int i = numero; i < numero + 5; i++) {
      System.out.printf("%6d %10d %6d\n", i, i * i, i * i * i);
    }

    s.close();
  }
}
