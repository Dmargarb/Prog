public class arrayParImpar {

  public static void main(String[] args) {
    int[] numeros = new int[8];
    int orden = 1;
    int i = 0;

    System.out.println("Introduce 8 números enteros.");

    do {
      System.out.print("Introduce el número " + orden + ": ");
      numeros[i] = Integer.parseInt(System.console().readLine());
      i++;
      orden++;
    } while (!(orden > 8));

    System.out.println();

    for (i = 0; i < 8; i++) {
      if (numeros[i] % 2 == 0) {
        System.out.println(numeros[i] + " par");
      } else {
        System.out.println(numeros[i] + " impar");
      }
    }
  }
}
