import java.util.Scanner;

public class digitosNumeros {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.print("\nIntroduce un número: ");
    long numero = s.nextLong();
    int digitos = 1;
    while (numero >= 10) {
      numero /= 10;
      digitos++;
    }
    System.out.println("El número tiene: " + digitos + " digitos.");
    s.close();
  }
}
