public class ConversorDeTemperatura {

  public double TemperatureConverterFahrenheit(double celsius) {
    return (celsius * 9 / 5) + 32;
  }

  public double TemperatureConverterCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
  }
}
