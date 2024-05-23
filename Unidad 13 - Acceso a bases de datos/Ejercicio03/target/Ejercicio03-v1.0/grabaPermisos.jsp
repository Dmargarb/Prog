<%@page import="java.util.Vector"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
    <%
        // Establece la conexión con la base de datos
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/control de acceso", "root", "");
        Statement s = conexion.createStatement();

        // Establece la codificación de caracteres para la solicitud HTTP
        request.setCharacterEncoding("UTF-8");
        
        // Elimina todos los permisos existentes para el usuario
        s.execute("DELETE FROM permisos WHERE id='" + request.getParameter("usuario") + "'");
        
        // Inserta los nuevos permisos seleccionados para el usuario
        for(int i = 1; i < 21; i++) {
            if(request.getParameter("ejer" + i) != null) {
                s.execute("INSERT INTO permisos VALUES ('" + request.getParameter("usuario") + "', " + i + ")");
            }
        }
        conexion.close(); // Cierra la conexión con la base de datos
    %>
    <script>document.location = "gestionUsuarios.jsp"</script> <!-- Redirige de vuelta a la página de gestión de usuarios -->
</body>
</html>
