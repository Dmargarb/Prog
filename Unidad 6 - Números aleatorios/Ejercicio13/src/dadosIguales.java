public class dadosIguales {

  public static void main(String[] args) throws Exception {
    int dado1 = 0;
    int dado2 = 0;
    int tirada = 0;

    do {
      dado1 = ((int) (Math.random() * 6) + 1);
      dado2 = ((int) (Math.random() * 6) + 1);
      tirada++;

      System.out.println("Tirada " + tirada + ":");
      System.out.println("\nDado 1 = " + dado1);
      System.out.println("Dado 2 = " + dado2);
      System.out.println();
    } while (!(dado1 == dado2));
  }
}
