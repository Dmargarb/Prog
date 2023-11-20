import java.util.Scanner;

public class numeroAlReves {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un número y lo pondré al revés: ");
    int numeroIntroducido = s.nextInt();

    int numero = numeroIntroducido;
    int alReves = 0;

    while (numero > 0) {
      alReves = (alReves * 10) + (numero % 10);
      numero /= 10;
    }

    System.out.print("Si le damos la vuelta al " + numeroIntroducido);
    System.out.println(" tenemos el " + alReves + ".");
    s.close();
  }
}
