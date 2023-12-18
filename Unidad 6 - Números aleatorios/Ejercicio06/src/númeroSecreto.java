import java.util.Scanner;

public class númeroSecreto {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.println("Adivina un número al azar entre 0 y 100");

    int numeroSecreto = (int) (Math.random() * 101);
    int intentos = 5;
    boolean acertado = false;

    do {
      System.out.print("Introduce el número: ");
      int numeroIntroducido = s.nextInt();

      if (numeroIntroducido == numeroSecreto) {

        System.out.println("¡Has acertado!");
        acertado = true;

      } else if (numeroIntroducido < numeroSecreto) {

        intentos--;
        System.out.println("¡Ese no es el número!");
        System.out.println("El número que estoy pensando es mayor que "+numeroIntroducido+".");
        System.out.println("Te quedan "+intentos+" intentos más.");


      } else {

        intentos--;
        System.out.println("¡Ese no es el número!");
        System.out.println("El número que estoy pensando es mayor que "+numeroIntroducido+".");
        System.out.println("Te quedan "+intentos+" intentos más.");
      }

    } while (!acertado && intentos > 0);
    s.close();
  }
}
