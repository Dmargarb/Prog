public class notaProg {
    public static void main(String[] args) throws Exception {
        String linea;
        
        System.out.print("Introduce la nota del primer examen: ");
        linea = System.console().readLine();
        double nota1;
        nota1 = Double.parseDouble(linea);
        
        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        linea = System.console().readLine();
        double notaTotal;
        notaTotal = Double.parseDouble(linea);

        double nota2;
        nota2 = ((notaTotal * 100) - (nota1 * 40)) / 60;

        System.out.print("Para tener un " + notaTotal + " en el trimestre");
        System.out.println(" necesita sacar un " + nota2 + " en el segundo examen.");
    }
}
