package clases;

import java.util.ArrayList;

public class Carrito {

  private ArrayList<ElementoDeCarrito> elementos = new ArrayList<ElementoDeCarrito>();

  public Carrito() {
  }

  public Carrito(ArrayList<ElementoDeCarrito> elementos) {
    this.elementos = elementos;
  }

  /**
   * Constructor que deserializa un carrito desde un String.
   *
   * @param carritoSerializado String que representa el carrito.
   */
  public Carrito(String carritoSerializado) {

    if (!carritoSerializado.equals("")) {
      String[] datosSerializados = carritoSerializado.split("<");

      for (String productoSerializado : datosSerializados) {

        String[] datosProducto = productoSerializado.split(">");

        int codigo = Integer.parseInt(datosProducto[0]);
        String nombre = datosProducto[1];
        double precio = Double.parseDouble(datosProducto[2]);
        String imagen = datosProducto[3];
        int cantidad = Integer.parseInt(datosProducto[4]);

        Producto producto = new Producto(codigo, nombre, precio, imagen);
        ElementoDeCarrito elemento = new ElementoDeCarrito(producto, cantidad);

        this.elementos.add(elemento);
      }
    }

  }

  public ArrayList<ElementoDeCarrito> getElementos() {
    return elementos;
  }

  public boolean existeElementoConCodigo(int codigo) {
    return this.posicionElementoConCodigo(codigo) != -1;
  }

  public void meteProductoConCodigo(int codigo) {
    if (this.existeElementoConCodigo(codigo)) {
      elementos.get(posicionElementoConCodigo(codigo)).incrementaCantidad(1);
    } else {
      Catalogo catalogo = new Catalogo();
      catalogo.cargaDatos();
      elementos.add(new ElementoDeCarrito(catalogo.productoConCodigo(codigo), 1));
    }
  }

  public void eliminaProductoConCodigo(int codigo) {
    if (existeElementoConCodigo(codigo)) {
      int i = 0;
      int posicion = 0;
      for (ElementoDeCarrito elemento : elementos) {
        if (elemento.getProducto().getCodigo() == codigo) {
          posicion = i;
        }
        i++;
      }
      elementos.remove(posicion);
    }
  }

  private int posicionElementoConCodigo(int codigo) {
    int i = 0;
    for (ElementoDeCarrito elemento : elementos) {
      if (elemento.getProducto().getCodigo() == codigo) {
        return i;
      }
      i++;
    }
    return -1;
  }

  /**
   * Serializa el carrito a un String.
   *
   * @return String que representa el carrito.
   */
  @Override
  public String toString() {
    String carritoSerializado = "";

    for (ElementoDeCarrito e : elementos) {
      carritoSerializado += e.getProducto().getCodigo() + ">"
              + e.getProducto().getNombre() + ">"
              + e.getProducto().getPrecio() + ">"
              + e.getProducto().getImagen() + ">"
              + e.getCantidad() + "<";
    }
    return carritoSerializado;
  }

}
