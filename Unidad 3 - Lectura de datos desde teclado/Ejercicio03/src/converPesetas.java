public class converPesetas {
    public static void main(String[] args) throws Exception {
        String linea;
        double euros;
        double pesetas;

        System.out.print("Introduce las pesetas a convertir: ");
        linea = System.console().readLine();
        pesetas = Double.parseDouble(linea);
        euros = pesetas / 166.386;

        System.out.println(+pesetas + " pesetas son " + euros + " euros.");
    }
}