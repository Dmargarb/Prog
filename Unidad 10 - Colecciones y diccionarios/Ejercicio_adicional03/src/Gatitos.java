/**
 * Definición de la clase Gato
 * 
 *
 */

public class Gatitos implements Comparable<Gatitos> {

    private String nombre;
    private String color;
    private String raza;

    public Gatitos(String nombre, String color, String raza) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String toString() {
        return "Nombre: " + this.nombre + "\nColor: " + this.color + "\nRaza: " + this.raza;
    }

    public int compareTo(Gatitos g) {
        return (this.nombre).compareTo(g.getNombre());
    }

    public boolean equals(Gatitos g) {
        return (this.nombre).equals(g.getNombre());
    }
}
