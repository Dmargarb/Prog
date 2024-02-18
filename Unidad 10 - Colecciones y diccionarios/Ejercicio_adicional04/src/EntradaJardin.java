public class EntradaJardin extends Thread {
    // clase derivada de Thread que define un hilo
    private GestorJardin jardin;

    public EntradaJardin(String nombre, GestorJardin j) {
        this.setName(nombre);
        this.jardin = j;
    }

    @Override
    public void run() {
        jardin.incrementaCuenta();
        // invoca al método que incrementa la cuenta de accesos al jardín
    }
}
