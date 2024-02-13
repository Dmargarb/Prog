public class PruebaTiempo {
  public static void main(String[] args) {
    TiempoEX t1 = new TiempoEX(1, 20, 30);
    TiempoEX t2 = new TiempoEX(0, 30, 40);
    TiempoEX t3 = new TiempoEX(0, 35, 20);
        
    System.out.println(t1 + " + " + t2 + " = " + t1.suma(t2));
    System.out.println(t2 + " - " + t3 + " = " + t2.resta(t3));
  }
}
