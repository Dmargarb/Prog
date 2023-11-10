import java.util.Scanner;

public class mediaNumeroPositivos {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    double numero = 0;
    int numerosIntroducidos = 0;
    double resultado = 0;
    double media = 0;

    System.out.println(
      "\nEl programa calculará la media de todos los número que introduzcas mientras sean positivos."
    );

    while (numero >= 0) {
      System.out.print("\nIntroduce un número: ");
      numero = s.nextDouble();

      if (numero >= 0) {
        resultado = resultado + numero;
        numerosIntroducidos++;
      }
    }

    if (numerosIntroducidos == 0) {
      System.out.println("");
      System.out.println("No has introducido ningún numero positivo.");
      System.out.println("");
    } else {
      media = resultado / numerosIntroducidos;
      System.out.println("");
      System.out.println(
        "La media de los " +
        numerosIntroducidos +
        " números positivos introducidos es: " +
        media
      );
      System.out.println("");
    }
    s.close();
  }
}
