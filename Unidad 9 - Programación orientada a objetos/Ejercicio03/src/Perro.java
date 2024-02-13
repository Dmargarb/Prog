public class Perro extends Mamifero {

  public Perro (Genero s) {
    super(s);
  }

  public Perro () {
    super(Genero.HEMBRA);
  }

  public void ladra() {
    System.out.println("Guau guau");
  }

  public void dameLaPata() {
    System.out.println("Toma mi patita");
  }

  public void caza() {
    System.out.println("Estoy cazando perdices");
  }
}
