import java.util.Scanner;

public class piramideNumeros {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la altura de la piramide ");
    int numero = s.nextInt();

    int altura = 1;
    int i = 0;
    int espacios = numero - 1;

    while (altura <= numero) {
      
      // inserta espacios
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      // pinta la línea de números
      for (i = 1; i < altura; i++) {
        System.out.print(i);
      }
      
      for (i = altura; i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println();
      
      altura++;
      espacios--;
    } // while
    s.close();
  }
}