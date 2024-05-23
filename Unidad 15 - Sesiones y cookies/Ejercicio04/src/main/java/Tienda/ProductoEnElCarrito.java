package Tienda;

/**
 * Clase que representa un producto en el carrito de compras.
 */
public class ProductoEnElCarrito {

  // Atributos privados de la clase ProductoEnElCarrito
  private Producto producto; // El producto agregado al carrito
  private int cantidad;      // La cantidad de este producto en el carrito

  /**
   * Constructor de la clase ProductoEnElCarrito.
   *
   * @param producto El producto que se agrega al carrito
   * @param cantidad La cantidad de este producto en el carrito
   */
  public ProductoEnElCarrito(Producto producto, int cantidad) {
    this.producto = producto;
    this.cantidad = cantidad;
  }

  /**
   * Obtiene el producto del carrito.
   *
   * @return El producto en el carrito
   */
  public Producto getProducto() {
    return producto;
  }

  /**
   * Obtiene la cantidad del producto en el carrito.
   *
   * @return La cantidad del producto en el carrito
   */
  public int getCantidad() {
    return cantidad;
  }

  /**
   * Incrementa la cantidad del producto en el carrito.
   *
   * @param cantidad La cantidad a incrementar
   */
  public void incrementaCantidad(int cantidad) {
    this.cantidad += cantidad;
  }

}
