import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenarPalabrasDelFichero {
    public static void main(String[] args) throws Exception {

        if (args.length == 1) {

            ArrayList<String> palabras = new ArrayList<String>();
            String fichero = args[0];
            int l = args[0].length();
            String nombre = args[0].substring(0, l - 4);
            String extension = args[0].substring(l - 4, l);

                try {
                    BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Luma\\Documents\\Grado\\Entornos de desarrollo\\Prog\\lib\\" + fichero));
                    String linea = "";

                    while (linea != null) {
                        linea = br.readLine();
                        palabras.add(linea);
                    }
                    
                    try {
                        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Luma\\Documents\\Grado\\Entornos de desarrollo\\Prog\\lib\\"+ nombre + "_sort" + extension));

                        if (palabras.contains(null)) {
                            palabras.remove(null);
                        }

                        Collections.sort(palabras);

                        for (String palabra : palabras) {
                            bw.write(palabra+"\n");
                        }

                        System.out.println("Archivo creado exitosamente.");
                        
                        bw.close();

                    } catch (IOException ioe) {
                        System.out.println("No se ha podido escribir en el fichero.");
                    }


                    br.close();

                } catch (FileNotFoundException fnfe) {
                    System.out.println("No se ha encontrado el fichero.");

                } catch (IOException ioe) {
                    System.out.println("No se ha podido leer el fichero.");
                }

        } else {
            System.out.println("Error, no se ha introducido el nombre del archivo.");
        }
    }
}
