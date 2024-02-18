import java.util.ArrayList;

class Departamento {

    private String nombre;
    private CPIFP centro;
    private Profesor jefeDepartamento;
    private ArrayList<Profesor> profesores;
    private ArrayList<Modulo> modulos;

    // Constructor
    public Departamento(CPIFP centro, Profesor jefeDepartamento, String nombre) {
        this.centro = centro;
        this.jefeDepartamento = jefeDepartamento;
        this.profesores = new ArrayList<>();
        this.nombre = nombre;
    }

    // Getter del nombre
    public String getNombre() {
        return this.nombre;
    }

    // Getter del centro
    public CPIFP getCentro() {
        return this.centro;
    }

    // Método para obtener la lista de profesores
    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    // Método para obtener la lista de módulos
    public ArrayList<Modulo> getModulos() {
        return modulos;
    }

    // Setter del jefe del departamento
    public void setJefeDepartamento(Profesor jefeDepartamento) {
        this.jefeDepartamento = jefeDepartamento;
    }

    // Getter del jefe del departamento
    public Profesor getJefeDepartamento() {
        return jefeDepartamento;
    }

    // Método para verificar si un profesor está en el departamento
    public boolean verificarProfesor(Profesor profesor) {
        return profesores.contains(profesor);
    }

    // Método para obtener un profesor por su nombre
    public Profesor getProfesor(String nombreProfesor) {
        for (Profesor profesor : profesores) {
            if (profesor.getNombre().equals(nombreProfesor)) {
                return profesor;
            }
        }
        return null;
    }

    // Método para agregar un profesor al departamento
    public void addProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    // Método para quitar un profesor del departamento
    public void quitarProfesor(Profesor profesor) {
        profesores.remove(profesor);
    }
}
