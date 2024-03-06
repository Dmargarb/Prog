import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class LeerNumerosPrimos {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Luma\\Documents\\Grado\\Entornos de desarrollo\\Prog\\lib\\primos.dat"));

            String linea = "";
            while (linea != null) {
                System.out.print(linea + " ");
                linea = br.readLine();
            }
            System.out.println();
            br.close();

        } catch (IOException e) {
            System.out.println("Error de lectura.");
        }
    }
}
