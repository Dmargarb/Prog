import java.util.Scanner;

public class numeroPrimo {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int esPrimo = 0;
    
    System.out.print("Introduce un número: ");
    int numero = s.nextInt();

    for (int i = 1; i <= numero; i++) {
      if ((numero % i) == 0) {
        esPrimo++;
      }
    }
    if (esPrimo == 2) {
      System.out.println("El número " + numero + " es un número primo.");
    } else {
      System.out.println("El número " + numero + " no es un número primo.");
    }
    s.close();
  }
}
