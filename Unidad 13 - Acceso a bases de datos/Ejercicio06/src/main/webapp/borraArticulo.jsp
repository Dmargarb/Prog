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
    // Establece la codificación de caracteres para la solicitud HTTP
    request.setCharacterEncoding("UTF-8");

    // Carga el controlador de la base de datos
    Class.forName("org.mariadb.jdbc.Driver");

    // Establece la conexión con la base de datos
    Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gestisimal", "root", "");
    Statement s = conexion.createStatement();

    // Elimina el artículo de la base de datos
    String codigo = request.getParameter("codigo");
    s.execute("DELETE FROM articulo WHERE codigo='" + codigo + "'");

    // Cierra la conexión con la base de datos
    conexion.close();
%>
<script>document.location = "index.jsp";</script>
</body>
</html>
