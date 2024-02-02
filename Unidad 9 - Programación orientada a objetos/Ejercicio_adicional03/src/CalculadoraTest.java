import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

  @Test
  public void testSuma() {
    Calculadora calc = new Calculadora();
    Assert.assertEquals(Integer.valueOf(5), calc.suma(3, 2));
  }

  @Test
  public void testResta() {
    Calculadora calc = new Calculadora();
    Assert.assertEquals(Integer.valueOf(10), calc.resta(40, 30));
  }

  @Test
  public void testMultiplicacion() {
    Calculadora calc = new Calculadora();
    Assert.assertEquals(Integer.valueOf(20), calc.multiplicacion(4, 5));
  }

  @Test
  public void testDivision() {
    Calculadora calc = new Calculadora();
    Assert.assertEquals(Integer.valueOf(10), calc.dividir(50, 5));
  }

  @Test
  public void testDivisionCero() {
    Calculadora calc = new Calculadora();
    Assert.assertNull(calc.dividir(7, 0));
  }
}
