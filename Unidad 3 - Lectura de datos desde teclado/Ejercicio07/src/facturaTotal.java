public class facturaTotal {
    public static void main(String[] args) throws Exception {
        double iva;
        double total;
        String linea;
        
        System.out.print("Introduce el importe a pagar: ");
        linea = System.console().readLine();
        double importe;
        importe = Double.parseDouble(linea);

        iva = importe * 0.30;
        total = iva + importe;

        System.out.printf("Importe:        %8.2f\n", + importe);
        System.out.printf("IVA:            %8.2f\n", + iva);
        System.out.printf("------------------------\n");    
        System.out.printf("Importe total:  %8.2f\n", + total);
    }
}
