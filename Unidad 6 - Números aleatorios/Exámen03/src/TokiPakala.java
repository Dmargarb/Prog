/**
 * Toki Pakala
 *
 *
 * @author David Martín García
 */
public class TokiPakala {

  public static void main(String[] args) {
    int documento = (int) (Math.random() * 21 + 1); //documento
    for (int d = 0; d < documento; d++) { //Bucle de documento
      int parrafo = (int) (Math.random() * 12 + 1); //parrafo

      for (int a = 0; a < parrafo; a++) { //Bucle de parrafo
        int frase = (int) (Math.random() * 53 + 1); //frase

        for (int i = 0; i < frase; i++) { //Bucle de frases
          int palabra = (int) (Math.random() * 6 + 1); //palabras

          for (int j = 0; j < palabra; j++) { //Bucle de palabras
            boolean soloVocal = false;
            boolean consonanteVocal = false;

            String vocal = "";
            String consonante = "";

            switch ((int) (Math.random() * 8)) {
              case 0:
                soloVocal = true; // silaba de solo vocal
                break;
              case 1:
              case 2:
              case 3:
              case 4:
              case 5:
              case 6:
              case 7:
                consonanteVocal = true; // silaba de consonante y vocal
                break;
              default:
            }

            switch ((int) (Math.random() * 9)) { //tipo de consonante
              case 0:
                consonante = "p";
                break;
              case 1:
                consonante = "t";
                break;
              case 2:
                consonante = "k";
                break;
              case 3:
                consonante = "s";
                break;
              case 4:
                consonante = "m";
                break;
              case 5:
                consonante = "n";
                break;
              case 6:
                consonante = "l";
                break;
              case 7:
                consonante = "j";
                break;
              case 8:
                consonante = "w";
                break;
              default:
            }

            switch ((int) (Math.random() * 5)) { //tipo de vocal
              case 0:
                vocal = "a";
                break;
              case 1:
                vocal = "e";
                break;
              case 2:
                vocal = "i";
                break;
              case 3:
                vocal = "o";
                break;
              case 4:
                vocal = "u";
                break;
              default:
            }

            if (soloVocal) { // imprime solo vocal
              System.out.print(vocal);
            }

            if (consonanteVocal) { // imprime solo consonante
              System.out.print(consonante + vocal);
            }
          }
          if (i == frase - 1) {
            System.out.print(". "); // imprime el punto final
          } else {
            System.out.print(" "); // imprime espacio entre palabras
          }
        }
      }
      System.out.println();
      System.out.println();
      System.out.println();
    }
  }
}
