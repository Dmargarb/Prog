import java.util.ArrayList;

public class CodigoPostalHashMapPrueba {
    public static void main(String[] args) {

        CodigoPostalHashMap diccionario = new CodigoPostalHashMap();

        // Añadir ciudades y códigos postales
        diccionario.addCodigoPostalCiudad("Ciudad A", 12345);
        diccionario.addCodigoPostalCiudad("Ciudad B", 54321);
        diccionario.addCodigoPostalCiudad("Ciudad A", 67890);
        diccionario.addCodigoPostalCiudad("Ciudad A", 88888);
        diccionario.addCodigoPostalCiudad("Ciudad C", 21432);
        diccionario.addCodigoPostalCiudad("Ciudad C", 98745);
        diccionario.addCodigoPostalCiudad("Ciudad D", 84815);
        diccionario.addCodigoPostalCiudad("Ciudad E", 99999);

        // Consultar ciudades
        ArrayList<String> ciudades = diccionario.consultarCiudades();
        System.out.println("Ciudades: " + ciudades);

        // Borrar ciudad
        System.out.println("Borramos Ciudad E");
        diccionario.removeCiudad("Ciudad E");

        // Ordenar códigos postales de una ciudad
        System.out.println("Ordenamos los códigos postales de Ciudad A");
        diccionario.ordenarCodigosPostales("Ciudad A");

        // Obtener códigos postales de una ciudad
        ArrayList<Integer> codigosPostalesCiudadA = diccionario.obtenerCodigosPostales("Ciudad A");
        System.out.println("Códigos postales de Ciudad A: " + codigosPostalesCiudadA);

        // Borrar un código postal específico de una ciudad
        System.out.println("Borramos el código postal \"12345\" de Ciudad A");
        diccionario.removeCodigoPostal("Ciudad A", 12345);

        System.out.println("");

        // Se muestran todas las ciudades con sus códigos postales
        System.out.println("Lista de ciudades con sus códigos postales:");
        diccionario.mostrarCiudadesConCodigosPostales();
    }
}
