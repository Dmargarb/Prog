public class caracteresAleatorios {

  public static void main(String[] args) throws Exception {

    for (int i = 1; i < 11; i++) {
      int numeroCaracter = (int) (Math.random() * 6) + 1;
      int longitud = (int) (Math.random() * 40) + 1;
      String caracter = "";

      switch (numeroCaracter) {
        case 1:
          caracter = "*";
          break;
        case 2:
          caracter = "-";
          break;
        case 3:
          caracter = "=";
          break;
        case 4:
          caracter = ".";
          break;
        case 5:
          caracter = "|";
          break;
        case 6:
          caracter = "@";
          break;
      }

      for (int j = 1; j <= longitud; j++) {
        System.out.print(caracter);
      }
      System.out.println("");
    }
  }
}
