import java.util.Random;

public class pruebasArrays {
    public static void main(String[] args) {
        // Array de países
        String[] paises = {"España", "Rusia", "Japón", "Australia"};

        // Array de estaturas (simulación)
        int[][] estaturas = new int[4][10];
        llenarEstaturas(estaturas, 140, 210);

        // Mostrar estaturas por país
        mostrarEstaturasPorPais(paises, estaturas);

        // Calcular estatura media, mínima y máxima por país
        calcularEstadisticasPorPais(paises, estaturas);
    }

    // Método para llenar el array de estaturas con números aleatorios en un rango dado
    private static void llenarEstaturas(int[][] estaturas, int min, int max) {
        Random random = new Random();

        for (int i = 0; i < estaturas.length; i++) {
            for (int j = 0; j < estaturas[0].length; j++) {
                estaturas[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
    }

    // Método para mostrar las estaturas por país
    private static void mostrarEstaturasPorPais(String[] paises, int[][] estaturas) {
        System.out.println("Estaturas por país:");

        for (int i = 0; i < paises.length; i++) {
            System.out.print(paises[i] + ": ");
            for (int j = 0; j < estaturas[0].length; j++) {
                System.out.print(estaturas[i][j] + " cm\t");
            }
            System.out.println();
        }

        System.out.println();
    }

    // Método para calcular la estatura media, mínima y máxima por país
    private static void calcularEstadisticasPorPais(String[] paises, int[][] estaturas) {
        for (int i = 0; i < paises.length; i++) {
            int suma = 0;
            int minimo = Integer.MAX_VALUE;
            int maximo = Integer.MIN_VALUE;

            for (int j = 0; j < estaturas[0].length; j++) {
                int estatura = estaturas[i][j];
                suma += estatura;
                minimo = Math.min(minimo, estatura);
                maximo = Math.max(maximo, estatura);
            }

            int media = suma / estaturas[0].length;

            System.out.println("Estadísticas para " + paises[i] + ":");
            System.out.println("Media: " + media + " cm");
            System.out.println("Mínimo: " + minimo + " cm");
            System.out.println("Máximo: " + maximo + " cm");
            System.out.println();
        }
    }
}
