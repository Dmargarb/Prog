public class arrayAleatorioPar {

  public static void main(String[] args) throws Exception {
    int[] numeros = new int[20];
    int[] par = new int[20];
    int[] impar = new int[20];
    int i;
    int pares = 0;
    int impares = 0;

    for (i = 0; i < 20; i++) {
      numeros[i] = (int) (Math.random() * 101);
      // Separa los números metiendo los pares en un array
      // y los impares en otro.
      if (numeros[i] % 2 == 0) {
        par[pares++] = numeros[i];
      } else {
        impar[impares++] = numeros[i];
      }
    }

    // Muestra el array original
    System.out.println("Array original:");
    for (i = 0; i < 20; i++) {
      System.out.print(numeros[i] + " ");
    }
    System.out.println();
    System.out.println();

    // Mete los pares en las primeras posiciones
    // del array original.
    for (i = 0; i < pares; i++) {
      numeros[i] = par[i];
    }

    // Mete los impares en los huecos que quedan.
    for (i = pares; i < 20; i++) {
      numeros[i] = impar[i - pares];
    }

    // Muestra el resultado.
    System.out.println("Array con los pares al principio:");
    for (i = 0; i < 20; i++) {
      System.out.print(numeros[i] + " ");
    }
  }
}
