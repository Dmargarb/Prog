package Tienda;

import java.util.ArrayList;

/**
 * Clase que representa el carrito de compras.
 */
public class Carrito {

  // Lista privada de productos en el carrito
  private ArrayList<ProductoEnElCarrito> listaProductosCarrito;

  /**
   * Constructor de la clase Carrito.
   * Inicializa la lista de productos en el carrito.
   */
  public Carrito() {
    this.listaProductosCarrito = new ArrayList<>();
  }

  /**
   * Obtiene la lista de productos en el carrito.
   *
   * @return La lista de productos en el carrito
   */
  public ArrayList<ProductoEnElCarrito> getListaProductosCarrito() {
    return listaProductosCarrito;
  }

  /**
   * Verifica si un producto existe en el carrito por su código.
   *
   * @param codigo El código del producto a buscar
   * @return true si el producto existe en el carrito, false en caso contrario
   */
  public boolean existeProducto(int codigo) {
    for (ProductoEnElCarrito productoEnElCarrito : listaProductosCarrito) {
      if (productoEnElCarrito.getProducto().getCodigo() == codigo) {
        return true;
      }
    }
    return false;
  }

  /**
   * Agrega un producto al carrito.
   * Si el producto ya existe en el carrito, incrementa su cantidad.
   * Si no, lo agrega como un nuevo producto en el carrito.
   *
   * @param producto El producto a agregar al carrito
   */
  public void agregarProducto(Producto producto) {
    if (existeProducto(producto.getCodigo())) {
      for (ProductoEnElCarrito productoEnElCarrito : listaProductosCarrito) {
        if (productoEnElCarrito.getProducto().getCodigo() == producto.getCodigo()) {
          productoEnElCarrito.incrementaCantidad(1);
        }
      }
    } else {
      listaProductosCarrito.add(new ProductoEnElCarrito(producto, 1));
    }
  }

  /**
   * Elimina un producto del carrito por su código.
   * Si la cantidad del producto es mayor a uno, decrementa la cantidad.
   * Si la cantidad es uno, elimina el producto del carrito.
   *
   * @param codigo El código del producto a eliminar
   */
  public void eliminarProducto(int codigo) {
    for (int i = 0; i < listaProductosCarrito.size(); i++) {
      ProductoEnElCarrito productoEnElCarrito = listaProductosCarrito.get(i);
      if (productoEnElCarrito.getProducto().getCodigo() == codigo) {
        if (productoEnElCarrito.getCantidad() > 1) {
          productoEnElCarrito.incrementaCantidad(-1);
        } else {
          listaProductosCarrito.remove(i);
        }
      }
    }
  }

  /**
   * Obtiene el total de artículos en el carrito.
   *
   * @return El total de artículos en el carrito
   */
  public int getTotalArticulos() {
    int total = 0;
    for (ProductoEnElCarrito productoEnElCarrito : listaProductosCarrito) {
      total += productoEnElCarrito.getCantidad();
    }
    return total;
  }

  /**
   * Obtiene el precio total de los productos en el carrito.
   *
   * @return El precio total de los productos en el carrito
   */
  public double getTotalPrecio() {
    double total = 0;
    for (ProductoEnElCarrito productoEnElCarrito : listaProductosCarrito) {
      total += productoEnElCarrito.getCantidad() * productoEnElCarrito.getProducto().getPrecio();
    }
    return total;
  }

  /**
   * Vacía el carrito, eliminando todos los productos.
   */
  public void vaciarCarrito() {
    listaProductosCarrito.clear();
  }
}
