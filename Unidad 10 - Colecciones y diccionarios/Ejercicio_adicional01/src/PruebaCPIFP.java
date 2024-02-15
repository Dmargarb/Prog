public class PruebaCPIFP {
    public static void main(String[] args) {
        // Crear un CPIFP
        CPIFP cpifp = new CPIFP("CPIFP Ejemplo", "Dirección Ejemplo", 123456789);

        // Crear un Departamento
        Departamento departamento = new Departamento("Departamento Informática", new Profesor("Jefe de Departamento", "Informática", null));

        // Añadir el Departamento al CPIFP
        cpifp.addDepartamento(departamento);

        // Crear un Profesor
        Profesor profesor1 = new Profesor("Profesor 1", "Matemáticas", departamento);
        Profesor profesor2 = new Profesor("Profesor 2", "Informática", departamento);

        // Añadir Profesores al Departamento
        departamento.addProfesor(profesor1);
        departamento.addProfesor(profesor2);

        // Crear un Estudiante
        Estudiante estudiante = new Estudiante("Estudiante 1", 1, cpifp);

        // Crear un Módulo
        Modulo modulo = new Modulo("Programación", 1, departamento);

        // Añadir Estudiante al Módulo
        modulo.getEstudiantes().add(estudiante);

        // Mostrar información
        System.out.println("Información del CPIFP:");
        System.out.println("Nombre del CPIFP: " + cpifp.getNombre());
        System.out.println("Dirección del CPIFP: " + cpifp.getDireccion());
        System.out.println("Teléfono del CPIFP: " + cpifp.getTelefono());
        System.out.println("Departamentos del CPIFP: " + cpifp.getDepartamentos());

        System.out.println("\nInformación del Departamento:");
        System.out.println("Nombre del Departamento: " + departamento.getNombre());
        System.out.println("Profesores del Departamento: " + departamento.getProfesores());
        System.out.println("Jefe del Departamento: " + departamento.getJefeDepartamento());

        System.out.println("\nInformación del Profesor:");
        System.out.println("Nombre del Profesor: " + profesor1.getNombre());
        System.out.println("Especialidad del Profesor: " + profesor1.getEspecialidad());
        System.out.println("Departamento del Profesor: " + profesor1.getDepartamento());

        System.out.println("\nInformación del Estudiante:");
        System.out.println("Nombre del Estudiante: " + estudiante.getNombre());
        System.out.println("Identificador del Estudiante: " + estudiante.getIdentificador());
        System.out.println("CPIFP del Estudiante: " + estudiante.getCpifp());
        System.out.println("Módulos del Estudiante: " + estudiante.getModulos());

        System.out.println("\nInformación del Módulo:");
        System.out.println("Nombre del Módulo: " + modulo.getNombre());
        System.out.println("Identificador del Módulo: " + modulo.getIdentificador());
        System.out.println("Departamento del Módulo: " + modulo.getDepartamento());
        System.out.println("Estudiantes del Módulo: " + modulo.getEstudiantes());
        System.out.println("Profesores del Módulo: " + modulo.getProfesores());
    }
}
