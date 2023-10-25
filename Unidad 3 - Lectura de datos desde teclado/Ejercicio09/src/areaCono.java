public class areaCono {
    public static void main(String[] args) throws Exception {
        String linea;
        double PI;
        PI = 3.141592654;
        
        System.out.println("Volumen de un cono");
        System.out.println("------------------");
        System.out.print("Introduce el radio de la base (cm): ");
        linea = System.console().readLine();
        double radio;
        radio = Double.parseDouble(linea);
        
        System.out.print("Introduce la altura del cono (cm): ");
        linea = System.console().readLine();
        double altura;
        altura = Double.parseDouble(linea);
        
        double total;
        total = (1.0/3.0) * PI * radio * radio * altura;
        System.out.println("El volumen del cono es de " +  total + " cm³");
    }
}