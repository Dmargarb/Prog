import java.util.ArrayList;

class CPIFP {

    private String nombre;
    private String direccion;
    private int telefono;
    private ArrayList<Departamento> departamentos;

    public CPIFP(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.departamentos = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void addDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void removeDepartamento(Departamento departamento) {
        departamentos.remove(departamento);
    }
}