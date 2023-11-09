import java.util.Scanner;

public class calcularSegundos {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.println("");
    System.out.print("\nIntroduce la hora actual (0-23): ");
    int hora = s.nextInt();
    System.out.print("\nIntroduce los minutos actuales (0-59): ");
    int minutos = s.nextInt();
    System.out.println("");

    if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59) {
      System.out.println("Los datos introducidos no son correctos.");
      System.out.println("");
    } else {
      int segundos = (hora * 3600) + (minutos * 60);
      int segundosFaltantes = (24 * 3600) - segundos;
      System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos.\n", hora, minutos, segundosFaltantes);   
    }
    System.out.println("");
    s.close();
  }
}
