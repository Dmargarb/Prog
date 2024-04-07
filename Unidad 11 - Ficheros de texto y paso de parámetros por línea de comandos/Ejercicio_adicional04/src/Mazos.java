import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Mazos {

    private String file;
    private ArrayList<Mazo> listaMazos;
    private ArrayList<String> listaNombres;

    public Mazos(String file) throws Exception {
        this.file = file;
        this.listaMazos = solicitarTodos();
        this.listaNombres = solicitarNombres();
        File _file = new File(file);
        if (!_file.exists())
            _file.createNewFile();
    }

    public String getFile() {
        return file;
    }

    public ArrayList<Mazo> getListaMazos() {
        return listaMazos;
    }

    public ArrayList<String> listaNombres() {
        return listaNombres;
    }

    public ArrayList<Mazo> solicitarTodos() {
        listaMazos = new ArrayList<Mazo>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String linea = "";
            Mazo nuevoMazo;

            while ((linea = br.readLine()) != null) {
                nuevoMazo = new Mazo(linea);
                listaMazos.add(nuevoMazo);
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo " + file);
        } catch (IOException e) {
            System.out.println("No se puede leer el archivo " + file);
        }

        return listaMazos;
    }

    public ArrayList<String> solicitarNombres() {
        listaNombres = new ArrayList<String>();

        for (Mazo m : listaMazos) {
            listaNombres.add(m.getNombre());
        }
        return listaNombres;
    }

    public Mazo solicitarUno(String nombre) {
        for (Mazo m : listaMazos) {
            if (m.getNombre().equals(nombre)) {
                return m;
            }
        }
        System.out.println("El mazo no existe");
        return null;
    }

    public Mazo anadir(Mazo datos) {
        for (Mazo m : listaMazos) {
            if (m.getNombre().equals(datos.getNombre())) {
                System.out.println("Ya existe ese mazo");
                return null;
            }
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.write(datos.serializar());
            bw.newLine();
            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo " + file);
        } catch (IOException e) {
            System.out.println("No se puede leer el archivo " + file);
        }

        return datos;
    }

    public Mazo actualizar(String nombre, Mazo data) {
        boolean actualizado = false;

        for (int i = 0; i < listaMazos.size() && !actualizado; i++) {

            if (listaMazos.get(i).getNombre().equals(nombre)) {
                actualizado = true;

                File temporal = new File(file);
                temporal.renameTo(new File(file + ".tmp"));

                try {
                    BufferedReader br = new BufferedReader(new FileReader(file + ".tmp"));
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file));

                    String linea = "";
                    Mazo nuevoMazo;

                    while ((linea = br.readLine()) != null) {

                        nuevoMazo = new Mazo(linea);

                        if (nuevoMazo.getNombre().equals(data.getNombre())) {
                            nuevoMazo = data;
                        }

                        bw.write(nuevoMazo.serializar());
                        bw.newLine();
                    }

                    br.close();
                    bw.close();

                    (new File(file + ".tmp")).delete();

                    return data;

                } catch (FileNotFoundException e) {
                    System.out.println("No se encuentra el archivo " + file + " o " + file + ".tmp");
                } catch (IOException e) {
                    System.out.println("No se puede leer el archivo " + file + " o " + file + ".tmp");
                }

            }
        }

        System.out.println("El mazo no existe");
        return null;
    }

    public Mazo borrar(String nombre) {
        boolean borrado = false;

        for (int i = 0; i < listaMazos.size() && !borrado; i++) {

            if (listaMazos.get(i).getNombre().equals(nombre)) {

                Mazo mazoBorrado = listaMazos.get(i);
                borrado = true;

                File temporal = new File(file);
                temporal.renameTo(new File(file + ".tmp"));

                try {
                    BufferedReader br = new BufferedReader(new FileReader(file + ".tmp"));
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file));

                    String linea = "";
                    Mazo mazo;

                    while ((linea = br.readLine()) != null) {

                        mazo = new Mazo(linea);

                        if (!mazo.getNombre().equals(nombre)) {
                            bw.write(mazo.serializar());
                            bw.newLine();
                        }
                    }

                    br.close();
                    bw.close();

                    (new File(file + ".tmp")).delete();

                    return mazoBorrado;

                } catch (FileNotFoundException e) {
                    System.out.println("No se encuentra el archivo " + file + " o " + file + ".tmp");
                } catch (IOException e) {
                    System.out.println("No se puede leer el archivo " + file + " o " + file + ".tmp");
                }

            }
        }

        System.out.println("El mazo no existe");
        return null;
    }

    public void restablecerListaPorDefecto() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("magic.data.backup"));
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }

            br.close();
            bw.close();

            this.solicitarTodos();

            System.out.println("\nLista restablecida a la versión por defecto.");

        } catch (FileNotFoundException e) {
            System.out.println("\nNo se encontró el archivo de respaldo 'magic.data.backup'.");
        } catch (IOException e) {
            System.out.println("\nError al leer o escribir en los archivos.");
        }
    }

    public ArrayList<Mazo> filtrarPorColor(String color) {
        ArrayList<Mazo> mazosFiltrados = new ArrayList<>();

        for (Mazo mazo : listaMazos) {
            if (mazo.getColores().toLowerCase().contains(color.toLowerCase())) {
                mazosFiltrados.add(mazo);
            }
        }

        return mazosFiltrados;
    }

    public ArrayList<Mazo> filtrarPorDestino(String destino) {
        ArrayList<Mazo> mazosFiltrados = new ArrayList<>();

        for (Mazo mazo : listaMazos) {
            if (mazo.getDestinado().equalsIgnoreCase(destino)) {
                mazosFiltrados.add(mazo);
            }
        }

        return mazosFiltrados;
    }

    public ArrayList<Mazo> filtrarPorTipo(String tipo) {
        ArrayList<Mazo> mazosFiltrados = new ArrayList<>();

        for (Mazo mazo : listaMazos) {
            if (mazo.getTipo().toLowerCase().contains(tipo.toLowerCase())) {
                mazosFiltrados.add(mazo);
            }
        }

        return mazosFiltrados;
    }

}