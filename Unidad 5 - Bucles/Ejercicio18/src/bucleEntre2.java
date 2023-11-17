import java.util.Scanner;

public class bucleEntre2 {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un número: ");
    int numero1 = s.nextInt();

    System.out.print("Introduce un segundo número: ");
    int numero2 = s.nextInt();

    if (numero1 == numero2) {
      System.out.println("El primer número tiene que ser distinto al segundo.");
    }

    if (numero1 > numero2) {
      int mayor = numero1;
      numero1 = numero2;
      numero2 = mayor;
    }

    for (int i = numero1; i <= numero2; i = i + 7) {
      System.out.print(i + " ");
    }
    s.close();
  }
}
