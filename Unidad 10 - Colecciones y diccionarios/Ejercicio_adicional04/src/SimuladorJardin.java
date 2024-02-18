public class SimuladorJardin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorJardin jardin = new GestorJardin();
        // crea un objeto RecursoJardín

        for (int i = 1; i <= 10; i++) {
            (new EntradaJardin("Entra" + i, jardin)).start();
        } // entrada de 10 hilos al jardín

        for (int i = 1; i <= 15; i++) {
            (new SalidaJardin("Sale" + i, jardin)).start();
        } // salida de 15 hilos al jardín
    }
}
