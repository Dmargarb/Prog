public class notasAleatorias {

  public static void main(String[] args) throws Exception {
    int sus = 0;
    int suf = 0;
    int bi = 0;
    int not = 0;
    int sob = 0;

    for (int i = 1; i <= 20; i++) {
      int notaAleatoria = (int) (Math.random() * 5);
      String nota = "";

      switch (notaAleatoria) {
        case 0:
          nota = "Suspenso";
          sus++;
          break;
        case 1:
          nota = "Suficiente";
          suf++;
          break;
        case 2:
          nota = "Bien";
          bi++;
          break;
        case 3:
          nota = "Notable";
          not++;
          break;
        case 4:
          nota = "Sobresaliente";
          sob++;
          break;
        default:
      }
      System.out.println("Nota " + i + ": " + nota + ".");
    }
    System.out.println("-----------------------");
    System.out.println("Hay: " +sus+" suspensos.");
    System.out.println("Hay: " +suf+" suficientes.");
    System.out.println("Hay: " +bi+" bienes.");
    System.out.println("Hay: " +not+" notables.");
    System.out.println("Hay: " +sob+" sobresalientes.");
  }
}
