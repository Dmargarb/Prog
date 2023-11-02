import java.util.Scanner;

public class saludoHora {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.print("¿Qué hora es? ");
    int hora = s.nextInt();
    if (hora >= 6 && hora <= 12) {
      System.out.println("¡Buenos días!");
    } else if (hora >= 13 && hora <= 20) {
      System.out.println("¡Buenos tardes!");
    } else if ((hora >= 21 && hora <= 23) || (hora >= 0 && hora <= 5)) {
      System.out.println("¡Buenos noches!");
    } else {
      System.out.println("Error, el dato introducido no es válido€.");
    }
    s.close();
  }
}
