public class PruebaCPIFP {
    public static void main(String[] args) {

        // CPIFP
        CPIFP cpifp = new CPIFP("CPIFP Alan Turing", "Calle ejemplo, 02", 123456789);

        // Departamento
        Departamento departamento1 = new Departamento(cpifp, null, "Departamento1");
        Departamento departamento2 = new Departamento(cpifp, null, "Departamento2");
        Departamento departamento3 = new Departamento(cpifp, null, "Departamento3");

        // Estudiantes
        Estudiante estudiante1 = new Estudiante("Estudiante1", 1, cpifp);
        Estudiante estudiante2 = new Estudiante("Estudiante2", 2, cpifp);
        Estudiante estudiante3 = new Estudiante("Estudiante3", 3, cpifp);

        // Profesores
        Profesor jefeDepartamento = new Profesor("Profesor1", "Informática", departamento1);
        Profesor profesor2 = new Profesor("Profesor2", "Informática", departamento1);
        Profesor profesor3 = new Profesor("Profesor3", "Informática", departamento2);
        Profesor profesor4 = new Profesor("Profesor4", "Informática", departamento3);

        // Agregar el departamento al CPIFP
        cpifp.addDepartamento(departamento1);
        cpifp.addDepartamento(departamento2);
        cpifp.addDepartamento(departamento3);

        // Agregar profesores al departamento
        departamento1.addProfesor(jefeDepartamento);
        departamento1.addProfesor(profesor2);
        departamento2.addProfesor(profesor3);
        departamento3.addProfesor(profesor4);

        // Agregar el jefe del departamento
        departamento1.setJefeDepartamento(jefeDepartamento);

        // Agregar estudiantes al CPIFP
        cpifp.addEstudiante(estudiante1);
        cpifp.addEstudiante(estudiante2);
        cpifp.addEstudiante(estudiante3);

        // Obtener estudiantes
        System.out.println("Estudiantes del CPIFP:");
        for (Estudiante estudiante : cpifp.getEstudiantes()) {
            System.out.println(estudiante.getNombre());
        }

        // Obtener departamentos
        System.out.println("\nDepartamentos del CPIFP:");
        for (Departamento depto : cpifp.getDepartamentos()) {
            System.out.println(depto.getNombre());
        }

        // Obtener profesores
        System.out.println("\nProfesores del Departamento1:");
        for (Profesor profesor : departamento1.getProfesores()) {
            System.out.println(profesor.getNombre());
        }

        // Quitar un departamento del CPIFP
        cpifp.quitarDepartamento(departamento3);

        // Quitar un estudiante del CPIFP
        cpifp.quitarEstudiante(estudiante3);

        // Obtener departamentos después de haber eliminado uno
        System.out.println("\nEliminamos Departamento3");
        System.out.println("\nDepartamentos del CPIFP:");
        for (Departamento depto : cpifp.getDepartamentos()) {
            System.out.println(depto.getNombre());
        }

        // Obtener estudiantes después de haber eliminado uno
        System.out.println("\nEliminamos Estudiante3");
        System.out.println("\nEstudiantes del CPIFP:");
        for (Estudiante estudiante : cpifp.getEstudiantes()) {
            System.out.println(estudiante.getNombre());
        }

        // Verificar si un profesor está en el departamento
        System.out.print("\n¿Profesor2 está en el departamento1? " + departamento1.verificarProfesor(profesor2));

        // Quitar un profesor del departamento
        System.out.println("\n\nEliminamos Profesor2");
        departamento1.quitarProfesor(profesor2);

        // Verificar si un profesor está en el departamento
        System.out.print("\n¿Profesor2 está en el departamento1? " + departamento1.verificarProfesor(profesor2));

        // Obtener datos de un estudiante por su nombre
        String estudianteBuscar = "Estudiante1";
        Estudiante nombreDelEstudiante = cpifp.getEstudiante(estudianteBuscar);

        if (nombreDelEstudiante != null) {
            System.out.println("\n\nDatos del estudiante " + estudianteBuscar + ":");
            System.out.println("\nNombre: " + nombreDelEstudiante.getNombre());
            System.out.println("Identificador: " + nombreDelEstudiante.getIdentificador());
            System.out.println("CPIFP: " + nombreDelEstudiante.getCpifp().getNombreCpifp());
        } else {
            System.out.println("\n\nNo se encontró ningún estudiante con ese nombre.");
        }

        // Obtener datos de un departamento por su nombre
        String departamentoBuscar = "Departamento1";
        Departamento nombreDeldepartamento = cpifp.getDepartamento(departamentoBuscar);

        if (nombreDeldepartamento != null) {
            System.out.println("\nDatos del departamento " + departamentoBuscar + ":");
            System.out.println("\nNombre: " + nombreDeldepartamento.getNombre());
            System.out.println("CPIFP: " + nombreDeldepartamento.getCentro().getNombreCpifp());
            System.out.println("Jefe: " + nombreDeldepartamento.getJefeDepartamento().getNombre());
        } else {
            System.out.println("\nNo se encontró ningún departamento con ese nombre.");
        }

        // Obtener datos de un departamento por su nombre
        String profesorBuscar = "Profesor1";
        Profesor nombreDelprofesor = departamento1.getProfesor(profesorBuscar);

        if (nombreDelprofesor != null) {
            System.out.println("\nDatos del profesor " + profesorBuscar + ":");
            System.out.println("\nNombre: " + nombreDelprofesor.getNombre());
            System.out.println("Especialidad: " + nombreDelprofesor.getEspecialidad());
            System.out.println("Departamento: " + nombreDelprofesor.getDepartamento().getNombre());
        } else {
            System.out.println("\nNo se encontró ningún profesor con ese nombre.");
        }

    }
}
