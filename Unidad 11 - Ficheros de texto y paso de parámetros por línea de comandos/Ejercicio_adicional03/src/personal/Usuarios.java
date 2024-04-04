package personal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Usuarios implements CRUD<Usuario>{
    private String file;
    private int nextId;
    
    public Usuarios(String file) throws Exception{
        this.file = file;
        this.nextId = 0;
        File _file = new File(file);
        if(!_file.exists())
            _file.createNewFile();

        // tienes que leer el archivo para obtener el siguiente id disponible...
        // nextId almacena el siguiente id a configurar para cuando se añada un nuevo usuario
        // Por ejempo: Si tienes x usuarios y el último es el usuario 8 entonces nextId debe valer 9
        // Podrías hacer uso de la función solicitarTodos "es solo una sugerencia"

        // Obtenemos todos los usuarios que existen
        ArrayList<Usuario> listaUsuarios = solicitarTodos();

        // Si la lista no está vacía
        if (listaUsuarios.size()>0) {

            // Se actualiza el nextId con el siguiente disponible
            this.nextId = listaUsuarios.get(listaUsuarios.size() - 1).getId() + 1;
    
        // Si está vacía
        } else {
            this.nextId = 1;
        }
    }
    
    public String getFile() {
        return file;
    }

    @Override
    public ArrayList<Usuario> solicitarTodos() {
        //  Tienes que devolver un ArrayList conteniendo todos los usuarios del archivo


        // Creamos la lista vacía de usuarios
        ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();

        // Se intenta leer el archivo
        try {

            // Se inicia la lectura del archivo
            BufferedReader br = new BufferedReader(new FileReader(file));

            String linea = "";
            Usuario nuevoUsuario;

            // Sigue leyendo hasta que no queden líneas por leer
            while ((linea = br.readLine()) != null) {
        
                // Se crea el usuario con los datos leídos
                nuevoUsuario = new Usuario(linea);
                // Se añade a la lista el nuevo usuario creado
                listaUsuarios.add(nuevoUsuario);
            }
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo " + file);
        } catch (IOException e) {
            System.out.println("No se puede leer el archivo " + file);
        }

        return listaUsuarios;
    }

    @Override
    public Usuario solicitarUno(int id){
        // Tienes que poder buscar en el archivo al usuario cuyo id se suministra
        // y devolver un objeto Usuario
        // si el usuario no está debe devolver null


        // Obtenemos la lista de usuarios
        ArrayList<Usuario> listaUsuarios = solicitarTodos();

        // Buscamos en la lista el usuario específico
        for (Usuario u : listaUsuarios) {
            // Si la id del usuario coincide con el que se suministra
            if (u.getId() == id) {
                // Se devuelven los datos del usuario que se busca
                return u;
            }
        }

        // Se devuelve null si el usuario no existe
        return null;
    }

    @Override
    public Usuario anadir(Usuario datos) {
       // Tienes que poder añadir un usuario al archivo
       // Debes comprobar que el usuario no existe (no puede haber dos usuarios con el mismo email)
       // En el caso de que ya existiera debe devolver un null
       // Si el usuario no existe entonces podemos añadir al usuario
       // Para que puedas añadir al usuario al final del archivo debes pasar un true cuando llames
       // al constructor de new FileWriter(nombre, true)


        // Obtenemos la lista de usuarios
        ArrayList<Usuario> listaUsuarios = solicitarTodos();

        // Buscamos en la lista si existe un usuario con el mismo email
        for (Usuario u : listaUsuarios) {
            if (u.getEmail().equals(datos.getEmail())) {
                // Si el email es el mismo, devuelve null
                return null;
            }
        }

        // Se establece el id del usuario con el nextId
        datos.setId(nextId);
        // Se actualiza el nextId
        nextId++;

        try {
            // Se inicia la escritura en el fichero
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.write(datos.serializar());
            bw.newLine();
            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo " + file);
        } catch (IOException e) {
            System.out.println("No se puede leer el archivo " + file);
        }

        // Se devuelve el usuario
        return datos;
    }

    @Override
    public Usuario actualizar(int id, Usuario data){
        // Tienes que devolver los datos del usuario actualizados
        // Devolverá null si el usuario no existe en el fichero (si no se encuentra ese id)
        // Si el usuario se encuentra en el archivo entonces modificamos ese usuario en esa posición
        // del archivo.
        // Ayuda: Tienes que renombrar el archivo original añadiéndole .tmp al final
        // Luego abres en modo lectura el archivo temporal y abres en modo escritura el archivo original
        // Vas escribiendo las líneas del archivo temporal y cuando llegues al usaurio que quieres 
        // modificar escribes los datos de ese usuario
        // Sigue hasta que consumas todas las líneas del archivo temporal
        // Al final del proceso debes borrar el archivo temporal
        // Con esto habrás modificado los datos de ese usuario 


        // Obtenemos la lista de usuarios
        ArrayList<Usuario> listaUsuarios = solicitarTodos();

        // Boolean para controlar si se actualizó el archivo
        boolean actualizado = false;

        // Bucle de la lista de usuarios
        for (int i = 0; i < listaUsuarios.size() && !actualizado; i++) {

            // Se comprueba que coincida el id del usuario
            if (listaUsuarios.get(i).getId() == id) {

                actualizado = true;

                // Se actualiza el id del usuario
                data.setId(id);

                // Se crea el archivo de usuarios temporal
                File temporal = new File(file);
                temporal.renameTo(new File(file + ".tmp"));

                try {
                    BufferedReader br = new BufferedReader(new FileReader(file + ".tmp"));
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file));

                    String linea = "";
                    Usuario nuevoUsuario;

                    // Sigue leyendo hasta que no queden líneas por leer
                    while ((linea = br.readLine()) != null) {
                
                        // Se crea el usuario con los datos leídos
                        nuevoUsuario = new Usuario(linea);

                        // Con el id, se establece el usuario que se va a actualizar
                        if (nuevoUsuario.getId() == data.getId()) {
                            nuevoUsuario = data;
                        }

                        // Se escribe el usuario
                        bw.write(nuevoUsuario.serializar());
                        bw.newLine();
                    }

                    br.close();
                    bw.close();

                    // Se borra el archivo temporal
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
    public Usuario borrar(int id){
        // Tienes que devolver los datos del usuario borrado
        // Devolverá null si el usuario no existe en el fichero (si no se encuentra ese id)
        // Si el usuario se encuentra en el archivo entonces eliminamos esa línea del archivo
        // Ayuda: Tienes que renombrar el archivo original añadiéndole .tmp al final
        // Luego abres en modo lectura el archivo temporal y abres en modo escritura el archivo original
        // Vas escribiendo las líneas del archivo temporal y cuando llegues al usaurio que quieres 
        // borrar te saltas la escritura de esa línea
        // Sigue hasta que consumas todas las líneas del archivo temporal
        // Al final del proceso debes borrar el archivo temporal
        // Con esto habrás borrado al usuario


        // Obtenemos la lista de usuarios
        ArrayList<Usuario> listaUsuarios = solicitarTodos();

        // Boolean para controlar si se actualizó el archivo
        boolean borrado = false;

        // Bucle de la lista de usuarios
        for (int i = 0; i < listaUsuarios.size() && !borrado; i++) {

            // Se comprueba que coincida el id del usuario
            if (listaUsuarios.get(i).getId() == id) {

                Usuario usuarioBorrado = listaUsuarios.get(i);
                borrado = true;

                // Se crea el archivo de usuarios temporal
                File temporal = new File(file);
                temporal.renameTo(new File(file + ".tmp"));

                try {
                    BufferedReader br = new BufferedReader(new FileReader(file + ".tmp"));
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file));

                    String linea = "";
                    Usuario usuario;

                    // Sigue leyendo hasta que no queden líneas por leer
                    while ((linea = br.readLine()) != null) {
                        
                        // Se crea el usuario con los datos leídos
                        usuario = new Usuario(linea);

                        // Se ignora el usuario con el id especificado
                        if (usuario.getId() != id) {
                            // Se escribe el usuario
                            bw.write(usuario.serializar());
                            bw.newLine();
                        }
                    }

                    br.close();
                    bw.close();
                    
                    // Se borra el archivo temporal
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
