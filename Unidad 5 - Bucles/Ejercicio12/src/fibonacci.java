import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int primerNumero = 0;
        int segundoNumero = 1;
        System.out.print("\n¿Cuántos números quieres mostrar de la sucesión de Fibonacci? ");
        int numeroIntroducido = s.nextInt();
        System.out.println(" ");

        for (int i = 1; i <= numeroIntroducido; i++) {
            if (i == numeroIntroducido) {
                System.out.print(primerNumero+".");
              } else {
                System.out.print(primerNumero+", ");
              }
            int resultado = primerNumero + segundoNumero;
            primerNumero = segundoNumero;
            segundoNumero = resultado;
            }
        s.close();
    }
}
