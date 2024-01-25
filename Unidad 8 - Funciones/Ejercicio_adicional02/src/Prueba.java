import funciones.array2D.bidimencional;

public class Prueba {
    public static void main(String[] args) throws Exception {
        int max = 6;
        int min = 1;
        int filas = 10;
        int columnas = 10;

        int[][] arrayBi = bidimencional.generaArrayBiInt(filas, columnas, min, max);

        for(int i = 0; i < filas; i++) {
            for(int j = 0; j < columnas; j++) {
              System.out.print(arrayBi[i][j]+" ");
            }
            System.out.println("");
          }
    }
}
