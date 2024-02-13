public class Gatito extends Mamifero {
  
  @SuppressWarnings("unused")
  private String raza;

  public Gatito (Genero s, String r) {
    super(s);
    this.raza = r;
  }
  
  public Gatito (Genero s) {
    super(s);
    this.raza = "siamés";
  }

  public Gatito (String r) {
    super(Genero.HEMBRA);
    this.raza = r;
  }
  
  public Gatito () {
    super(Genero.HEMBRA);
    raza = "siamés";
  }
  
  public void maulla() {
    System.out.println("Miauuuu");
  }
  
  public void ronronea() {
    System.out.println("mrrrrrr");
  }
  
  public void come(String comida) {
    if (comida.equals("pescado")) {
      System.out.println("Hmmmm, gracias");
    } else {
      System.out.println("Lo siento, yo solo como pescado");
    }
  }
  
  public void peleaCon(Gatito contrincante) {
    if (this.getGenero() == Genero.HEMBRA) {
      System.out.println("no me gusta pelear");
    } else {
      if (contrincante.getGenero() == Genero.HEMBRA) {
        System.out.println("no peleo contra gatitas");
      } else {
        System.out.println("ven aquí que te vas a enterar");
      }
    }
  }
  
  public void limpiate() {
    System.out.println("Me estoy lamiendo");
  }
  
  public void caza() {
    System.out.println("Estoy cazando ratones");
  }
}
