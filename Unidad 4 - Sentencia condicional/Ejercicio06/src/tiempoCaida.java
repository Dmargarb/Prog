import java.util.Scanner;

public class tiempoCaida {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura: ");
    double h = s.nextDouble();
    double tiempo = Math.sqrt((2 * h) / 9.81);
    System.out.println("El tiempo que tarda en caer es de: "+tiempo+" segundos.");
    s.close();
  }
}