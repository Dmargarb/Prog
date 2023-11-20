public class numerosPrimos {

  public static void main(String[] args) throws Exception {
    boolean esPrimo = true;
    System.out.println("El programa mostrará los número primos entre 2 y 100.");

    for (int i = 2; i <= 100; i++) {
      esPrimo = true;
      for (int x = 2; x < i; x++) {
        if (i % x == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }
}
