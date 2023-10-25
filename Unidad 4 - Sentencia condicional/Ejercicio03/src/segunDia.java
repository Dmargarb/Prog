import java.util.Scanner;

public class segunDia {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número del 1 al 7: ");
    int numero = s.nextInt();
    switch (numero) {
      case 1:
        System.out.println("El número " +numero+ " corresponde con el día Lunes.");
        break;
      case 2:
        System.out.println("El número " +numero+ " corresponde con el día Martes.");
        break;
      case 3:
        System.out.println("El número " +numero+ " corresponde con el día Miércoles.");
        break;
      case 4:
        System.out.println("El número " +numero+ " corresponde con el día Jueves.");
        break;
      case 5:
        System.out.println("El número " +numero+ " corresponde con el día Viernes.");
        break;
      case 6:
        System.out.println("El número " +numero+ " corresponde con el día Sábado.");
        break;
      case 7:
        System.out.println("El número " +numero+ " corresponde con el día Domingo.");
        break;
      default:
        System.out.println("El número introducido no es válido.");
    }
    s.close();
  }
}