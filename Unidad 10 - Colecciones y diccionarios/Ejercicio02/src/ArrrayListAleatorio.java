import java.util.ArrayList;

public class ArrrayListAleatorio {
    public static void main(String[] args) throws Exception {

        int tamaño = (int)(Math.random() * 11 + 10);
        int suma = 0;
        int max = 0;
        int min = 100;

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        System.out.print("Números aleatorios del ArrayList: ");
        for (int i = 0; i < tamaño; i++) {

            numeros.add((int)(Math.random() * 101));
            suma += numeros.get(i);

            if (i == 0) {
                max = numeros.get(i);
                min = numeros.get(i);
            }

            if (numeros.get(i) > max) {
                max = numeros.get(i);
            }

            if (numeros.get(i) < min) {
                min = numeros.get(i);
            }
          }

          int media = suma / tamaño;

          for (int numero : numeros) {
            System.out.print(numero+" ");
        }
        System.out.println("\nNúmero máximo: "+max);
        System.out.println("Número mínimo: "+min);
        System.out.println("Suma de todos los números: "+suma);
        System.out.println("Media: "+media);
    }
}
