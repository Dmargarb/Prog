import java.util.Scanner;

public class positivosNegativos {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int numerosAintroducir = 10;
    double numeroIntroducido = 0;
    int positivos = 0;
    int negativos = 0;

    System.out.println("\nIntroduce 10 números positivos o negativos.");

    while (numerosAintroducir > 0) {
      System.out.print("\nIntroduce un número: ");
      numeroIntroducido = s.nextDouble();

      if (numeroIntroducido >= 0) {
        positivos++;
      } else {
        negativos++;
      }
      numerosAintroducir--;
    }
    System.out.println("");
    System.out.println(
      "Ha introducio " +
      positivos +
      " números positivos y " +
      negativos +
      " números negativos."
    );
    System.out.println("");
    s.close();
  }
}
