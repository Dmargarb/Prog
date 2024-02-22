import java.util.ArrayList;

public class Eurocoin {

  public static void main(String[] args) {
    ArrayList<Moneda> m = new ArrayList<Moneda>();
    
    Moneda monedaAux = new Moneda();
    m.add(monedaAux);
    
    String ultimaPosicion = monedaAux.getPosicion();
    String ultimaCantidad = monedaAux.getCantidad();
    
    for (int i = 0; i < 5; i++) {
      do {
        monedaAux = new Moneda();
      } while (!((monedaAux.getPosicion()).equals(ultimaPosicion)) && !((monedaAux.getCantidad()).equals(ultimaCantidad)));
      
      m.add(monedaAux);
      ultimaPosicion = monedaAux.getPosicion();
      ultimaCantidad = monedaAux.getCantidad();
    }
    
    for (Moneda mo : m) {
      System.out.println(mo);
    }
  }
}
