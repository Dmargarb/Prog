/**
 * Ticket de compra
 *
 *
 * @author David Martín García
 */
import java.util.Scanner;

public class ticket {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int alimento = 0;
    
    System.out.println("");
    System.out.println("   Tipo de producto:");
    System.out.println(" ------------------");
    System.out.println(" 1. Alimentación");
    System.out.println(" 2. Electrónica");
    System.out.println(" 3. Farmacia");
    System.out.println(" 4. Moda");
    System.out.print("\n Elija una opción (1-4): ");
    int producto = s.nextInt();

    if (producto == 1) {
      System.out.println("");
      System.out.println("   Tipo de alimento:");
      System.out.println(" -------------------");
      System.out.println(" 1. Huevos");
      System.out.println(" 2. Leche");
      System.out.println(" 3. Pan");
      System.out.println(" 4. Fruta");
      System.out.println(" 5. Verdura");
      System.out.println(" 6. Otros");
      System.out.print("\n Elija una opción (1-6): ");
      alimento = s.nextInt();
    }

    System.out.print("\n Introduzca el nombre del producto: ");
    String linea3 = System.console().readLine();

    System.out.print("\n Introduzca la cantidad de productos: ");
    int cantidad = s.nextInt();

    System.out.print("\n Introduzca el precio por unidad del producto: ");
    double precio = s.nextDouble();
    System.out.println("");

    if ((producto == 1) && (alimento == 1)) {
      double precioTotal = precio * cantidad;
      double precioFinal = precioTotal * 1.04;
      double iva = precioFinal - precioTotal;

      System.out.println("Factura");
      System.out.println("-----------------------------");
      System.out.printf("%-10s      %13s\n", "Artículo", linea3);
      System.out.printf("%-10s      %6.2f/unidad\n", "Precio", precio);
      System.out.printf("%-10s      %13d\n", "Cantidad", cantidad);
      System.out.printf("%-10s      %12.2f€\n", "Total", precioTotal);
      System.out.printf("%-10s      %12.2f€\n", "IVA al 4%", iva);
      System.out.println("-----------------------------");
      System.out.printf("%-10s      %9.2f€ \n", "Total con IVA", precioFinal);
    } else if ((producto == 1) && (alimento == 2)) {
      double precioTotal = precio * cantidad;
      double precioFinal = precioTotal * 1.04;
      double iva = precioFinal - precioTotal;

      System.out.println("Factura");
      System.out.println("--------------------------");
      System.out.printf("%-10s %-10s  \n", "Artículo     ", linea3);
      System.out.printf("%-10s %-8.2f \n", "Precio       ", precio);
      System.out.printf("%-10s %-6d   \n", "Cantidad     ", cantidad);
      System.out.printf("%-10s %-8.2f \n", "Total        ", precioTotal);
      System.out.printf("%-10s %-8.2f \n", "IVA al 4%    ", iva);
      System.out.println("--------------------------");
      System.out.printf("%-10s %-8.2f \n", "Total con IVA", precioFinal);
    } else if ((producto == 1) && (alimento == 3)) {
      double precioTotal = precio * cantidad;
      double precioFinal = precioTotal * 1.04;
      double iva = precioFinal - precioTotal;

      System.out.println("Factura");
      System.out.println("--------------------------");
      System.out.printf("%-10s %-10s  \n", "Artículo     ", linea3);
      System.out.printf("%-10s %-8.2f \n", "Precio       ", precio);
      System.out.printf("%-10s %-6d   \n", "Cantidad     ", cantidad);
      System.out.printf("%-10s %-8.2f \n", "Total        ", precioTotal);
      System.out.printf("%-10s %-8.2f \n", "IVA al 4%    ", iva);
      System.out.println("--------------------------");
      System.out.printf("%-10s %-8.2f \n", "Total con IVA", precioFinal);
    } else if ((producto == 1) && (alimento == 4)) {
      double precioTotal = precio * cantidad;
      double precioFinal = precioTotal * 1.04;
      double iva = precioFinal - precioTotal;

      System.out.println("Factura");
      System.out.println("--------------------------");
      System.out.printf("%-10s %-10s  \n", "Artículo     ", linea3);
      System.out.printf("%-10s %-8.2f \n", "Precio       ", precio);
      System.out.printf("%-10s %-6d   \n", "Cantidad     ", cantidad);
      System.out.printf("%-10s %-8.2f \n", "Total        ", precioTotal);
      System.out.printf("%-10s %-8.2f \n", "IVA al 4%    ", iva);
      System.out.println("--------------------------");
      System.out.printf("%-10s %-8.2f \n", "Total con IVA", precioFinal);
    } else if ((producto == 1) && (alimento == 5)) {
      double precioTotal = precio * cantidad;
      double precioFinal = precioTotal * 1.04;
      double iva = precioFinal - precioTotal;

      System.out.println("Factura");
      System.out.println("--------------------------");
      System.out.printf("%-10s %-10s  \n", "Artículo     ", linea3);
      System.out.printf("%-10s %-8.2f \n", "Precio       ", precio);
      System.out.printf("%-10s %-6d   \n", "Cantidad     ", cantidad);
      System.out.printf("%-10s %-8.2f \n", "Total        ", precioTotal);
      System.out.printf("%-10s %-8.2f \n", "IVA al 4%    ", iva);
      System.out.println("--------------------------");
      System.out.printf("%-10s %-8.2f \n", "Total con IVA", precioFinal);
    } else if ((producto == 1) && (alimento == 6)) {
      double precioTotal = precio * cantidad;
      double precioFinal = precioTotal * 1.10;
      double iva = precioFinal - precioTotal;

      System.out.println("Factura");
      System.out.println("--------------------------");
      System.out.printf("%-10s %-10s  \n", "Artículo     ", linea3);
      System.out.printf("%-10s %-8.2f \n", "Precio       ", precio);
      System.out.printf("%-10s %-6d   \n", "Cantidad     ", cantidad);
      System.out.printf("%-10s %-8.2f \n", "Total        ", precioTotal);
      System.out.printf("%-10s %-8.2f \n", "IVA al 10%   ", iva);
      System.out.println("--------------------------");
      System.out.printf("%-10s %-8.2f \n", "Total con IVA", precioFinal);
    } else if ((producto == 2)) {
      double precioTotal = precio * cantidad;
      double descuento = precioTotal * 0.20;
      double descuentoAplicado = precioTotal - descuento;
      double precioFinal = descuentoAplicado * 1.21;
      double iva = precioFinal - descuentoAplicado;

      System.out.println("Factura");
      System.out.println("--------------------------");
      System.out.printf("%-10s %-10s  \n", "Artículo            ", linea3);
      System.out.printf("%-10s %-8.2f \n", "Precio              ", precio);
      System.out.printf("%-10s %-6d   \n", "Cantidad            ", cantidad);
      System.out.printf("%-10s %-8.2f \n", "Total               ", precioTotal);
      System.out.printf("%-10s %-8.2f \n", "Descuento (20%)     ", descuento);
      System.out.printf(
        "%-10s %-8.2f \n",
        "Total con descuento ",
        descuentoAplicado
      );
      System.out.printf("%-10s %-8.2f \n", "IVA al 21%          ", iva);
      System.out.println("--------------------------");
      System.out.printf("%-10s %-8.2f \n", "Total con IVA       ", precioFinal);
    } else if (producto == 3) {
      double precioTotal = precio * cantidad;
      double precioFinal = precioTotal * 1.04;
      double iva = precioFinal - precioTotal;

      System.out.println("Factura");
      System.out.println("--------------------------");
      System.out.printf("%-10s %-10s  \n", "Artículo     ", linea3);
      System.out.printf("%-10s %-8.2f \n", "Precio       ", precio);
      System.out.printf("%-10s %-6d   \n", "Cantidad     ", cantidad);
      System.out.printf("%-10s %-8.2f \n", "Total        ", precioTotal);
      System.out.printf("%-10s %-8.2f \n", "IVA al 4%    ", iva);
      System.out.println("--------------------------");
      System.out.printf("%-10s %-8.2f \n", "Total con IVA", precioFinal);
    } else if (producto == 4) {
      double precioTotal = precio * cantidad;
      double precioFinal = precioTotal * 1.21;
      double iva = precioFinal - precioTotal;
      int oferta = cantidad - (cantidad / 3);
      double precioOferta = precio * oferta;
      double descuento = precioTotal - precioOferta;

      System.out.println("Factura");
      System.out.println("--------------------------");
      System.out.printf("%-10s %-10s  \n", "Artículo             ", linea3);
      System.out.printf("%-10s %-8.2f \n", "Precio               ", precio);
      System.out.printf("%-10s %-6d   \n", "Cantidad             ", cantidad);
      System.out.printf(
        "%-10s %-8.2f \n",
        "Total                ",
        precioTotal
      );
      System.out.printf("%-10s %-8.2f \n", "Descuento (3x2)      ", descuento);
      System.out.printf(
        "%-10s %-8.2f \n",
        "Total con descuento  ",
        precioOferta
      );
      System.out.printf("%-10s %-8.2f \n", "IVA al 21%           ", iva);
      System.out.println("--------------------------");
      System.out.printf(
        "%-10s %-8.2f \n",
        "Total con IVA        ",
        precioFinal
      );
    } else {
      System.out.println("Error, el número introducido no es válido.");
    }
    s.close();
  }
}
