public class aleatoriosParImparMedia {

  public static void main(String[] args) throws Exception {
    int max = 200;
    int min = -100;
    int maximoPar = -100;
    int minimoImpar = 200;
    int numerosTotales = 0;
    int suma = 0;

    do {
      int numeroAleatorio = (int) (Math.random() * ((max - min) + 1) + min);
      System.out.print(numeroAleatorio + " ");
      numerosTotales++;
      suma += numeroAleatorio;

      if (numeroAleatorio % 2 == 0) {
        if (numeroAleatorio > maximoPar) {
          maximoPar = numeroAleatorio;
        }
      } else if (numeroAleatorio < minimoImpar) {
        minimoImpar = numeroAleatorio;
      }
    } while (!(numerosTotales == 50));

    int media = suma / numerosTotales;
    System.out.println();
    System.out.println("\nMáximo de los pares: " + maximoPar);
    System.out.println("Mínimo de los impares: " + minimoImpar);
    System.out.println("Media: " + media);
  }
}
