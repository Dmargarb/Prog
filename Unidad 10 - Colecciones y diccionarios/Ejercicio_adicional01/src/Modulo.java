import java.util.ArrayList;

class Modulo {
    private String nombre;
    private int identificador;
    private Departamento departamento;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Profesor> profesores;

    public Modulo(String nombre, int identificador, Departamento departamento) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.departamento = departamento;
        this.estudiantes = new ArrayList<>();
        this.profesores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdentificador() {
        return identificador;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }
}