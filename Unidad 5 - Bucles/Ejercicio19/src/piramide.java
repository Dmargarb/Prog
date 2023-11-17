import java.util.Scanner;

public class piramide {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.print("¿De cuántos pisos quieres la piramide? ");
    int altura = s.nextInt();

    System.out.print("¿De cuál carácter quieres pintar la piramide? ");
    String caracterIntroducido = System.console().readLine();

    for (int fila = 1; fila <= altura; fila++) {
      for (int espacios = 1; espacios <= altura - fila; espacios++) {
        System.out.print(" ");
      }
      for (int caracter = 1; caracter <= 2 * fila - 1; caracter++) {
        System.out.print(caracterIntroducido);
      }
      System.out.println("");
    }

    s.close();
  }
}
