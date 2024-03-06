import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class EscribirNumerosPrimos {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Luma\\Documents\\Grado\\Entornos de desarrollo\\Prog\\lib\\primos.dat"));

            for (int i = 1; i < 501; i++) {
                if (esPrimo(i)) {
                    bw.write(String.valueOf(i) + "\n");
                }
            }
            bw.close();
            System.out.println("Archivo primos.dat generado con éxito.");

        } catch (IOException ioe) {
            System.out.println("Error de escritura.");
        }
    }

    public static boolean esPrimo(int numero) {

        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }

        for (int i = 2; i < numero / 2; i++) {

            if (numero % i == 0)
                return false;
        }

        return true;
    }
}
