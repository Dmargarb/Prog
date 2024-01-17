public class arrayMaximoMinimo {

  public static void main(String[] args) {
    int[] numeros = new int[10];
    int i = 0;
    int numeroMaximo = 0;
    int numeroMinimo = 0;

    System.out.println("Introduce 10 números.\n");

    do {
      System.out.print("Introduce el número " + (i+1) + ": ");
      numeros[i] = Integer.parseInt(System.console().readLine());

      if (i == 0) {
        numeroMaximo = numeros[i];
        numeroMinimo = numeros[i];
      }

      if (numeros[i] > numeroMaximo) {
        numeroMaximo = numeros[i];
      }

      if (numeros[i] < numeroMinimo) {
        numeroMinimo = numeros[i];
      }

      i++;
    } while (!(i == 10));

    System.out.println("\nLos números introducidos son: ");

    for (i = 0; i < 10; i++) {
      System.out.print(numeros[i] + " ");
    }
    System.out.println();
    System.out.println("\nEl número más grande es: "+numeroMaximo);
    System.out.println("El número más pequeño es: "+numeroMinimo+"\n");
  }
}
