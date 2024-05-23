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
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/control de acceso","root", "");
        Statement s = conexion.createStatement();
        
        request.setCharacterEncoding("UTF-8");
        
        String consulta = "SELECT COUNT(*) FROM usuarios WHERE id='"
                          + request.getParameter("usuario")
                          + "'";
        
        ResultSet coincidencias = s.executeQuery(consulta);
        coincidencias.next();
        
        String mensaje;
        String enlace;
        
        if (coincidencias.getInt(1) != 0) {
          mensaje = "<p>Lo siento, el usuario " + request.getParameter("usuario") + " ya existe.</p>";
          enlace = "gestionUsuarios.jsp";
        } else {
          String insercion = "INSERT INTO usuarios VALUES ('"
                            + request.getParameter("usuario")
                            + "', '" + request.getParameter("clave") + "')";
          s.execute(insercion);         
          conexion.close();
          mensaje = "<p>El usuario " + request.getParameter("usuario") + " se ha registrado correctamente.</p>";
          enlace = "index.jsp";
      }
      %>
        <h1>Gestión de usuarios</h1>
        <%=mensaje %>
        <a href="<%=enlace %>"><button>Aceptar</button></a>
    </body>
</html>
