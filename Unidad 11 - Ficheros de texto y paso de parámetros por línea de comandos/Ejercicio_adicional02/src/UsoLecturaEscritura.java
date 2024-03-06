import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UsoLecturaEscritura {
    public static void main(String[] args) throws Exception {

        if (args.length == 1) {
            boolean completado = false;
            String fichero = args[0];
            do {
                try {
                    BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Luma\\Documents\\Grado\\Entornos de desarrollo\\Prog\\lib\\"+fichero));
                    String linea = "";

                    while (linea != null) {
                        System.out.println(linea);
                        linea = br.readLine();
                    }
                    br.close();
                    completado = true;

                } catch (FileNotFoundException fnfe) {
                    System.out.println("No se encuentra el fichero, se va a crear.");
                    
                    try {
                        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Luma\\Documents\\Grado\\Entornos de desarrollo\\Prog\\lib\\"+fichero));
                                
                        bw.write("naranja\n");
                        bw.write("mango\n");
                        bw.write("chirimoya\n");

                        bw.close();

                    } catch (IOException ioe) {
                        System.out.println("No se ha podido escribir en el fichero.");
                    }

                } catch (IOException ioe) {
                    System.out.println("No se ha podido leer el fichero.");
                }

            } while (!completado);

        } else {
            System.out.println("Error, no se ha introducido el nombre del archivo.");
        }
    }
}
