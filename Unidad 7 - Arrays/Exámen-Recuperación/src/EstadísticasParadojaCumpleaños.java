import java.util.Scanner;

/**
 *
 * Definición de la clase EstadísticasParadojaCumpleaños
 * 
 * @author David Martín García
 */
public class EstadísticasParadojaCumpleaños {
  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int contador = 0;
    int r = 0;

    try {

      System.out.println("¿Cuántas veces quieres ejecutar el programa?");

      do {
        System.out.print("Introduce un número entero positivo: ");
        r = s.nextInt(); // Veces que se ejecutará el programa
      } while (r <= 0);

      int[] ejecuciones = new int[r]; // Array que contendrá los resultados

      for (int i = 0; i < ejecuciones.length; i++) {
        ejecuciones[i] = paradojaCumpleaños(); // Se almacena en cada posición el número de intentos
      }

      for (int i = 0; i < ejecuciones.length; i++) {
        if (ejecuciones[i] <= 23) {
          contador++; // Si ha habido menos de 24 intentos en una posición, se incrementa el contador
        }
      }

      double porcentaje = (contador * 100) / r; // Se calcula el porcentaje del resultado final

      System.out.print("Se encontraron fechas de cumpleaños repetidas, para grupos de menos de 24 personas, el ");
      System.out.printf("%.2f", porcentaje);
      System.out.print("% de las veces.");

    } catch (Exception e) {
      System.out.println("Tiene que ser un número entero positivo."); // Error en caso de introducir mal el número
    }

    s.close();
  }

  /**
   * Función que calcula el número de intentos necesarios para que coincida el
   * cumpleaños de 2 personas.
   *
   * @return contador número de intentos
   */
  public static int paradojaCumpleaños() {

    int contador = 0;
    boolean[] dias = new boolean[364]; // Array con los días del año
    boolean completado = false;

    for (int i = 0; i < dias.length; i++) {
      dias[i] = false; // Se establecen todos los valores en false
    }

    do {
      int dia = (int) (Math.random() * 364); // Día aleatorio

      if (dias[dia]) { // Si ese día ya está en true, se acaba el bucle

        completado = true;

      } else {

        dias[dia] = true; // Si ese día esta en false, se pone en true
        contador++; // Se incrementa el contador

      }

    } while (!completado);

    return contador;
  }
}
