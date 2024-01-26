import arrays1d.Filtros;
import números.Cifras;
import arrays2d.Elementos;

public class Examen {

  public static void main(String[] args) throws Exception {
    long a = 123456789;
    int b = 4;
    int[] num = new int[10];

    num[0] = 8;
    num[1] = 33;
    num[2] = 200;
    num[3] = 150;
    num[4] = 11;
    num[5] = 88;
    num[6] = 7;
    num[7] = 8;
    num[8] = 9;
    num[9] = 10;

    int[][] array2D = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int numeroAleatorio = Elementos.aleatorioDeArray2D(array2D);
    System.out.println(Cifras.contieneCifra(a, b));
    System.out.print(Filtros.filtraConCifra(num, b) + " ");

    System.out.println("\nNúmero aleatorio: " + numeroAleatorio);
  }
}
