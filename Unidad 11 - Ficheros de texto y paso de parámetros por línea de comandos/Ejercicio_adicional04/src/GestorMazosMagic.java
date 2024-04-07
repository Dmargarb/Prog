import java.util.ArrayList;
import java.util.Scanner;

public class GestorMazosMagic {
    public static void main(String[] args) {

        String file = "magic.data";
        boolean salir = false;
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                Mazos mazos = new Mazos(file);
                System.out.println("\n*** Base de datos de Mazos de Magic v1.0 ***\n");
                System.out.println("|------------------------------------------|");
                System.out.println("| 1. Listar los datos de todos los mazos   |");
                System.out.println("|------------------------------------------|");
                System.out.println("| 2. Listar los nombres de todos los mazos |");
                System.out.println("|------------------------------------------|");
                System.out.println("| 3. Mostrar un mazo aleatorio             |");
                System.out.println("|------------------------------------------|");
                System.out.println("| 4. Filtrar mazos                         |");
                System.out.println("|------------------------------------------|");
                System.out.println("| 5. Consultar un mazo                     |");
                System.out.println("|------------------------------------------|");
                System.out.println("| 6. Añadir un mazo                        |");
                System.out.println("|------------------------------------------|");
                System.out.println("| 7. Actualizar un mazo                    |");
                System.out.println("|------------------------------------------|");
                System.out.println("| 8. Borrar un mazo                        |");
                System.out.println("|------------------------------------------|");
                System.out.println("| 9. Restablecer la lista a por defecto    |");
                System.out.println("|------------------------------------------|");
                System.out.println("| 10. Salir                                |");
                System.out.println("|------------------------------------------|\n");
                System.out.print("Opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("\n=== Datos de todos los mazos ===\n");
                        ArrayList<Mazo> todosLosMazos = mazos.getListaMazos();
                        int numeroMazos = todosLosMazos.size();
                        System.out.println("Tienes " + numeroMazos + " mazos:\n");
                        for (Mazo mazo : todosLosMazos) {
                            System.out.println(mazo.toString() + "\n");
                        }
                        break;
                    case 2:
                        System.out.println("\n=== Listado de todos los mazos ===\n");
                        ArrayList<String> nombres = mazos.listaNombres();
                        int total = nombres.size();
                        for (int i = 0; i < total; i++) {
                            String nombre = nombres.get(i);
                            if (i < total - 2) {
                                System.out.print(nombre + ", ");
                            } else if (i == total - 2) {
                                System.out.print(nombre + " y ");
                            } else {
                                System.out.print(nombre + ".");
                            }
                        }
                        System.out.println("");
                        break;
                    case 3:
                        if (mazos.getListaMazos().isEmpty()) {
                            System.out.println("\nNo hay mazos disponibles.");
                        } else {
                            int indiceAleatorio = (int) (Math.random() * mazos.getListaMazos().size());
                            Mazo mazoAleatorio = mazos.getListaMazos().get(indiceAleatorio);
                            System.out.println("\n=== Mazo Aleatorio ===\n");
                            System.out.println(mazoAleatorio.toString());
                        }
                        break;
                    case 4:
                        System.out.println("\nFiltrar mazos por:\n");
                        System.out.println("|-------------|");
                        System.out.println("| 1. Color    |");
                        System.out.println("|-------------|");
                        System.out.println("| 2. Destino  |");
                        System.out.println("|-------------|");
                        System.out.println("| 3. Tipo     |");
                        System.out.println("|-------------|\n");
                        System.out.print("Opción: ");
                        int opcionFiltro = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcionFiltro) {
                            case 1:
                                System.out.print("\nElija el color (Blanco, Rojo, Verde, Azul o Negro): ");
                                String color = scanner.nextLine();
                                ArrayList<Mazo> mazosPorColor = mazos.filtrarPorColor(color);
                                if (!mazosPorColor.isEmpty()) {
                                    int colorEncontrados = mazosPorColor.size();
                                    System.out.println("\nSe han encontrado " + colorEncontrados + " mazos con color '"
                                            + color + "':\n");
                                    for (Mazo mazo : mazosPorColor) {
                                        System.out.println(mazo.toString() + "\n");
                                    }
                                } else {
                                    System.out.println("\nNo se encontraron mazos con el color '" + color + "'.");
                                }
                                break;
                            case 2:
                                System.out.print(
                                        "\nElija el destino (Gigante de 2 Cabezas, Independiente, Tri-Deck, Pauper, Masivo o Commander): ");
                                String destino = scanner.nextLine();
                                ArrayList<Mazo> mazosPorDestino = mazos.filtrarPorDestino(destino);
                                if (!mazosPorDestino.isEmpty()) {
                                    int destinosEncontrados = mazosPorDestino.size();
                                    System.out.println("\nSe han encontrado " + destinosEncontrados
                                            + " mazos destinados a '" + destino + "':\n");
                                    for (Mazo mazo : mazosPorDestino) {
                                        System.out.println(mazo.toString() + "\n");
                                    }
                                } else {
                                    System.out.println("\nNo se encontraron mazos destinados a '" + destino + "'.");
                                }
                                break;
                            case 3:
                                System.out.print(
                                        "\nElija el tipo (Aggro, Control, Combo, Tribal, Aggro Control o Rampeo): ");
                                String tipo = scanner.nextLine();
                                ArrayList<Mazo> mazosPorTipo = mazos.filtrarPorTipo(tipo);
                                if (!mazosPorTipo.isEmpty()) {
                                    int tiposEncontrados = mazosPorTipo.size();
                                    System.out.println("\nSe han encontrado " + tiposEncontrados + " mazos del tipo '"
                                            + tipo + "':\n");
                                    for (Mazo mazo : mazosPorTipo) {
                                        System.out.println(mazo.toString() + "\n");
                                    }
                                } else {
                                    System.out.println("\nNo se encontraron mazos del tipo '" + tipo + "'.");
                                }
                                break;
                            default:
                                System.out.println("\nOpción no válida...");
                                break;
                        }
                        break;
                    case 5:
                        System.out.print("\nIngrese el nombre del mazo a consultar: ");
                        String nombreConsulta = scanner.nextLine();
                        Mazo mazoConsultado = mazos.solicitarUno(nombreConsulta);
                        if (mazoConsultado != null) {
                            System.out.println("\n" + mazoConsultado.toString());
                        }
                        break;
                    case 6:
                        System.out.println("\n=== Añadir un nuevo mazo ===\n");
                        System.out.print("Nombre del mazo: ");
                        String nombreNuevo = scanner.nextLine();
                        System.out.print("Colores del mazo: ");
                        String coloresNuevo = scanner.nextLine();
                        System.out.print("Destinado a: ");
                        String destinadoNuevo = scanner.nextLine();
                        System.out.print("Tipo del mazo: ");
                        String tipoNuevo = scanner.nextLine();
                        Mazo nuevoMazo = new Mazo(nombreNuevo, coloresNuevo, destinadoNuevo, tipoNuevo);
                        Mazo mazoAgregado = mazos.anadir(nuevoMazo);
                        if (mazoAgregado != null) {
                            System.out.println("\nMazo añadido correctamente");
                            System.out.println("\n" + mazoAgregado.toString());
                        }
                        break;
                    case 7:
                        System.out.print("\nIngrese el nombre del mazo a actualizar: ");
                        String nombreActualizar = scanner.nextLine();
                        Mazo mazoExistente = mazos.solicitarUno(nombreActualizar);
                        if (mazoExistente != null) {
                            System.out.println("Ingrese los nuevos datos del mazo:\n");
                            System.out.print("Colores del mazo: ");
                            String nuevosColores = scanner.nextLine();
                            System.out.print("Destinado a: ");
                            String nuevoDestinado = scanner.nextLine();
                            System.out.print("Tipo del mazo: ");
                            String nuevoTipo = scanner.nextLine();
                            mazoExistente.setColores(nuevosColores);
                            mazoExistente.setDestinado(nuevoDestinado);
                            mazoExistente.setTipo(nuevoTipo);
                            Mazo mazoActualizado = mazos.actualizar(nombreActualizar, mazoExistente);
                            if (mazoActualizado != null) {
                                System.out.println("\nMazo actualizado correctamente");
                                System.out.println("\n" + mazoActualizado.toString());
                            }
                        }
                        break;
                    case 8:
                        System.out.print("\nIngrese el nombre del mazo a borrar: ");
                        String nombreBorrar = scanner.nextLine();
                        Mazo mazoBorrado = mazos.borrar(nombreBorrar);
                        if (mazoBorrado != null) {
                            System.out.println("Mazo borrado");
                            System.out.println("\n" + mazoBorrado.toString());
                        }
                        break;
                    case 9:
                        mazos.restablecerListaPorDefecto();
                        break;
                    case 10:
                        salir = true;
                        break;
                    default:
                        System.out.println("\nPor favor, elija una opción válida...");
                        break;
                }
            } catch (Exception e) {
                System.out.println("\nError, algo salió mal...");
                scanner.nextLine();
            }

        } while (!salir);

        scanner.close();
        System.out.println("\n¡Hasta luego!");
    }
}
