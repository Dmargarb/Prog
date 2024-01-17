
public class arrayInverso {

  public static void main(String[] args) {
    int[] numeros = new int[10];
    int i = 0;

    System.out.println("Introduce 10 números enteros.");

    do {
      System.out.print("Introduce el número " + (i+1) + ": ");
      numeros[i] = Integer.parseInt(System.console().readLine());
      i++;
    } while (!(i == 10));

    System.out.println("\nLos números en orden inverso son: ");

    for (i = 9; i >= 0; i--) {
      System.out.print(numeros[i] + " ");
    }
  }
}
