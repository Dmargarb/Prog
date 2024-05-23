<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestión de usuarios</title>
    </head>
    <body>
        <%
        // Establece la conexión con la base de datos
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/control de acceso","root", "");
        Statement s = conexion.createStatement();
        
        // Establece la codificación de caracteres para la solicitud HTTP
        request.setCharacterEncoding("UTF-8");
        
        // Consulta SQL para verificar si el usuario ya existe en la base de datos
        String consulta = "SELECT COUNT(*) FROM usuarios WHERE id='"
                          + request.getParameter("usuario")
                          + "'";
        
        // Ejecuta la consulta SQL
        ResultSet coincidencias = s.executeQuery(consulta);
        coincidencias.next();
        
        String mensaje;
        String enlace;
        
        // Verifica si ya existe un usuario con el mismo nombre
        if (coincidencias.getInt(1) != 0) {
          mensaje = "<p>Lo siento, el usuario " + request.getParameter("usuario") + " ya existe.</p>";
          enlace = "gestionUsuarios.jsp"; // Enlace para volver a la página de gestión de usuarios
        } else {
          // Si el usuario no existe, se realiza la inserción en la base de datos
          String insercion = "INSERT INTO usuarios VALUES ('"
                            + request.getParameter("usuario")
                            + "', '" + request.getParameter("clave") + "')";
          s.execute(insercion);         
          conexion.close(); // Cierra la conexión con la base de datos
          mensaje = "<p>El usuario " + request.getParameter("usuario") + " se ha registrado correctamente.</p>";
          enlace = "index.jsp"; // Enlace para volver a la página de inicio
      }
      %>
        <h1>Gestión de usuarios</h1>
        <%=mensaje %> <!-- Muestra el mensaje de registro exitoso o de usuario existente -->
        <a href="<%=enlace %>"><button>Aceptar</button></a> <!-- Botón de aceptar que redirige al usuario según el enlace generado -->
    </body>
</html>
