public class declarar {

  public static void main(String[] args) throws Exception {
    int x;
    int y;
    int res_suma;
    int res_resta;
    int res_mul;
    double res_div;
    x = 144;
    y = 999;
    res_suma = x + y;
    res_resta = x - y;
    res_mul = x * y;
    res_div = (double) x / (double) y;
    System.out.println("La suma de " + x + " + " + y + " es " + res_suma + ".");
    System.out.println("La resta de " + x + " - " + y + " es " + res_resta + ".");
    System.out.println("La multiplicación de " + x + " * " + y + " es " + res_mul + ".");
    System.out.println("La división de " + x + " / " + y + " es " + res_div + ".");
  }
}