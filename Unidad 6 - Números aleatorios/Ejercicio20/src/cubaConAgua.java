import java.util.Scanner;

public class cubaConAgua {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
    int capacidad = s.nextInt();

    System.out.println();

    int min = 0;
    int max = capacidad;
    int litros = (int) (Math.random() * ((max - min) + 1) + min);
    int capacidadLibre = capacidad - litros;

    for (int i = 0; i < capacidad; i++) {
      if (i < capacidadLibre) {
        System.out.println("*    *");
      } else {
        System.out.println("*====*");
      }
    }

    System.out.println("******");
    System.out.println();
    System.out.print("La cuba tiene una capacidad de " + capacidad);
    System.out.print(" litros y contiene " + litros + " litros de agua.");
    s.close();
  }
}
