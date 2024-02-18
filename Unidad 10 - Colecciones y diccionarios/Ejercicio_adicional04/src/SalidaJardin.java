public class SalidaJardin extends Thread {
    // clase derivada de Thread que define un hilo
    private GestorJardin jardin;

    public SalidaJardin(String nombre, GestorJardin j) {
        this.setName(nombre);
        this.jardin = j;
    }

    @Override
    public void run() {
        jardin.decrementaCuenta();
        // invoca al método que decrementa la cuenta de accesos al jardín
    }
}
