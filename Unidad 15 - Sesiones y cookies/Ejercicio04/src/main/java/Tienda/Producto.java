package Tienda;

/**
 * Clase que representa un producto en una tienda.
 */
public class Producto {

  // Atributos privados de la clase Producto
  private int codigo;    // Código único del producto
  private String nombre; // Nombre del producto
  private double precio; // Precio del producto
  private String imagen; // Ruta o URL de la imagen del producto

  /**
   * Constructor de la clase Producto.
   *
   * @param codigo El código único del producto
   * @param nombre El nombre del producto
   * @param precio El precio del producto
   * @param imagen La ruta o URL de la imagen del producto
   */
  public Producto(int codigo, String nombre, double precio, String imagen) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.precio = precio;
    this.imagen = imagen;
  }

  /**
   * Obtiene el código del producto.
   *
   * @return El código del producto
   */
  public int getCodigo() {
    return codigo;
  }

  /**
   * Obtiene el nombre del producto.
   *
   * @return El nombre del producto
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * Obtiene el precio del producto.
   *
   * @return El precio del producto
   */
  public double getPrecio() {
    return precio;
  }

  /**
   * Obtiene la imagen del producto.
   *
   * @return La ruta o URL de la imagen del producto
   */
  public String getImagen() {
    return imagen;
  }
}
