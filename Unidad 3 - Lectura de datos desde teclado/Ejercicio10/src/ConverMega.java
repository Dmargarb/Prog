public class ConverMega {
    public static void main(String[] args) throws Exception {
        String linea;
        double mb;
        double kb;

        System.out.print("Introduce los Mb a convertir: ");
        linea = System.console().readLine();
        mb = Double.parseDouble(linea);
        kb = mb * 1000;
        System.out.println(+mb + " Megabytes son " + kb + " Kilobytes.");
    }
}