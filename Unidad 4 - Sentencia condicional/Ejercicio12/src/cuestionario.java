import java.util.Scanner;

public class cuestionario {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int aciertos = 0;

    System.out.println("");
    System.out.println("--------");
    System.out.println(" Exámen ");
    System.out.println("--------");
    System.out.println("");

    System.out.println("Pregunta Nº 1: ¿Cuánto es 1+1?");
    System.out.println("--------------------------------");
    System.out.printf("1. %3d\n", 2);
    System.out.printf("2. %3d\n", 4);
    System.out.printf("3. %3d\n", 8);
    System.out.printf("4. %3d\n", 16);
    System.out.print("\nElija una opción (1-4): ");
    int pregunta1 = s.nextInt();
    System.out.println("");

    if (pregunta1 == 1) {
      aciertos = aciertos+1;
    }

    System.out.println("Pregunta Nº 2: ¿Cuánto es 2+2?");
    System.out.println("--------------------------------");
    System.out.printf("1. %3d\n", 4);
    System.out.printf("2. %3d\n", 8);
    System.out.printf("3. %3d\n", 16);
    System.out.printf("4. %3d\n", 32);
    System.out.print("\nElija una opción (1-4): ");
    int pregunta2 = s.nextInt();
    System.out.println("");

    if (pregunta2 == 1) {
      aciertos = aciertos+1;
    }

    System.out.println("Pregunta Nº 3: ¿Cuánto es 3+3?");
    System.out.println("--------------------------------");
    System.out.printf("1. %3d\n", 2);
    System.out.printf("2. %3d\n", 4);
    System.out.printf("3. %3d\n", 8);
    System.out.printf("4. %3d\n", 6);
    System.out.print("\nElija una opción (1-4): ");
    int pregunta3 = s.nextInt();
    System.out.println("");

    if (pregunta3 == 4) {
      aciertos = aciertos+1;
    }

    System.out.println("Pregunta Nº 4: ¿Cuánto es 4+4?");
    System.out.println("--------------------------------");
    System.out.printf("1. %3d\n", 4);
    System.out.printf("2. %3d\n", 8);
    System.out.printf("3. %3d\n", 16);
    System.out.printf("4. %3d\n", 32);
    System.out.print("\nElija una opción (1-4): ");
    int pregunta4 = s.nextInt();
    System.out.println("");

    if (pregunta4 == 2) {
      aciertos = aciertos+1;
    }

    System.out.println("Pregunta Nº 5: ¿Cuánto es 5+5?");
    System.out.println("--------------------------------");
    System.out.printf("1. %3d\n", 10);
    System.out.printf("2. %3d\n", 15);
    System.out.printf("3. %3d\n", 20);
    System.out.printf("4. %3d\n", 5);
    System.out.print("\nElija una opción (1-4): ");
    int pregunta5 = s.nextInt();
    System.out.println("");

    if (pregunta5 == 1) {
      aciertos = aciertos+1;
    }

    System.out.println("Pregunta Nº 6: ¿Cuánto es 6+6?");
    System.out.println("--------------------------------");
    System.out.printf("1. %3d\n", 15);
    System.out.printf("2. %3d\n", 12);
    System.out.printf("3. %3d\n", 24);
    System.out.printf("4. %3d\n", 36);
    System.out.print("\nElija una opción (1-4): ");
    int pregunta6 = s.nextInt();
    System.out.println("");

    if (pregunta6 == 2) {
      aciertos = aciertos+1;
    }

    System.out.println("Pregunta Nº 7: ¿Cuánto es 7+7?");
    System.out.println("--------------------------------");
    System.out.printf("1. %3d\n", 12);
    System.out.printf("2. %3d\n", 14);
    System.out.printf("3. %3d\n", 15);
    System.out.printf("4. %3d\n", 18);
    System.out.print("\nElija una opción (1-4): ");
    int pregunta7 = s.nextInt();
    System.out.println("");

    if (pregunta7 == 2) {
      aciertos = aciertos+1;
    }

    System.out.println("Pregunta Nº 8: ¿Cuánto es 8+8?");
    System.out.println("--------------------------------");
    System.out.printf("1. %3d\n", 10);
    System.out.printf("2. %3d\n", 20);
    System.out.printf("3. %3d\n", 16);
    System.out.printf("4. %3d\n", 21);
    System.out.print("\nElija una opción (1-4): ");
    int pregunta8 = s.nextInt();
    System.out.println("");

    if (pregunta8 == 3) {
      aciertos = aciertos+1;
    }

    System.out.println("Pregunta Nº 9: ¿Cuánto es 9+9?");
    System.out.println("--------------------------------");
    System.out.printf("1. %3d\n", 17);
    System.out.printf("2. %3d\n", 18);
    System.out.printf("3. %3d\n", 19);
    System.out.printf("4. %3d\n", 20);
    System.out.print("\nElija una opción (1-4): ");
    int pregunta9 = s.nextInt();
    System.out.println("");

    if (pregunta9 == 2) {
      aciertos = aciertos+1;
    }

    System.out.println("Pregunta Nº 10: ¿Cuánto es 10+10?");
    System.out.println("--------------------------------");
    System.out.printf("1. %3d\n", 15);
    System.out.printf("2. %3d\n", 20);
    System.out.printf("3. %3d\n", 25);
    System.out.printf("4. %3d\n", 30);
    System.out.print("\nElija una opción (1-4): ");
    int pregunta10 = s.nextInt();
    System.out.println("");

    if (pregunta10 == 2) {
      aciertos = aciertos+1;
    }

    System.out.println(
      "Tu puntuación final es de: " +
      aciertos +
      " puntos de un total de 10 puntos."
    );
    System.out.println("");

    if (aciertos == 10) {
      System.out.println("¡Enorabuena! ¡Has alcanzado la puntuación máxima!");
      System.out.println("");
    }
    s.close();
  }
}
