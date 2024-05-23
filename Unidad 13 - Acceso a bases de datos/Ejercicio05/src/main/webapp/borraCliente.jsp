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

        // Elimina el cliente con el clienteid proporcionado
        s.execute("DELETE FROM cliente WHERE clienteid=" + request.getParameter("clienteid"));

        // Cierra la conexión con la base de datos
        conexion.close();
    %>
    <script>document.location = "index.jsp";</script>
</body>
</html>
