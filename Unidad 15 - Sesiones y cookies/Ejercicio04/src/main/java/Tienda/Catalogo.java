package Tienda;

import java.util.ArrayList;

/**
 * Clase que representa el catálogo de productos de una tienda.
 */
public class Catalogo {

  // Lista privada de productos en el catálogo
  private ArrayList<Producto> listaProductos;

  /**
   * Constructor de la clase Catalogo.
   * Inicializa la lista de productos y agrega productos predeterminados.
   */
  public Catalogo() {
    this.listaProductos = new ArrayList<>();
    inicializarCatalogo();
  }

  /**
   * Inicializa el catálogo con una lista de productos predeterminados.
   */
  private void inicializarCatalogo() {
    listaProductos.clear();
    listaProductos.add(new Producto(1, "Producto 1", 12.0, "Producto 1.jpg"));
    listaProductos.add(new Producto(2, "Producto 2", 15.0, "Producto 2.jpg"));
    listaProductos.add(new Producto(3, "Producto 3", 55.0, "Producto 3.jpg"));
    listaProductos.add(new Producto(4, "Producto 4", 65.0, "Producto 4.jpg"));
    listaProductos.add(new Producto(5, "Producto 5", 30.0, "Producto 5.jpg"));
    listaProductos.add(new Producto(6, "Producto 6", 25.0, "Producto 6.webp"));
  }

  /**
   * Obtiene la lista de productos del catálogo.
   *
   * @return La lista de productos en el catálogo
   */
  public ArrayList<Producto> getListaProductos() {
    return listaProductos;
  }

  /**
   * Obtiene un producto por su código.
   *
   * @param codigo El código del producto a buscar
   * @return El producto con el código dado, o null si no se encuentra
   */
  public Producto getProductoPorCodigo(int codigo) {
    for (Producto producto : listaProductos) {
      if (producto.getCodigo() == codigo) {
        return producto;
      }
    }
    return null;
  }

}
