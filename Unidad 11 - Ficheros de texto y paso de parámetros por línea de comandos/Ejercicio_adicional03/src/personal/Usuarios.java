package personal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Usuarios implements CRUD<Usuario> {
    private String file;
    private int nextId;

    public Usuarios(String file) throws Exception {

        this.file = file;
        this.nextId = 0;
        File _file = new File(file);
        if (!_file.exists())
            _file.createNewFile();

        // Solicitamos los usuarios que hay
        ArrayList<Usuario> usuarios = solicitarTodos();

        // Si la lista no está vacía
        if (usuarios.size()>0) {
            // Actualizamos el nextId con el correspondiente siguiente
            // Primero obtenemos el último usuario de lista
            // Luego obtenemos su id y le sumamos 1 y lo guardamos en nextId
            this.nextId = usuarios.get(usuarios.size() - 1).getId() + 1;
        } else {
            // Sino, es el primero en crearse
            this.nextId = 1;
        }
    }

    public String getFile() {
        return file;
    }

    @Override
    public ArrayList<Usuario> solicitarTodos() {

        // Creamos la lista vacía
        ArrayList<Usuario> usuarios = new ArrayList<>();

        // Intentamos leer el archivo
        try {
            // Iniciamos la lectura del archivo
            BufferedReader br = new BufferedReader(new FileReader(file));

            String linea = "";
            Usuario usuarioNuevo;

            // Mientras haya líneas que leer, sigue leyendo
            while ((linea = br.readLine()) != null) {
        
                // Creamos el usuario con los datos leídos
                usuarioNuevo = new Usuario(linea);
                // Añadimos a la lista el usuario creado
                usuarios.add(usuarioNuevo);
            }

            // Cerramos el buffer
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo " + file);
        } catch (IOException e) {
            System.out.println("No se puede leer el archivo " + file);
        }

        return usuarios;
    }

    @Override
    public Usuario solicitarUno(int id) {

        // Obtenemos la lista
        ArrayList<Usuario> usuarios = solicitarTodos();

        // Buscamos en la lista
        for (Usuario u : usuarios) {
            // Si la id del usuario coincide con la indicada
            if (u.getId() == id) {
                // Se devuelve ese usuario (el que se buscaba)
                return u;
            }
        }

        return null;
    }

    @Override
    public Usuario anadir(Usuario datos) {

        // Obtenemos la lista de todos los usuarios
        ArrayList<Usuario> usuarios = solicitarTodos();

        // Buscamos en la lista si ya existe un usuario con el mismo email
        for (Usuario u : usuarios) {
            // Si es el mismo email, se devuelve null y no se añade
            if (u.getEmail().equals(datos.getEmail())) {
                return null;
            }
        }

        // Establecemos como id del usuario el nextId que hay
        datos.setId(nextId);
        // Actualizamos nextId
        nextId++;

        try {
            // Iniciamos la escritura en el fichero
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            // Escribimos los datos
            bw.write(datos.serializar());
            // Bajamos una línea
            bw.newLine();
            // Cerramos el buffer
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo " + file);
        } catch (IOException e) {
            System.out.println("No se puede leer el archivo " + file);
        }

        // Devolvemos el mismo usuario si salió con éxito
        return datos;
    }

    @Override
    public Usuario actualizar(int id, Usuario data) {

        // Obtenemos la lista de usuarios
        ArrayList<Usuario> usuarios = solicitarTodos();

        // Control para dejar de avanzar en el bucle si se actualizó el archivo
        boolean actualizado = false;

        // Buscamos en la lista
        for (int i = 0; i < usuarios.size() && !actualizado; i++) {

            // Comparamos el id indicado con el del usuario i de la lista
            if (usuarios.get(i).getId() == id) {

                // Para dejar de iterar después del proceso de actualizar
                actualizado = true;

                // Actualizamos el id del usuario que vamos a insertar con el de la lista
                data.setId(id);

                // Obtenemos el archivo de usuarios y los volvemos temporal
                File temporal = new File(file);
                temporal.renameTo(new File(file + ".tmp"));

                try {
                    BufferedReader br = new BufferedReader(new FileReader(file + ".tmp"));
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file));

                    String linea = "";
                    Usuario usuarioNuevo;

                    // Mientras haya líneas que leer, sigue leyendo
                    while ((linea = br.readLine()) != null) {
                
                        // Creamos el usuario con los datos leídos
                        usuarioNuevo = new Usuario(linea);

                        // Si es el id del usuario a actualizar, cambiamos a que sea ese el que se va a
                        // escribir
                        if (usuarioNuevo.getId() == data.getId()) {
                            usuarioNuevo = data;
                        }

                        // Escribimos el usuario
                        bw.write(usuarioNuevo.serializar());
                        bw.newLine();

                    }

                    br.close();
                    bw.close();

                    // Borramos archivo temporal
                    (new File(file + ".tmp")).delete();

                    return data;

                } catch (FileNotFoundException e) {
                    System.out.println("No se encuentra el archivo " + file + " o " + file + ".tmp");
                } catch (IOException e) {
                    System.out.println("No se puede leer el archivo " + file + " o " + file + ".tmp");
                }

            }
        }

        return null;
    }

    @Override
    public Usuario borrar(int id) {

        // Obtenemos la lista de usuarios
        ArrayList<Usuario> usuarios = solicitarTodos();

        // Control para dejar de avanzar en el bucle si se actualizó el archivo
        boolean borrado = false;

        // Buscamos en la lista
        for (int i = 0; i < usuarios.size() && !borrado; i++) {

            // Comparamos el id indicado con el del usuario i de la lista
            if (usuarios.get(i).getId() == id) {

                Usuario usuarioBorrado = usuarios.get(i);

                // Para dejar de iterar después del proceso de actualizar
                borrado = true;

                // Obtenemos el archivo de usuarios y los volvemos temporal
                File temporal = new File(file);
                temporal.renameTo(new File(file + ".tmp"));

                try {
                    BufferedReader br = new BufferedReader(new FileReader(file + ".tmp"));
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file));

                    String linea = "";
                    Usuario usuario;

                    // Mientras haya líneas que leer, sigue leyendo
                    while ((linea = br.readLine()) != null) {
                        
                        // Creamos el usuario con los datos leídos
                        usuario = new Usuario(linea);

                        // Si no es el id del usuario a borrar
                        if (usuario.getId() != id) {
                            // Escribimos el usuario
                            bw.write(usuario.serializar());
                            bw.newLine();
                        }

                    }

                    br.close();
                    bw.close();
                    
                    // Borramos archivo temporal
                    (new File(file + ".tmp")).delete();

                    return usuarioBorrado;

                } catch (FileNotFoundException e) {
                    System.out.println("No se encuentra el archivo " + file + " o " + file + ".tmp");
                } catch (IOException e) {
                    System.out.println("No se puede leer el archivo " + file + " o " + file + ".tmp");
                }

            }
        }

        return null;
    }
}
