public class horoscopo {

  public static void main(String[] args) throws Exception {
    System.out.println ("");
    System.out.println("\033[0;33m Artículo Precio/caja Nº cajas");
    System.out.println("\033[0;34m-----------------------------------------");
    System.out.printf("\033[0;30m%-10s %8.2f %6d\n", "manzanas", 4.5, 10);
    System.out.printf("\033[0;31m%-10s %8.2f %6d\n", "peras", 2.75, 120);
    System.out.printf("\033[0;32m%-10s %8.2f %6d\n", "aguacates", 10.0, 6);
    System.out.print ("\033[0m");
    System.out.println ("");
  }
}
