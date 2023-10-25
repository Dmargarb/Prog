import java.util.Scanner;
public class escanear {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un número: ");
    double primerNumero = s.nextDouble();

    System.out.print("Introduce un segundo número: ");
    double segundoNumero = s.nextDouble();
    
    double total = primerNumero * segundoNumero;

    System.out.println("La multiplicación de " +primerNumero+ " * " +segundoNumero+ " = " +total+ ".");
    s.close();
  }
}