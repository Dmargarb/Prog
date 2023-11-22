import java.util.Scanner;

public class OrdenarNumero {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el primer número: ");
    int num1 = s.nextInt();

    System.out.print("Introduce el segundo número: ");
    int num2 = s.nextInt();

    System.out.print("Introduce el tercer número: ");
    int num3 = s.nextInt();

		if (num1<=num2) {
			if (num2<=num3) {
				System.out.println("Los números ordenados serían: "+num1+", "+num2+" y "+num3+".");
			} else {
				if (num1<=num3) {
					System.out.println("Los números ordenados serían: "+num1+", "+num3+" y "+num2+".");
				} else {
					System.out.println("Los números ordenados serían: "+num3+", "+num1+" y "+num2+".");
				}
			}
		} else {
			if (num3<=num2) {
				System.out.println("Los números ordenados serían: "+num3+", "+num2+" y "+num1+".");
			} else {
				if (num1<=num3) {
					System.out.println("Los números ordenados serían: "+num2+", "+num1+" y "+num3+".");
				} else {
					System.out.println("Los números ordenados serían: "+num2+", "+num3+" y "+num1+".");
				}
			}
		}
        s.close();
	}
}
