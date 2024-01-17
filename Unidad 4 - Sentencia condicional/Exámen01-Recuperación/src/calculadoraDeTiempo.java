import java.util.Scanner;

/**
 * Calculadora De Tiempo
 *
 *
 * @author David Martín García
 */

public class calculadoraDeTiempo {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.println("\033[1;30mCALCULADORA DE TIEMPO\033[0m"); // En negrita
    System.out.println("=====================");
    System.out.print("Introduce una cantidad de segundos: ");
    long segundosIntroducidos = s.nextLong(); // variable con los segundos

    long horas = segundosIntroducidos / 3600; //variable de las horas
    long minutos = (segundosIntroducidos - (3600 * horas)) / 60; //variable de los minutos
    long segundos = segundosIntroducidos - ((horas * 3600) + (minutos * 60)); //variable de los segundos restantes

    System.out.println(
      segundosIntroducidos +
      " segundos son \033[43m" +
      horas +
      " horas\033[0m, \033[41m" +
      minutos +
      " minutos\033[0m y \033[42m" +
      segundos +
      " segundos\033[0m."
    );

    s.close();
  }
}
