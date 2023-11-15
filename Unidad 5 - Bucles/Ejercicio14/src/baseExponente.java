import java.util.Scanner;

public class baseExponente {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int resultado = 1;
    System.out.print("\nIntroduce la base del número (entero positivo): ");
    int base = s.nextInt();
    System.out.print("\nIntroduce el exponente del número (entero positivo): ");
    int exponente = s.nextInt();

    if (base < 0 || exponente < 0) {
      System.out.println("\nEl número tiene que ser positivo.");
    } else {
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
          }
      System.out.println("\nLa potencia de "+base+" elevado a "+exponente+" = "+resultado+".");
      System.out.println("");
    }
    s.close();
  }
}