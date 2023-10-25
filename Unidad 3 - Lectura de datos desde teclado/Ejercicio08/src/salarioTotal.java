public class salarioTotal {
    public static void main(String[] args) throws Exception {
        String linea;
        
        System.out.print("Introduce las horas de trabajo a la semana: ");
        linea = System.console().readLine();
        double horas;
        horas = Double.parseDouble(linea);
        
        double total;
        total = horas * 12;
        
        System.out.println("Tu salario semanal es: "+total+ " euros.");
    }
}