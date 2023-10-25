public class horarioIf {

  public static void main(String[] args) throws Exception {
    String dia;

    System.out.print("¿Cuál día de la semana quieres ver? ");
    dia = System.console().readLine();
    dia = dia.toLowerCase();

    switch (dia) {
      case "lunes":
        System.out.println("El Lunes te toca: Sistemas Informáticos.");
        break;
      case "martes":
        System.out.println("El Martes te toca: Sistemas Informáticos.");
        break;
      case "miércoles":
        System.out.println("El Miércoles te toca: Bases de Datos.");
        break;
      case "jueves":
        System.out.println("El Jueves te toca: Lenguajes de marcas y sistemas de gestión de información.");
        break;
      case "viernes":
        System.out.println("El Viernes te toca: Bases de Datos.");
        break;
      case "sábado":
        System.out.println("No hay clase ese día.");
        break;
      case "domingo":
        System.out.println("No hay clase ese día.");
        break;
      default:
        System.out.println("El día introducido no es correcto.");
    }
  }
}