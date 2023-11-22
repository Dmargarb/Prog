import java.util.Scanner;

public class multiplo3 {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    int numerosTotales = 0;
    int sumaTotal = 0;

    System.out.print("Introduce un número: ");
    int numero = s.nextInt();

    for (int i = 1; i <= numero; i++) {
      if (i % 3 == 0) {
        System.out.print(i + " ");
        numerosTotales++;
        sumaTotal = sumaTotal + i;
      }
    }
    System.out.print("\nDesde 1 hasta " + numero + " hay " + numerosTotales);
    System.out.println(" múltiplos de 3 y suman " + sumaTotal + ".");
    s.close();
  }
}
