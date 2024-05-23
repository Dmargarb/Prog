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

        // Consulta SQL para obtener los ejercicios a los que tiene acceso el usuario
        String consulta = "SELECT ejercicio FROM permisos WHERE id='"
                        + request.getParameter("usuario") + "'";
        ResultSet listado = s.executeQuery(consulta);
    %>
    <span>Como usuario <b><%=request.getParameter("usuario") %></b> puede ejecutar los siguientes ejercicios:</span>
    <%
        // Muestra los enlaces a los ejercicios a los que tiene acceso el usuario
        while (listado.next()) {
    %>
        <a href="EjerciciosJsp/S12Ejercicio<%=listado.getInt("ejercicio") %>/index.jsp">Ejercicio <%=listado.getInt("ejercicio") %></a>
    <%
        }
    %>
    <a href="index.jsp"><button>Página principal</button></a>
</body>
</html>
