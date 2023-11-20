import java.util.Scanner;

public class mediaParImpar {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    double numero = 0;
    int numerosIntroducidosTotales = 0;
    int numerosIntroducidosImpares = 0;
    double parMasGrande = 0;
    double resultado = 0;
    double media = 0;

    System.out.println("Introduzca todos los números que quieras.");
    System.out.println("El programa finalizará con un número negativo.");
    do {
      System.out.print("\nIntroduce un número: ");
      numero = s.nextDouble();

      if (numero >= 0 && numero % 2 != 0) {
        resultado = resultado + numero;
        numerosIntroducidosImpares++;
      } else if (numero > parMasGrande) {
        parMasGrande = numero;
      }
      numerosIntroducidosTotales++;
    } while (numero > 0);
      numerosIntroducidosTotales--;
    if (numerosIntroducidosTotales == 0) {
      System.out.println("No has introducido ningún numero positivo.");
    } else {
      media = resultado / numerosIntroducidosImpares;
      System.out.println(
        "Ha introducido " + numerosIntroducidosTotales + " números positivos."
      );
      System.out.println("La media de los impares es " + media);
      System.out.println("El máximo de los pares es " + parMasGrande + ".");
    }
    s.close();
  }
}
