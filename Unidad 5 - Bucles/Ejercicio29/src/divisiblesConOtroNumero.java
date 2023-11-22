import java.util.Scanner;

public class divisiblesConOtroNumero {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número entero positivo grande: ");
    int numeroGrande = s.nextInt();

    System.out.print("Introduzca un número pequeño): ");
    int numeroPequeno = s.nextInt();

    System.out.print("Los números enteros positivos menores que " + numeroGrande );
    System.out.println(" que no son divisibles entre " + numeroPequeno + " son los siguientes:");

    for (int i = 1; i < numeroGrande; i++) {
      if ((i % numeroPequeno) != 0) {
        System.out.print(i + " ");
      }
    }
    s.close();
  }
}