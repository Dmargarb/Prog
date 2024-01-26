package Biblioteca.Mates;

import java.util.Scanner;

public class Fibonacci {

  public static void fibonacciFuncion() {
    Scanner s = new Scanner(System.in);
    System.out.print(
      "¿Cuántos números de la sucesión de Fibonacci quieres ver? "
    );
    int numero = s.nextInt();

    int a = 0;
    int b = 1;
    int c;

    for (int i = 1; i <= numero; i++) {
      System.out.print(a + " ");
      c = a + b;
      a = b;
      b = c;
    }
    s.close();
  }
}
