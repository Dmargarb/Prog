public class ListManager {
    Object[] miLista;

    ListManager() {
        miLista = new Object[0];
    }

    public void agregarElemento(Object obj) {
        Object[] aux = new Object[miLista.length + 1];
        for (int i = 0; i < miLista.length; i++) {
            aux[i] = miLista[i];
        }
        aux[miLista.length] = obj;
        miLista = aux;
    }

    public void eliminarElementoPorIndice(int indice) {
        if (indice < 0 || indice >= miLista.length) {
            throw new IndexOutOfBoundsException("Índice fuera de los límites");
        }
        Object[] aux = new Object[miLista.length - 1];
        for (int i = 0, j = 0; i < miLista.length; i++) {
            if (i != indice) {
                aux[j++] = miLista[i];
            }
        }
        miLista = aux;
    }

    public void eliminarElementoPorValor(Object valor) {
        for (int i = 0; i < miLista.length; i++) {
            if (miLista[i].equals(valor)) {
                eliminarElementoPorIndice(i);
            }
        }
    }

    public boolean listaVacia() {
        return miLista.length == 0;
    }
}
