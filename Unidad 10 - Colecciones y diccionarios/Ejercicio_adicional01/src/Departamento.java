// Clase Departamento

import java.util.ArrayList;
import java.util.List;

class Departamento {
    private String nombre;
    private List<Profesor> profesores;
    private Profesor jefeDepartamento;
    private CPIFP cpifp;

    // Constructor
    public Departamento(String nombre, CPIFP cpifp) {
        this.nombre = nombre;
        this.cpifp = cpifp;
        this.profesores = new ArrayList<>();
    }

    // Métodos para añadir y quitar profesores
    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void eliminarProfesor(Profesor profesor) {
        profesores.remove(profesor);
    }

    // Otros métodos para obtener información del departamento
}