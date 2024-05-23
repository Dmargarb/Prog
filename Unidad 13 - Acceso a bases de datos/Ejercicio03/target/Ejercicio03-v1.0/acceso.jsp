<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Control de acceso</title>
    </head>

    <body>
        <% 
            // Establece la conexión con la base de datos
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/control de acceso","root", "");
            Statement s = conexion.createStatement();

            // Establece la codificación de caracteres para la solicitud HTTP
            request.setCharacterEncoding("UTF-8");

            // Consulta SQL para verificar las credenciales del usuario
            String consulta = "SELECT COUNT(*) FROM usuarios WHERE id='"
                                + request.getParameter("usuario")
                                + "' AND pass='"
                                + request.getParameter("clave")
                                + "'";

            // Ejecuta la consulta SQL
            ResultSet coincidencias = s.executeQuery(consulta);
            coincidencias.next();
    
            String mensaje;
            String enlace;
    
            // Verifica si hay coincidencias en la base de datos para las credenciales proporcionadas
            if (coincidencias.getInt(1) == 0) {
                mensaje = "<p>Lo siento, acceso denegado.</p>";
                enlace = "index.jsp"; // Enlace para volver a la página de inicio
            
            } else if (request.getParameter("usuario").equals("admin")) {
                mensaje = "<p>Tiene acceso al área de gestión de usuarios.</p>";
                enlace = "gestionUsuarios.jsp"; // Enlace para el área de gestión de usuarios
      
            } else {
                mensaje = "<p>Acceso permitido a sus aplicaciones.</p>";
                // Enlace para redirigir al usuario a la página de aplicaciones con su nombre de usuario
                enlace = "indexAplicaciones.jsp?usuario=" + request.getParameter("usuario");
            }
        %>
        <h1>Control de acceso</h1>
        <%=mensaje %> <!-- Muestra el mensaje de acceso permitido o denegado -->
        <a href="<%=enlace %>"><button>Aceptar</button></a> <!-- Botón de aceptar que redirige al usuario según el enlace generado -->
    </body>
</html>
