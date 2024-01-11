import java.util.Scanner;

public class arrayAleatorioCambia {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int[] numeros = new int[100];

    for (int i = 0; i < 100; i++) {
      numeros[i] = (int) (Math.random() * 21);
      System.out.print(numeros[i] + " ");
    }
    System.out.println();

    System.out.print("\nIntroduce el valor 1: ");
    int valor1 = s.nextInt();
    System.out.print("\nIntroduce el valor 2: ");
    int valor2 = s.nextInt();
    System.out.println();

    for (int i = 0; i < 100; i++) {
      if (numeros[i] == valor1) {
        numeros[i] = valor2;
        System.out.print("\"" + numeros[i] + "\" ");
      } else {
        System.out.print(numeros[i] + " ");
      }
    }
    System.out.println();

    s.close();
  }
}
