public class PosiciónArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int newElement = 10;
        int position = 2; // Posición elegida por el usuario (comienza en 0)

        // Mostrar el array original
        System.out.println("Array original:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento en array[" + i + "]: " + array[i]);
        }

        // Insertar el nuevo elemento y desplazar los elementos
        insertAndShift(array, newElement, position);

        // Mostrar el array después de la inserción y el desplazamiento
        System.out.println("\nArray después de la inserción:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento en array[" + i + "]: " + array[i]);
        }
    }

    public static void insertAndShift(int[] array, int newElement, int position) {
        // Validar la posición
        if (position >= 0 && position < array.length) {
            // Desplazar los elementos a la derecha
            for (int i = array.length - 1; i > position; i--) {
                array[i] = array[i - 1];
            }

            // Colocar el nuevo elemento en la posición deseada
            array[position] = newElement;
        } else {
            System.out.println("Posición inválida");
        }
    }
}
