<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Gestibank</title>
</head>
<body>
<%
    // Establece la conexión con la base de datos
    Class.forName("org.mariadb.jdbc.Driver");
    Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/banco","root", "");
    Statement s = conexion.createStatement();

    // Establece la codificación de caracteres para la solicitud HTTP
    request.setCharacterEncoding("UTF-8");

    // Realiza la consulta para obtener los datos del cliente especificado por el clienteid
    ResultSet listado = s.executeQuery ("SELECT * FROM cliente WHERE clienteid='" + request.getParameter("clienteid") +"'");
    listado.next();
%>

<h1 class="center"><%=listado.getString("nombre") %></h1>
<p>
    Código: 
    <b><%=listado.getString("clienteid") %></b>
</p>
<p>
    Nombre: 
    <b><%=listado.getString("nombre") %></b>
</p>
<p>
    Dirección: 
    <b><%=listado.getString("direccion") %></b>
</p>
<p>
    Teléfono: 
    <b><%=listado.getString("telefono") %></b>
</p>
<p>
    Fecha de nacimiento:
    <b><%=listado.getString("nacimiento") %></b>
</p>
<br>
<p>
    <a href="index.jsp">
        Aceptar
    </a>
</p>
<br>

<%
    // Cierra la conexión con la base de datos
    conexion.close();
%>
</body>
</html>
