

import java.util.ArrayList;
import java.util.List;

class Estudiante {
    private String nombre;
    private int identificador;
    private CPIFP cpifp;
    private List<Modulo> modulos;

    // Constructor
    public Estudiante(String nombre, int identificador, CPIFP cpifp) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.cpifp = cpifp;
        this.modulos = new ArrayList<>();
    }

    // Métodos para añadir y quitar módulos
    public void agregarModulo(Modulo modulo) {
        modulos.add(modulo);
    }

    public void eliminarModulo(Modulo modulo) {
        modulos.remove(modulo);
    }

    // Otros métodos para obtener información del estudiante
}