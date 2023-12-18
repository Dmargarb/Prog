public class aleatoriosParImparPrimo {

  public static boolean esPrimoFuncion(int x) {
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) throws Exception {
    int max = 100;
    int min = 1;
    int esPar = 0;
    int esImpar = 0;
    int esPrimo = 0;
    boolean completado = false;
    System.out.println();

    do {
      int numeroAleatorio = (int) (Math.random() * ((max - min) + 1) + min);

      if (esPrimoFuncion(numeroAleatorio)) {
        esPrimo++;
      }

      if ((numeroAleatorio % 2 == 0) && (esPar < 50)) {
        esPar++;
        System.out.print(numeroAleatorio + " ");
      } else if (esImpar < 50) {
        esImpar++;
        System.out.print(numeroAleatorio + " ");
      } else if ((esPar == 50) && (esImpar == 50)) {
        completado = true;
      }
    } while (!completado);
    System.out.println();
    System.out.print("\nSe han generado " + esPar + " números pares y ");
    System.out.println(esImpar + " números impares.");
    System.out.println("En total hay " + esPrimo + " números primos.");
  }
}
