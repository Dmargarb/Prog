import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio12 {
  public static void main(String[] args) {
    
    ArrayList<Carta3> c = new ArrayList<Carta3>();
    HashMap<String, Integer> h = new HashMap<String, Integer>();
    int puntos = 0;
    
    h.put("as", 11);
    h.put("dos", 0);
    h.put("tres", 10);
    h.put("cuatro", 0);
    h.put("cinco", 0);
    h.put("seis", 0);
    h.put("siete", 0);
    h.put("sota", 2);
    h.put("caballo", 3);
    h.put("rey", 4);
      
    Carta3 cartaAux = new Carta3();
    c.add(cartaAux);
    
    for (int i = 0; i < 5; i++) {
      do {
        cartaAux = new Carta3();      
      } while (c.contains(cartaAux));
      
      c.add(cartaAux);
    }
    
    
    for (Carta3 miCarta: c) {
      System.out.println(miCarta);
      puntos += h.get(miCarta.getFigura());
    }
    
    System.out.println("Tienes " + puntos + " puntos.");
  }
}
