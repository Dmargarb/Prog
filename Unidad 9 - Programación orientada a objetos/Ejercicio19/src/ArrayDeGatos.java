public class ArrayDeGatos {
    public static void main(String[] args) {
        Gatazo[] gato = new Gatazo[4];

        int i;

        System.out.println("Por favor, introduzca los datos de los gatos.");

        for (i = 0; i < 4; i++) {
            gato[i] = new Gatazo();
            System.out.println("  \nGato nº " + (i + 1));
            System.out.print("Nombre: ");
            gato[i].setNombre(System.console().readLine());
            System.out.print("Color: ");
            gato[i].setColor(System.console().readLine());
            System.out.print("Raza: ");
            gato[i].setRaza(System.console().readLine());
        }

        System.out.println("\nDatos de los gatos:");

        for (i = 0; i < gato.length; i++) {
            System.out.println("\nGato nº" + (i + 1));
            System.out.println("Nombre: " + gato[i].getNombre());
            System.out.println("Color: " + gato[i].getColor());
            System.out.println("Raza: " + gato[i].getRaza());
        }
    }
}
