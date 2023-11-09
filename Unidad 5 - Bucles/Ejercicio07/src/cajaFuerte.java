import java.util.Scanner;

public class cajaFuerte {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int intentos = 4;
    int numero;
    boolean acierto = false;
    do {
      System.out.print("\nIntroduce la clave de la caja fuerte: ");
      numero = s.nextInt();

      if (numero == 1234) {
        acierto = true;
      } else {
        System.out.println("\nLo siento, esa no es la combinación.");
      }

      intentos = intentos - 1;
    } while ((!acierto) && intentos > 0);

    if (acierto) {
      System.out.println("\nLa caja fuerte se ha abierto satisfactoriamente.");
      System.out.println("");
    } else {
      System.out.println("\nTe has quedado sin intentos.");
      System.out.println("");
    }

    s.close();
  }
}
