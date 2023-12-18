public class pinturaAleatoria {

  public static void main(String[] args) {
    int pintura1 = 0;
    int pintura2 = 0;
    int pintura3 = 0;

    String color1 = "";
    String color2 = "";
    String color3 = "";

    do {
      pintura1 = (int) (Math.random() * 6);
      pintura2 = (int) (Math.random() * 6);
      pintura3 = (int) (Math.random() * 6);
    } while (
      (pintura1 == pintura2) || (pintura1 == pintura3) || (pintura2 == pintura3)
    );

    for (int i = 0; i < 3; i++) {
      String color = "";
      int c = 0;

      switch (i) {
        case 0:
          c =  pintura1;
          break;
        case 1:
          c = pintura2;
          break;
        case 2:
          c = pintura3;
          break;
        default:
      }

      switch (c) {
        case 0:
          color = "rojo";
          break;
        case 1:
          color = "azul";
          break;
        case 2:
          color = "verde";
          break;
        case 3:
          color = "amarillo";
          break;
        case 4:
          color = "violeta";
          break;
        case 5:
          color = "naranja";
          break;
        default:
      }

      switch (i) {
        case 0:
          color1 = color;
          break;
        case 1:
          color2 = color;
          break;
        case 2:
          color3 = color;
          break;
        default:
      }
    }
    System.out.print(color1 + ", " + color2 + " y " + color3+".");
  }
}
