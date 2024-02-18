import java.util.ArrayList;

class Modulo {

    private String nombre;
    private int identificador;
    private Departamento departamento;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Profesor> profesores;

    // Constructor
    public Modulo(String nombre, int identificador, Departamento departamento) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.departamento = departamento;
    }

    // Getter del nombre
    public String getNombre() {
        return nombre;
    }

    // Getter del identificador
    public int getIdentificador() {
        return identificador;
    }

    // Getter del departamento
    public Departamento getDepartamento() {
        return departamento;
    }

    // Método para obtener la lista de estudiantes
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    // Método para obtener la lista de profesores
    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }
}