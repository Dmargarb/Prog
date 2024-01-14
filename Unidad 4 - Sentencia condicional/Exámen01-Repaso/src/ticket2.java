import java.util.Scanner;

/**
 * Ticket de compra
 *
 *
 * @author David Martín García
 */
public class ticket2 {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    boolean datoCorrecto = false; // Variable que controla los datos correctos.

    System.out.println("Introduzca el tipo de producto:"); // Menú del tipo de producto.
    System.out.println("1. Alimentación");
    System.out.println("2. Electrónica");
    System.out.println("3. Farmacia");
    System.out.println("4. Moda");
    System.out.print("Opción:");
    int producto = s.nextInt(); // Variable que controla el tipo de producto.

    if (producto == 2 || producto == 3 || producto == 4) {
      datoCorrecto = true; // Si el producto es 2 o 3 o 4 se activa la variable.
    }

    int alimento = 0; // Variable que controla el tipo de alimento.

    if (producto == 1) { // Si el producto es 1, muestra el segundo menú.
      System.out.println("Introduzca el tipo de alimento:");
      System.out.println("1. Huevos");
      System.out.println("2. Leche");
      System.out.println("3. Pan");
      System.out.println("4. Fruta");
      System.out.println("5. Verdura");
      System.out.println("6. Otros");
      System.out.print("Opción:");
      alimento = s.nextInt(); // Variable del tipo de alimento.

      if (
        alimento == 1 ||
        alimento == 2 ||
        alimento == 3 ||
        alimento == 4 ||
        alimento == 5 ||
        alimento == 6
      ) {
        datoCorrecto = true; // Si el alimento es del rango 1-6 se activa la variable.
      }
    }

    if (datoCorrecto) { // Si los datos están correctos, se ejecuta el resto del programa.
      System.out.print("Introduzca el nombre del producto:");
      String nombre = System.console().readLine(); // Variable del nombre del producto.
      System.out.print("Introduzca la cantidad de productos:");
      int cantidad = s.nextInt(); // Variable de la cantidad.
      System.out.print("Introduzca el precio por unidad del producto:");
      double precio = s.nextDouble(); // Variable del precio.

      double precioSinIVA = precio * cantidad; // Variable del precio total sin el IVA.
      double iva; // Variable del IVA.
      double descuento; // Variable del descuento.
      double precioConDescuento; // Variable del precio con el descuento.
      int cantidadConOferta; // Variable de la cantidad de productos con la oferta 3X2.
      double precioConIVA = 0; // Variable del precio final con el IVA.

      System.out.println("\nFactura"); // Factura.
      System.out.println("__________________________________");
      System.out.printf("Artículo %25s\n", nombre); // Nombre.
      System.out.printf("Precio %18.2f €/unidad\n", precio); // Precio.
      System.out.printf("Cantidad %25d\n", cantidad); // Cantidad.
      System.out.printf("Total %27.2f€\n", precioSinIVA); // Precio sin IVA.

      switch (producto) { // Según el tipo de producto.
        case 1:
          switch (alimento) { // Según el tipo de alimento.
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
              iva = precioSinIVA * 0.04; // IVA al 4%.
              precioConIVA = precioSinIVA + iva; // Precio con IVA.
              System.out.print("IVA al 4% ");
              System.out.printf("%23.2f€\n", iva); // IVA.
              break;
            case 6:
              iva = precioSinIVA * 0.1; // IVA al 10%.
              precioConIVA = precioSinIVA + iva; // Precio con IVA.
              System.out.print("IVA al 10% ");
              System.out.printf("%22.2f€\n", iva); // IVA.
              break;
            default:
          }
          break;
        case 2:
          descuento = precioSinIVA * 0.2; // 20% de descuento.
          precioConDescuento = precioSinIVA - descuento; // Precio con descuento.
          iva = precioConDescuento * 0.21; // IVA al 21%.
          precioConIVA = precioConDescuento + iva; // Precio con IVA.
          System.out.print("Descuento (20%) ");
          System.out.printf("%17.2f€\n", -descuento); // Descuento.
          System.out.printf(
            "Total con descuento %13.2f€\n",
            precioConDescuento
          ); // Precio con descuento.
          System.out.print("IVA al 21% ");
          System.out.printf("%22.2f€\n", iva); // IVA.
          break;
        case 3:
          iva = precioSinIVA * 0.04; // IVA al 4%.
          precioConIVA = precioSinIVA + iva; // Precio con IVA.
          System.out.print("IVA al 4% ");
          System.out.printf("%23.2f€\n", iva); // IVA.
          break;
        case 4:
          cantidadConOferta = (cantidad - cantidad / 3); // oferta de 3x2.
          precioConDescuento = precio * cantidadConOferta; // Precio con la oferta.
          descuento = precioSinIVA - precioConDescuento; // descuento.
          iva = precioConDescuento * 0.21; // IVA al 21%.
          precioConIVA = precioConDescuento + iva; // Precio con IVA.
          System.out.print("Descuento (3x2) ");
          System.out.printf("%17.2f€\n", -descuento); // Descuento.
          System.out.printf(
            "Total con descuento %13.2f€\n",
            precioConDescuento
          ); // Precio con descuento.
          System.out.print("IVA al 21% ");
          System.out.printf("%22.2f€\n", iva); // IVA.
          break;
        default:
      }
      System.out.println("__________________________________");
      System.out.printf("Total con IVA %19.2f€\n", precioConIVA); // Precio final.
    } else { // Si los datos introducidos no son correctos.
      System.out.println("Error, la opción introducida no es válida.");
    }
    s.close();
  }
}
