import java.util.Scanner;

public class Calculadora {

  public static double suma(double sumando1, double sumando2) {
    double resultado;
    resultado = sumando1 + sumando2;
    return resultado;
  }

  public static double resta(double minuendo, double sustraendo) {
    double resultado;
    resultado = minuendo - sustraendo;
    return resultado;
  }

  public static double multiplicacion(
    double multiplicando1,
    double multiplicando2
  ) {
    double resultado;
    resultado = multiplicando1 * multiplicando2;
    return resultado;
  }

  public static double division(double dividendo1, double divisor2) {
    double resultado;
    resultado = dividendo1 / divisor2;
    return resultado;
  }

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    int eleccion;
    double numero1;
    double numero2;
    double resultado;

    do {
      System.out.println("\n    CALCULADORA    ");
      System.out.println("---------------------");
      System.out.println("1.- Suma");
      System.out.println("2.- Resta");
      System.out.println("3.- Multiplicación");
      System.out.println("4.- División");
      System.out.print("\nElija una opción (1-4): ");
      eleccion = s.nextInt();

      if ( eleccion < 1 || eleccion > 4) {
        System.out.println("\nNo sé qué operación quieres hacer");
        }

    } while (!(eleccion == 1 || eleccion == 2 || eleccion == 3 || eleccion == 4));

    System.out.print("Introduce el primer número: ");
    numero1 = s.nextDouble();

    System.out.print("Introduce el segundo número: ");
    numero2 = s.nextDouble();

    switch (eleccion) {
      case 1:
        resultado = suma(numero1, numero2);
        System.out.println("La suma de " + numero1 + " + " + numero2 + " es " + resultado);
        break;
      case 2:
        resultado = resta(numero1, numero2);
        System.out.println( "La resta de " + numero1 + " - " + numero2 + " es " + resultado);
        break;
      case 3:
        resultado = multiplicacion(numero1, numero2);
        System.out.println("La multiplicación de " + numero1 + " * " + numero2 + " es " + resultado);
        break;
      case 4:
        resultado = division(numero1, numero2);
        System.out.println("La división de " + numero1 + " : " + numero2 + " es " + resultado);
        break;
    }
    s.close();
  }
}