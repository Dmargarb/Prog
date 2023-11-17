import java.util.Scanner;

public class sumar100 {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int resultado = 0;
    System.out.print("Introduce un número positivo: ");
    int numero = s.nextInt();

    if (numero < 0) {
      System.out.println("El número tiene que ser positivo.");
    } else {
      for(int i = numero; i < numero + 100; i++) {
        resultado = i + 1;
      }
      System.out.println(
        "La suma de " +
        numero +
        " mas los 100 siguientes números es " +
        resultado +
        "."
      );
    }
    s.close();
  }
}
