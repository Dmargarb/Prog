public class segunHora {

  public static void main(String[] args) throws Exception {
    System.out.print("¿Qué hora es? ");
    String horario = System.console().readLine();
    int hora = Integer.parseInt(horario);
    if (hora >= 6 && hora <= 12) {
      System.out.println("¡Buenos días!");
    } else if (hora >= 13 && hora <= 20) {
      System.out.println("¡Buenos tardes!");
    } else if ((hora >= 21 && hora <= 23) || (hora >= 0 && hora <= 5)) {
      System.out.println("¡Buenos noches!");
    } else {
      System.out.println("No entendí tu respuesta.");
    }
  }
}