public class operaciones {
    public static void main(String[] args) throws Exception {
        String linea;
        double primerNumero;
        double segundoNumero;

        System.out.print("Introduce un número: ");
        linea = System.console().readLine();
        primerNumero = Double.parseDouble(linea);

        System.out.print("Introduce un segundo número: ");
        linea = System.console().readLine();
        segundoNumero = Double.parseDouble(linea);
        
        double suma;
        suma = primerNumero + segundoNumero;

        double resta;
        resta = primerNumero - segundoNumero;

        double mult;
        mult = primerNumero * segundoNumero;

        double div;
        div = primerNumero / segundoNumero;
    
        System.out.println("La suma de " +primerNumero+ " + " +segundoNumero+ " = " +suma);
        System.out.println("La resta de " +primerNumero+ " - " +segundoNumero+ " = " +resta);
        System.out.println("La multiplicación de " +primerNumero+ " * " +segundoNumero+ " = " +mult);
        System.out.println("La división de " +primerNumero+ " / " +segundoNumero+ " = " +div);
    }
}
