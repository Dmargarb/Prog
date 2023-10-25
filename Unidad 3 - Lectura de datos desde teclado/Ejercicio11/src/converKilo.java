public class converKilo {
    public static void main(String[] args) throws Exception {
        String linea;
        double mb;
        double kb;

        System.out.print("Introduce los KB a convertir: ");
        linea = System.console().readLine();
        kb = Double.parseDouble(linea);
        mb = kb / 1000;
        System.out.println(+kb + " Kilobytes son " + mb + " Megabytes.");
    }
}