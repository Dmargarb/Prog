import java.util.Scanner;

public class sumaMedia {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numerosIntroducidos = 0;
    double resultado = 0;
    double media = 0;
    double numero = 0;

    System.out.println(
      "El programa calculará la suma de los números que introduzcas hasta llegar a 10000."
    );

    do {
      System.out.print("\nIntroduce un número: ");
      numero = s.nextDouble();
      numerosIntroducidos++;
      resultado = numero + resultado;
    } while (resultado <= 10000);
    media = resultado / numerosIntroducidos;
    System.out.println("\nEl total de la suma es " + resultado + ".");
    System.out.println("Has introducido " + numerosIntroducidos + " números.");
    System.out.println("La media es " + media + ".");

    s.close();
  }
}
