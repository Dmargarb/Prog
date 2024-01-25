package funciones.alea;

public class aleatorio {
    public static int numeroAleatorio(int max, int min) {
        return (int)(Math.random() * ((max - min) +1) + min);
    }
}
