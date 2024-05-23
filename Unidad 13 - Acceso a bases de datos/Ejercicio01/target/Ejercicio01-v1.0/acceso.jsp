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
          Class.forName("org.mariadb.jdbc.Driver");
          Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/control de acceso","root", "");
          Statement s = conexion.createStatement();

          request.setCharacterEncoding("UTF-8");

          String consulta = "SELECT COUNT(*) FROM usuarios WHERE id='"
                            + request.getParameter("usuario")
                            + "' AND pass='"
                            + request.getParameter("clave")
                            + "'";

          ResultSet coincidencias = s.executeQuery(consulta);
          coincidencias.next();
    
          String mensaje;
          String enlace;
    
          if (coincidencias.getInt(1) == 0) {
            mensaje = "<p>Lo siento, acceso denegado.</p>";
            enlace = "index.jsp";
          } else {
            mensaje = "<p>Acceso permitido a la aplicación.</p>";
            enlace = "index2.jsp";
          };
        %>
        <h1>Control de acceso</h1
        <br>
        <%=mensaje %>
        <button><a href="<%=enlace %>">Aceptar</a></button>
    </body>
</html>
