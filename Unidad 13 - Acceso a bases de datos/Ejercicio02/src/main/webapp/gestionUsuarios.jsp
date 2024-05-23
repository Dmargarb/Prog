<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
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
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/control de acceso","root", "");
        Statement s = conexion.createStatement();
        
        request.setCharacterEncoding("UTF-8");
        
        ResultSet listado = s.executeQuery ("SELECT * FROM usuarios");
        %>
        <h1>Gestión de usuarios</h1>
        <table border="1">
            <thead><th>Usuario</th><th>Contraseña</th></thead>
                <%
                  while (listado.next()) {
                    out.println("<tr><td>");
                    out.println(listado.getString("id") + "</td>");
                    out.println("<td>" + listado.getString("pass"));
                    out.println("</td></tr>");
                  }
                %>
        </table>
        <br>
    <form method="post" action="altaUsuario.jsp">
        <div><label for="usuario">Usuario:</label></div>
        <input type="text" name="usuario" id="usuario" required>
        <br>
        <div><label for="clave">Contraseña:</label></div>
        <input type="password" name="clave" id="clave" required>
        <br>
        <br>
        <button type="submit" name="aceptar">Añadir usuario</button>
    </form>
    <%
     conexion.close();
    %>
</body>
</html>
