public class Calculadora {

  public Integer suma(Integer operador1, Integer operador2) {
    return operador1 + operador2;
  }

  public Integer resta(Integer operador1, Integer operador2) {
    return operador1 - operador2;
  }

  public Integer multiplicacion(Integer operador1, Integer operador2) {
    return operador1 * operador2;
  }

  public Integer dividir(Integer operador1, Integer operador2) {
    try {
      return operador1 / operador2;
    } catch (Exception e) {
      System.out.println("No se puede dividir entre 0");
      return null;
    }
  }
}
