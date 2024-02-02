public class Juego {

  public Pegi pegi;
  public String titulo;
  double precio;
  static int stock = 50;

  public Juego(Pegi pegi, String titulo, double precio) {
    this.pegi = pegi;
    this.titulo = titulo;
    this.precio = precio;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio){
    this.precio = precio;
  }

  public static int getStock() {
    return stock;
  }

  public static void venderJuego(int cantidad){
    stock = stock - cantidad;
  }

  public String toString() {
    return titulo+" pegi: "+pegi+" precio: "+precio;
  }
}
