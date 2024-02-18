class Profesor {

    private String nombre;
    private String especialidad;
    private Departamento departamento;

    // Constructor
    public Profesor(String nombre, String especialidad, Departamento departamento) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.departamento = departamento;
    }

    // Getter del nombre
    public String getNombre() {
        return nombre;
    }

    // Getter de la especialidad
    public String getEspecialidad() {
        return especialidad;
    }

    // Getter del departamento
    public Departamento getDepartamento() {
        return departamento;
    }

    // Setter del departamento
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}