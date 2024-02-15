import java.util.ArrayList;

class Estudiante {

    private String nombre;
    private int identificador;
    private CPIFP cpifp;
    private ArrayList<Modulo> modulos;

    public Estudiante(String nombre, int identificador, CPIFP cpifp) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.cpifp = cpifp;
        this.modulos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdentificador() {
        return identificador;
    }

    public CPIFP getCpifp() {
        return cpifp;
    }

    public ArrayList<Modulo> getModulos() {
        return modulos;
    }
}