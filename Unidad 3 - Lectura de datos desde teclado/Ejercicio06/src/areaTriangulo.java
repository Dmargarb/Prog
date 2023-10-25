public class areaTriangulo {
    public static void main(String[] args) throws Exception {
        String linea;
        
        System.out.print("Introduce la base del triángulo: ");
        linea = System.console().readLine();
        double primerNumero;
        primerNumero = Double.parseDouble(linea);
        
        System.out.print("Introduce la altura del triángulo: ");
        linea = System.console().readLine();
        double segundoNumero;
        segundoNumero = Double.parseDouble(linea);
        
        double total;
        total = (primerNumero * segundoNumero) / 2;
        
        System.out.println("El área del triángulo es: "+total+ " cm²");
    }
}