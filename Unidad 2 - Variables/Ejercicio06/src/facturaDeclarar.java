public class facturaDeclarar {
    public static void main(String[] args) throws Exception {
        double importe;
        double iva;
        double total;
        importe = 30.85;
        iva = importe * 0.25;
        total = iva + importe;

        System.out.printf("Importe:        %8.2f\n", + importe);
        System.out.printf("IVA:            %8.2f\n", + iva);
        System.out.printf("------------------------\n");    
        System.out.printf("Importe total:  %8.2f\n", + total);
    }
}
