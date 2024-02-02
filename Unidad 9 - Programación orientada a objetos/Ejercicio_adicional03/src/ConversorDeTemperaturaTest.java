import org.junit.Assert;
import org.junit.Test;

public class ConversorDeTemperaturaTest {

  @Test
  public void testFahrenheit() {
    ConversorDeTemperatura convert = new ConversorDeTemperatura();
    Assert.assertEquals(50, convert.TemperatureConverterFahrenheit(10), 0.01);
  }

  @Test
  public void testCelsius() {
    ConversorDeTemperatura convert = new ConversorDeTemperatura();
    Assert.assertEquals(0, convert.TemperatureConverterCelsius(32), 0.01);
  }
}
