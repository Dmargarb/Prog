public class areaRectangulo {
    public static void main(String[] args) throws Exception {
        String linea;

        System.out.print("Introduce la base del rectángulo: ");
        linea = System.console().readLine();
        double primerNumero;
        primerNumero = Double.parseDouble(linea);
    
        System.out.print("Introduce la altura del rectángulo: ");
        linea = System.console().readLine();
        double segundoNumero;
        segundoNumero = Double.parseDouble(linea);
        
        double total;
        total = primerNumero * segundoNumero;
    
        System.out.println("El área del rectángulo es: "+total);
    }
}
