import arrays1d.Filtros;
import arrays2d.Elementos;
import números.Cifras;

public class Examen {

  public static void main(String[] args) throws Exception {
    long numero = 123456789;
    int[] array = { 12, 5, 39, 18, 209, 88, 9, 9999, 74, 1 };
    int cifraBuscada = 9;
    int[] resultado = Filtros.filtraConCifra(array, cifraBuscada);
    int[][] array2D = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int numeroAleatorio = Elementos.aleatorioDeArray2D(array2D);

    System.out.println("\n" + Cifras.contieneCifra(numero, cifraBuscada));
    System.out.println("\nNúmero aleatorio del Array2B: " + numeroAleatorio);

    System.out.print("\nResultado: {");
    for (int i = 0; i < resultado.length; i++) {
      System.out.print(resultado[i]);
      if (i < resultado.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("}");
    System.out.println();
  }
}
