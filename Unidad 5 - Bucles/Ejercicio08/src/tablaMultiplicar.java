import java.util.Scanner;
public class tablaMultiplicar {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("\n¿De cuál número quieres la tabla de multiplicar?: ");
    int numero = s.nextInt();

    for (int i = 0; i <= 10; i++) {
      System.out.printf("%d x %2d = %5d\n", numero, i, numero * i);
    }
    s.close();
  }
}
