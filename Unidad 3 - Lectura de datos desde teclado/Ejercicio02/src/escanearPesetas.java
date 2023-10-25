public class escanearPesetas {
    public static void main(String[] args) throws Exception {
        String linea;
        double euros;
        int pesetas;

        System.out.print("Introduce los euros a convertir: ");
        linea = System.console().readLine();
        euros = Double.parseDouble(linea);
        pesetas = (int) (euros * 166.386);

        System.out.println(+euros + " euros son " + pesetas + " pesetas.");
    }
}