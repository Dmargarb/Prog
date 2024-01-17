import java.util.Scanner;

/**
 * Tango
 *
 *
 * @author David Martín García
 */

public class Tango {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.println("\033[1;30mTANGO MODAS\033[0m"); // En negrita
    System.out.println("==============================");
    System.out.print("Introduce código de artículo: ");
    long codigo = s.nextLong();
    System.out.print("Introduce precio: ");
    double precio = s.nextDouble();
    System.out.print("Introduce unidades vendidas: ");
    int cantidad = s.nextInt();
    System.out.print("Introduce descuento (%): ");
    int descuentoIntroducido = s.nextInt();

    double descuento = precio * ((double) descuentoIntroducido / 100); //descuento
    double precioConCantidad = precio * cantidad; // Precio con la cantidad de productos.
    double precioConDescuento = (precio - descuento) * cantidad; // Precio con descuento.
    double iva = precioConDescuento * 0.16; // IVA al 16%.
    double precioConIVA = precioConDescuento + iva; // Precio con IVA.

    System.out.println("\nSu ticket:");
    System.out.println("\n\033[1;30mTANGO MODAS\033[0m");
    System.out.println("==============================");
    System.out.printf("%-10d %18.2f€\n", codigo, precio); // Precio.
    System.out.printf("%-1d uds.%23.2f€\n", cantidad, precioConCantidad); // Precio con la cantidad de productos.
    System.out.printf("%-2d%% %25.2f€\n", -descuentoIntroducido, -descuento); // Precio con descuento.
    System.out.print("16% IVA");
    System.out.printf("%22.2f€\n", +iva); // IVA.
    System.out.printf("\033[46mTOTAL %23.2f€\033[0m\n", precioConIVA);

    s.close();
  }
}
