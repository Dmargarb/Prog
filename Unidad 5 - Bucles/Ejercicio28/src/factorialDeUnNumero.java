import java.util.Scanner;

public class factorialDeUnNumero {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numero; //Declarar variable

    do { //Bucle pidiendo el número entero positivo
      System.out.print("Introduzca un número entero: ");
      numero = s.nextInt();
      if (numero < 0) {
        System.out.println("Tienes que introducir un numero entero positivo.");
      }
    } while (numero < 0);

    int factorial = 1;

    for (int i = 1; i <= numero; i++) {
      factorial = factorial * i;
    }
    System.out.println("El factorial de " + numero + " es: " + factorial + ".");
    s.close();
  }
}
