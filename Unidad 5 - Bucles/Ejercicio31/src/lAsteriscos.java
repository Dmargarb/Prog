import java.util.Scanner;

public class lAsteriscos {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la altura de la L: ");
    int altura = s.nextInt();

    int paloHorizontal = (altura / 2) + 1;

    for (int i = 1; i < altura; i++) {
      System.out.println("*");
    }

    for (int i = 0; i < paloHorizontal; i++) {
      System.out.print("* ");
    }

    s.close();
  }
}
