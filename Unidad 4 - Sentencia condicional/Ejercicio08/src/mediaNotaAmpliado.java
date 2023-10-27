import java.util.Scanner;

public class mediaNotaAmpliado {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la primera nota: ");
    double a = s.nextDouble();
    System.out.print("Introduzca la seguna nota: ");
    double b = s.nextDouble();
    System.out.print("Introduzca la tercera nota: ");
    double c = s.nextDouble();
    double media = (a+b+c)/3;
    if (media < 5) {
      System.out.println("La media de las tres notas es: "+media+".");
      System.out.println("La nota es insuficiente.");
    } else if (media < 6 ) {
      System.out.println("La media de las tres notas es: "+media+".");
      System.out.println("La nota es suficiente.");
    } else if (media < 7 ) {
      System.out.println("La media de las tres notas es: "+media+".");
      System.out.println("La nota es  bien.");
    } else if (media < 9 ) {
      System.out.println("La media de las tres notas es: "+media+".");
      System.out.println("La nota es notable.");
    } else {
      System.out.println("La media de las tres notas es: "+media+".");
      System.out.println("La nota es  sobresaliente.");
    }
    s.close();
  }
}