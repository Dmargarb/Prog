public abstract class Animal {

  private Genero sexo;

  public Animal () {
    this.sexo = Genero.MACHO;
  }

  public Animal (Genero s) {
    this.sexo = s;
  }

  public Genero getGenero() {
    return this.sexo;
  }

  public void duerme() {
    System.out.println("Zzzzzzz");
  }
  
  public void come(String comida) {
    System.out.println("Estoy comiendo " + comida);
  }
}
