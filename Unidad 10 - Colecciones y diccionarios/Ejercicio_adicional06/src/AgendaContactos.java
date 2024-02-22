import java.util.ArrayList;
import java.util.HashMap;

public class AgendaContactos {
    public static void main(String[] args) {

        // Crear un ArrayList para almacenar los contactos
        ArrayList<HashMap<String, String>> agenda = new ArrayList<HashMap<String, String>>();

        // Agregar contactos a la agenda
        HashMap<String, String> contacto1 = new HashMap<String, String>();
        contacto1.put("nombre", "Juan");
        contacto1.put("telefono", "123456789");
        agenda.add(contacto1);

        HashMap<String, String> contacto2 = new HashMap<String, String>();
        contacto2.put("nombre", "María");
        contacto2.put("telefono", "987654321");
        agenda.add(contacto2);

        HashMap<String, String> contacto3 = new HashMap<String, String>();
        contacto3.put("nombre", "Pedro");
        contacto3.put("telefono", "555555555");
        agenda.add(contacto3);

        // Mostrar la agenda de contactos
        System.out.println("Agenda de Contactos:");
        for (HashMap<String, String> contacto : agenda) {
            System.out.println("Nombre: " + contacto.get("nombre") +
                    ", Teléfono: " + contacto.get("telefono"));
        }
    }
}
