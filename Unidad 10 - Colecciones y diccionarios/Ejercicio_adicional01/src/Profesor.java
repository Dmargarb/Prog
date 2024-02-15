class Profesor {

    private String nombre;
    private String especialidad;
    private Departamento departamento;

    public Profesor(String nombre, String especialidad, Departamento departamento) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
}