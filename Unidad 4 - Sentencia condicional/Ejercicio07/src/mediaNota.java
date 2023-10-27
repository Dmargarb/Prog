import java.util.Scanner;

public class mediaNota {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la primera nota: ");
    double a = s.nextDouble();
    System.out.print("Introduzca la seguna nota: ");
    double b = s.nextDouble();
    System.out.print("Introduzca la tercera nota: ");
    double c = s.nextDouble();
    double media = (a+b+c)/3;
    System.out.println("La media de las tres notas es: "+media+".");
    s.close();
  }
}