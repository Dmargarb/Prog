public class barajaEspañola {

  public static void main(String[] args) {
    String palo = "";
    String carta = "";

    int numeroPalo = (int) (Math.random() * 4) + 1;

    switch (numeroPalo) {
      case 1:
        palo = "oros";
        break;
      case 2:
        palo = "copas";
        break;
      case 3:
        palo = "espadas";
        break;
      case 4:
        palo = "bastos";
      default:
    }

    int numeroCarta = (int) (Math.random() * 40) + 1;

    switch (numeroCarta) {
      case 1:
        carta = "As";
        break;
      case 8:
        carta = "Sota";
        break;
      case 9:
        carta = "Caballo";
        break;
      case 10:
        carta = "Rey";
        break;
      default:
        carta = String.valueOf(numeroCarta);
    }

    System.out.println(carta + " de " + palo);
  }
}
