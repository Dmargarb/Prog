public class generarPares {

  public static void main(String[] args) throws Exception {
    int numerosTotales = 0;
    int numeroAleatorio = 0;

    do {
      numeroAleatorio = (int) (Math.random() * 51) * 2;
      System.out.print(numeroAleatorio + " ");
      numerosTotales++;
    } while (!(numeroAleatorio == 24));
    System.out.println("\nSe han generado " + numerosTotales + " números.");
  }
}
