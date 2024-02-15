import java.util.ArrayList;

class Departamento {

    private String nombre;
    private ArrayList<Profesor> profesores;
    private Profesor jefeDepartamento;

    public Departamento(String nombre, Profesor jefeDepartamento) {
        this.nombre = nombre;
        this.jefeDepartamento = jefeDepartamento;
        this.profesores = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public Profesor getJefeDepartamento() {
        return jefeDepartamento;
    }

    public void addProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void removeProfesor(Profesor profesor) {
        profesores.remove(profesor);
    }
}