import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class MezclarFicheros {
  public static void main(String[] args) {

    if (args.length == 3) {
      try {
        BufferedReader bf1 = new BufferedReader(new FileReader("C:\\Users\\Luma\\Documents\\Grado\\Entornos de desarrollo\\Prog\\lib\\"+args[0]));
        BufferedReader bf2 = new BufferedReader(new FileReader("C:\\Users\\Luma\\Documents\\Grado\\Entornos de desarrollo\\Prog\\lib\\"+args[1]));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Luma\\Documents\\Grado\\Entornos de desarrollo\\Prog\\lib\\"+args[2]));

        String linea1 = "";
        String linea2 = "";

        while ((linea1 != null) || (linea2 != null)) {
          linea1 = bf1.readLine();
          linea2 = bf2.readLine();

          if (linea1 != null) {
            bw.write(linea1 + "\n");
          }

          if (linea2 != null) {
            bw.write(linea2 + "\n");
          }
        }

        bf1.close();
        bf2.close();
        bw.close();

        System.out.println("Archivo mezclado exitosamente.");

      } catch (IOException ioe) {
        System.out.println("Se ha producido un error de lectura/escritura");
        System.err.println(ioe.getMessage());
      }

    } else {
      System.out.println("Número de parámetros incorrectos, tienen que ser 3.");
    }
  }
}
