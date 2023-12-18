public class numero50 {

  public static void main(String[] args) throws Exception {
    int max = 199;
    int min = 100;
    int numeroGrande = 100;
    int numeroPequeño = 199;
    int suma = 0;

    System.out.println("50 números enteros aleatorios entre 100 y 199 (ambos incluidos):");
    System.out.println();

    for (int i = 1; i <= 50; i++) {
      int numeroAleatorio = (int)(Math.random() * ((max - min) +1) + min);
      
      if (i == 50) {
        System.out.print(numeroAleatorio + ".");
      } else {
        System.out.print(numeroAleatorio + ", ");
      }

      if (numeroAleatorio > numeroGrande) {
        numeroGrande = numeroAleatorio;
      }

      if (numeroAleatorio < numeroPequeño) {
        numeroPequeño = numeroAleatorio;
      }
      
      suma += numeroAleatorio;
    }
    System.out.println();
    System.out.println("\nNúmero máximo: "+numeroGrande+", número mínimo: "+numeroPequeño+", media de los números: "+suma/50+".");
  }
}
