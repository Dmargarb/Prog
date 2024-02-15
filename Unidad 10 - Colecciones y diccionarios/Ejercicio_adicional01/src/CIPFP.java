import java.util.*;

// Clase CPIFP
class CPIFP {
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Estudiante> estudiantes;
    private List<Departamento> departamentos;

    // Constructor
    public CPIFP(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estudiantes = new ArrayList<>();
        this.departamentos = new ArrayList<>();
    }

    // Métodos para añadir y quitar estudiantes
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        estudiantes.remove(estudiante);
    }

    // Métodos para añadir y quitar departamentos
    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void eliminarDepartamento(Departamento departamento) {
        departamentos.remove(departamento);
    }

    // Otros métodos para obtener información de estudiantes y departamentos
}