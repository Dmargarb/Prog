/**
 *
 * Definición de la clase PruebaLibreto
 * 
 * @author David Martín García
 */
public class PruebaLibreto {
    public static void main(String[] args) {

        try { // Si se produce un error
            System.out.print("Introduce el identificador del libreto: ");
            int identificador = Integer.parseInt(System.console().readLine());

            System.out.print("Introduce el titulo del libreto: ");
            String titulo = System.console().readLine();

            System.out.print("Introduce el año de publicación del libreto: ");
            int anioDePublicacion = Integer.parseInt(System.console().readLine());

            Libreto libreto1 = new Libreto(identificador, titulo, anioDePublicacion); // Se el objeto

            System.out.println(libreto1); // Se muestran los datos.

        } catch (Exception e) { // Se muestra el mensaje en pantalla.
            System.out.println("Error, los datos no se han introducido correctamente.");
        }
    }
}
