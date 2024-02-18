import java.util.ArrayList;

class Estudiante {

    private String nombre;
    private int identificador;
    private CPIFP cpifp;
    private ArrayList<Modulo> modulos;

    // Constructor
    public Estudiante(String nombre, int identificador, CPIFP cpifp) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.cpifp = cpifp;
    }

    // Getter del nombre
    public String getNombre() {
        return nombre;
    }

    // Getter del identificador
    public int getIdentificador() {
        return identificador;
    }

    // Getter del CPIFP
    public CPIFP getCpifp() {
        return cpifp;
    }

    // Método para obtener la lista de módulos
    public ArrayList<Modulo> getModulos() {
        return modulos;
    }
}