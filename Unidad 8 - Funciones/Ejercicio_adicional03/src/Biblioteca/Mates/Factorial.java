package Biblioteca.Mates;

public class Factorial {

  public static int factorialFuncion(int x) {
    int a = 1;

    for (int i = 1; i <= x; i++) {
      a *= i;
    }
    return a;
  }
}
