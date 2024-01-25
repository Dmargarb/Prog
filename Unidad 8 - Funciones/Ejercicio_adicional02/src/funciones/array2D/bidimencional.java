package funciones.array2D;
import funciones.alea.aleatorio;

public class bidimencional {
    public static int[][] generaArrayBiInt(int filas, int columnas, int minimo, int maximo) {
        int[][] x = new int[filas][columnas];
    
        for(int i = 0; i < filas; i++) {
          for(int j = 0; j < columnas; j++) {
            x[i][j] = aleatorio.numeroAleatorio(maximo, minimo);
          }
        }
        return x;
      }
}
