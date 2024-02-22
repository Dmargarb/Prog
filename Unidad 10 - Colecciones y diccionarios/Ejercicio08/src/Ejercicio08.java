import java.util.ArrayList;

public class Ejercicio08 {
  public static void main(String[] args) {
    
    ArrayList<Carta2> c = new ArrayList<Carta2>();
    
    Carta2 cartaAux = new Carta2();
    c.add(cartaAux);
    
    for (int i = 0; i < 9; i++) {
      do {
        cartaAux = new Carta2();      
      } while (c.contains(cartaAux));
      
      c.add(cartaAux);
    }
      
    for (Carta2 miCarta: c) {
      System.out.println(miCarta);
    }
  }
}
