public class tresDados {

  public static void main(String[] args) {
    int suma = 0;

    System.out.println("Tirada de tres dados aleatóriamente:");
    for (int i = 1; i <= 3; i++) {
      int tirada = (int)(Math.random() * ((6 - 1) +1) + 1);
      System.out.print(tirada + " ");
      suma += tirada;
    }

    System.out.println("\nSuma: " + suma);
  }
}
