<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
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
        Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/banco","root", "");
        Statement s = conexion.createStatement();

        request.setCharacterEncoding("UTF-8");

        // Comprueba si el clienteid ya existe
        String consulta = "SELECT COUNT(*) FROM cliente WHERE clienteid='"
                        + request.getParameter("clienteid")
                        + "'";

        ResultSet coincidencias = s.executeQuery(consulta);
        coincidencias.next();

        // Si el clienteid ya existe, muestra un mensaje de alerta y redirige a la página principal
        if (coincidencias.getInt(1) != 0) {
            out.print("<script type=\"text/javascript\">alert(\"Lo siento, el código " + request.getParameter("clienteid") + " ya existe\");</script>");
            out.print("<script>document.location = \"index.jsp\"</script>");
        } else {
            // Si el clienteid no existe, inserta los datos en la base de datos
            String insercion = "INSERT INTO cliente VALUES ('"
                            + request.getParameter("clienteid")
                            + "', '" + request.getParameter("nombre")
                            + "', '" + request.getParameter("direccion")
                            + "', '" + request.getParameter("telefono")
                            + "', '" + request.getParameter("nacimiento") + "')";
            s.execute(insercion); // Ejecuta la inserción
            conexion.close(); // Cierra la conexión con la base de datos
        }
    %>
    <script>document.location = "index.jsp";</script> <!-- Redirige a la página principal -->
</body>
</html>
