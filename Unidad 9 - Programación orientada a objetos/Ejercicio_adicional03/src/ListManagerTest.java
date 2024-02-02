import org.junit.Assert;
import org.junit.Test;

public class ListManagerTest {

    @Test
    public void testAgregarElemento() {
        ListManager list = new ListManager();
        list.agregarElemento("Elemento");
        Assert.assertEquals("Elemento", list.miLista[0]);
    }

    @Test
    public void testEliminarElementoPorIndice() {
        ListManager list = new ListManager();
        list.agregarElemento("Elemento1");
        list.agregarElemento("Elemento2");
        list.eliminarElementoPorIndice(1);
        Assert.assertEquals(1, list.miLista.length);
    }

    @Test
    public void testEliminarElementoPorValor() {
        ListManager list = new ListManager();
        list.agregarElemento("Elemento1");
        list.agregarElemento("Elemento2");
        list.eliminarElementoPorValor("Elemento2");
        Assert.assertEquals(1, list.miLista.length);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testEliminarFueraDeLimites() {
        ListManager list = new ListManager();
        list.eliminarElementoPorIndice(0);
    }

    @Test
    public void testListaVacia() {
        ListManager list = new ListManager();
        Assert.assertEquals(true, list.listaVacia());
    }

    @Test
    public void testListaVacia2() {
        ListManager list = new ListManager();
        list.agregarElemento("Elemento");
        Assert.assertEquals(false, list.listaVacia());
    }
}
