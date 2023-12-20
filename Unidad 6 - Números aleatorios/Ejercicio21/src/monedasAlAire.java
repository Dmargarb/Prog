public class monedasAlAire {

  public static void main(String[] args) {
    int moneda1 = 0;
    int moneda2 = 0;
    int moneda3 = 0;
    int moneda4 = 0;
    int moneda5 = 0;

    do {
      moneda1 = (int) (Math.random() * 8);
      moneda2 = (int) (Math.random() * 8);
      moneda3 = (int) (Math.random() * 8);
      moneda4 = (int) (Math.random() * 8);
      moneda5 = (int) (Math.random() * 8);
    } while (
      (moneda1 == moneda2) ||
      (moneda1 == moneda3) ||
      (moneda1 == moneda4) ||
      (moneda1 == moneda5) ||
      (moneda2 == moneda3) ||
      (moneda2 == moneda4) ||
      (moneda2 == moneda5) ||
      (moneda3 == moneda4) ||
      (moneda3 == moneda5) ||
      (moneda4 == moneda5)
    );

    for (int i = 0; i < 5; i++) {
      int m = 0;
      String moneda = "";
      String posicion = "";

      switch (i) {
        case 0:
          m = moneda1;
          break;
        case 1:
          m = moneda2;
          break;
        case 2:
          m = moneda3;
          break;
        case 3:
          m = moneda4;
          break;
        case 4:
          m = moneda5;
          break;
        default:
      }

      switch (m) {
        case 0:
          moneda = "1 céntimo";
          break;
        case 1:
          moneda = "2 céntimos";
          break;
        case 2:
          moneda = "5 céntimos";
          break;
        case 3:
          moneda = "10 céntimos";
          break;
        case 4:
          moneda = "20 céntimos";
          break;
        case 5:
          moneda = "50 céntimos";
          break;
        case 6:
          moneda = "1 euro";
          break;
        case 7:
          moneda = "2 euros";
          break;
        default:
      }

      switch ((int) (Math.random() * 2)) {
        case 0:
          posicion = "cara";
          break;
        case 1:
          posicion = "cruz";
          break;
        default:
      }
      System.out.printf("\n%-12s - %5s\n", moneda, posicion);
    }
  }
}
