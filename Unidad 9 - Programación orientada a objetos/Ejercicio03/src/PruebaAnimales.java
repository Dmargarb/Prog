public class PruebaAnimales {

  public static void main(String[] args) {
    Pinguino tux = new Pinguino(Genero.MACHO);
    tux.come("palomitas");
    tux.programa();
    
    Perro laika = new Perro(Genero.HEMBRA);
    laika.duerme();
    laika.dameLaPata();
    laika.amamanta();
    laika.cuidaCrias();
    
    Lagarto godzilla = new Lagarto(Genero.MACHO);
    godzilla.tomaElSol();
    godzilla.duerme();
  }
}
