import java.util.Scanner;

public class horoscopo {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    String horoscopo = "";

    System.out.println("");
    System.out.println("-------------");
    System.out.println("  Horóscopo  ");
    System.out.println("-------------");
    System.out.print("\nIntroduce tu día de nacimiento (1-31): ");
    int dia = s.nextInt();
    System.out.print("\nIntroduce tu mes de nacimiento (1-12): ");
    int mes = s.nextInt();
    System.out.println("");

    if (dia <= 0 || dia >= 32 || mes <= 0 || mes >= 13) {
      System.out.println("Los datos introducidos no son correctos.");
      System.out.println("");
    } else {
      switch (mes) {
        case 1:
          if (dia < 20) {
            horoscopo = "Capricornio";
          } else {
            horoscopo = "Acuario";
          }
          break;
        case 2:
          if (dia < 19) {
            horoscopo = "Acuario";
          } else {
            horoscopo = "Piscis";
          }
          break;
        case 3:
          if (dia < 21) {
            horoscopo = "Piscis";
          } else {
            horoscopo = "Aries";
          }
          break;
        case 4:
          if (dia < 20) {
            horoscopo = "Aries";
          } else {
            horoscopo = "Tauro";
          }
          break;
        case 5:
          if (dia < 21) {
            horoscopo = "Tauro";
          } else {
            horoscopo = "Géminis";
          }
          break;
        case 6:
          if (dia < 21) {
            horoscopo = "Géminis";
          } else {
            horoscopo = "Cáncer";
          }
          break;
        case 7:
          if (dia < 23) {
            horoscopo = "Cáncer";
          } else {
            horoscopo = "Leo";
          }
          break;
        case 8:
          if (dia < 23) {
            horoscopo = "Leo";
          } else {
            horoscopo = "Virgo";
          }
          break;
        case 9:
          if (dia < 23) {
            horoscopo = "Virgo";
          } else {
            horoscopo = "Libra";
          }
          break;
        case 10:
          if (dia < 23) {
            horoscopo = "Libra";
          } else {
            horoscopo = "Escorpio";
          }
          break;
        case 11:
          if (dia < 22) {
            horoscopo = "Escorpio";
          } else {
            horoscopo = "Sagitario";
          }
          break;
        case 12:
          if (dia < 22) {
            horoscopo = "Sagitario";
          } else {
            horoscopo = "Capricornio";
          }
          break;
        default:
          System.out.println("Ha ocurrido un error.");
          System.out.println("");
      }
      System.out.println("Tu horóscopo es: " + horoscopo + ".");
      System.out.println("");
    }
    s.close();
  }
}
