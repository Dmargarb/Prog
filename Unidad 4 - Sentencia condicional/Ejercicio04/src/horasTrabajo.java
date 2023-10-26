import java.util.Scanner;

public class horasTrabajo {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.print(
      "Por favor, introduzca el número de horas trabajadas durante la semana: "
    );
    int horas = s.nextInt();
    if (horas < 41) {
      int total = horas * 12;
      System.out.println(
        "El sueldo semanal que le corresponde es de: " + total + " euros."
      );
    } else {
      int total1 = (horas - 40);
      int totalFinal = total1 * 16 + 480;
      System.out.println(
        "El sueldo semanal que le corresponde es de: " + totalFinal + " euros."
      );
    }
    s.close();
  }
}