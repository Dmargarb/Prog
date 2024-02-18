import java.util.ArrayList;

class CPIFP {

    private String nombre;
    private String direccion;
    private long telefono;
    private ArrayList<Departamento> departamentos;
    private ArrayList<Estudiante> estudiantes;

    // Constructor
    public CPIFP(String nombre, String direccion, long telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.departamentos = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    // Método para agregar un estudiante a la lista de estudiantes
    public void addEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Método para agregar un departamento a la lista de departamentos
    public void addDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    // Método para eliminar un departamento de la lista de departamentos
    public boolean quitarDepartamento(Departamento departamento) {
        return departamentos.remove(departamento);
    }

    // Método para eliminar un estudiante de la lista de estudiantes
    public boolean quitarEstudiante(Estudiante estudiante) {
        return estudiantes.remove(estudiante);
    }

    // Método para obtener un estudiante por su nombre
    public Estudiante getEstudiante(String nombreEstudiante) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equals(nombreEstudiante)) {
                return estudiante;
            }
        }
        return null;
    }

    // Método para obtener un departamento por su nombre
    public Departamento getDepartamento(String nombreDepartamento) {
        for (Departamento departamento : departamentos) {
            if (departamento.getNombre().equals(nombreDepartamento)) {
                return departamento;
            }
        }
        return null;
    }

    // Método para obtener la lista de estudiantes
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    // Método para obtener la lista de departamentos
    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    // Getter del nombre
    public String getNombreCpifp() {
        return nombre;
    }

    // Getter de la dirección
    public String getDireccionCPIFP() {
        return direccion;
    }

    // Getter del teléfono
    public long getTelefonoCPIFP() {
        return telefono;
    }
}
