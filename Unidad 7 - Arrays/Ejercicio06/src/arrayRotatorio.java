public class arrayRotatorio {

  public static void main(String[] args) {
    int[] numeros = new int[15];
    int i = 0;

    System.out.println("Introduce 15 números.\n");

    do {
      System.out.print("Introduce el número " + (i+1) + ": ");
      numeros[i] = Integer.parseInt(System.console().readLine());
      i++;
    } while (!(i == 15));

    System.out.println("\nArray Original: ");

    for (i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i] + " ");
    }
    System.out.println();

    System.out.println("\nArray Rotado: ");

    int temporal = numeros[14];
    for (i = 14; i > 0; i--) {
      numeros[i] = numeros[i - 1];
    }
    numeros[0] = temporal;

    for (i = 0; i < 15; i++) {
      System.out.print(numeros[i] + " ");
    }
    System.out.println();
  }
}
