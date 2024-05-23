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
    Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/banco","root", "");
    Statement s = conexion.createStatement();

    // Establece la codificación de caracteres para la solicitud HTTP
    request.setCharacterEncoding("UTF-8");

    // Actualiza los datos del cliente en la base de datos
    s.execute("UPDATE cliente SET nombre='" + request.getParameter("nombre") + "', direccion='" + request.getParameter("direccion") + "', telefono='" + request.getParameter("telefono") + "', nacimiento='" + request.getParameter("nacimiento") + "' WHERE clienteid=" + request.getParameter("clienteid"));

    // Cierra la conexión con la base de datos
    conexion.close();
%>
<script>document.location = "index.jsp";</script>
</body>
</html>
