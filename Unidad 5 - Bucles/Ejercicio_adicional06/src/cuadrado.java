import java.util.Scanner;

public class cuadrado {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor ingrese el tamaño del cuadrado: ");
    int n = s.nextInt();

    if (n >= 0 && n <= 50) {
      //Linea superior
      for (int i = 0; i < n; i++) {
        System.out.print("*");
      }
      System.out.println();

      //centro de la forma
      for (int i = 0; i < n - 2; i++) {
        System.out.print("*");
        for (int j = 0; j < n - 2; j++) {
          System.out.print(" ");
        }
        System.out.println("*");
      }

      //Linea inferior
      for (int i = 0; i < n; i++) {
        System.out.print("*");
      }
    } else {
      System.out.println(
        "Error. El dato a ingresar de " + "estar entre 0 y 50"
      );
    }

    s.close();
  }
}
