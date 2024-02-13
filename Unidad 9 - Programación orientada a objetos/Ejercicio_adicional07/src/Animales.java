/**
 * Animales.java
 * Definición de la clase Animal
 * 
 */
public abstract class Animales {

    private Sexos sexo;

    public Animales() {
        sexo = Sexos.MACHO;
    }

    public Animales(Sexos x) {
        sexo = x;
    }

    public Sexos getSexo() {
        return sexo;
    }

    public String toString() {
        return "Sexo: " + this.sexo + "\n";
    }

    /**
     * Hace que el animal se eche a dormir.
     */
    public void duerme() {
        System.out.println("Zzzzzzz");
    }

    public void come() {
        System.out.println("¡Qué rico!");
    }

    public void come(String comida) {
        System.out.println("¡Qué rico, me gusta comer " + comida + "!");
    }
}
