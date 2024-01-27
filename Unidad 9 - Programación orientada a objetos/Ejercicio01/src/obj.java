public class obj {

    public static boolean contieneCifra(int numero, int cifra) {
        // Verificar cada dígito del número
        while (numero != 0) {
            int digito = numero % 10; // Obtener el último dígito
            if (digito == cifra) {
                return true; // Se encontró la cifra en el número
            }
            numero /= 10; // Eliminar el último dígito
        }

        // La cifra no se encontró en el número
        return false;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int numero = 74506;
        int cifra = 5;
        boolean resultado = contieneCifra(numero, cifra);
        System.out.println(resultado); // Salida esperada: true
    }
}
