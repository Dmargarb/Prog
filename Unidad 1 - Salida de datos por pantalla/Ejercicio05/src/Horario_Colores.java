public class Horario_Colores {
    public static void main(String[] args) throws Exception {
        System.out.printf("%-8s     %-12s    %-8s    %-12s\n", "\033[33m", "HORARIO", "LUNES", "MARTES");
        System.out.printf("%-8s     %-12s    %-8s    %-12s\n", "\033[32m", "15'15-16:15", "ApIn", "ApIn");
        System.out.printf("%-8s     %-12s    %-8s    %-12s\n", "\033[31m", "16'15-17:15", "ApIn", "ApIn");
        System.out.print ("\033[0m");
    }
}
