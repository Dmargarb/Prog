public class numero50 {

  public static void main(String[] args) throws Exception {
    int numeroMaximo = 100;
    int numeroMinimo = 199;
    int numero;
    int suma = 0;

    System.out.println("50 números enteros aleatorios entre 100 y 199 (ambos incluidos):");
    System.out.println();

    for (int i = 1; i <= 50; i++) {
      numero = (int) (Math.random() * 100) + 100;
      
      if (i == 50) {
        System.out.print(numero + ".");
      } else {
        System.out.print(numero + ", ");
      }

      if (numero > numeroMaximo) {
        numeroMaximo = numero;
      }

      if (numero < numeroMinimo) {
        numeroMinimo = numero;
      }
      
      suma += numero;
    }
    System.out.println();
    System.out.println("\nNúmero máximo: "+numeroMaximo+", número mínimo: "+numeroMinimo+", media de los números: "+suma/50+".");
  }
}
