import java.lang.System;
public class horoscopo {

  public static void main(String[] args) throws Exception {
    String myUnicodeSymbol = "\u05D0";
    System.out.println ("");
    System.out.println("\033[0;33m Artículo Precio/caja Nº cajas");
    System.out.println("\033[0;34m-----------------------------------------");
    System.out.printf("\033[0;30m%-10s %8.2f %6d\n", "manzanas", 4.5, 10);
    System.out.printf("\033[0;31m%-10s %8.2f %6d\n", "peras", 2.75, 120);
    System.out.printf("\033[0;32m%-10s %8.2f %6d\n", "aguacates", 10.0, 6);
    System.out.print ("€");
    

    System.out.println ("");
    System.out.println(myUnicodeSymbol);
    System.out.println("España €");
  }
}
