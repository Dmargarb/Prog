<%-- 
    Document   : borraFavorito
    Created on : 
    Author     : David Martín García
--%>

<!-- Importa clases de bibliotecas para la construcción de sentencias SQL, 
manejador de la BBDD y gestión de la conexión -->

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
        // Invocación a manejador BBDD, creación de conexión y sentencia SQL
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/juegos_steam","root", "");
        Statement s = conexion.createStatement();

        request.setCharacterEncoding("UTF-8");
        
        // Ejecución de sentencia SQL 
        // Borra este videojuego de la tabla que guarda los favoritos
        // Suponemos que nuestro identificador de usuario es 100
        s.execute("DELETE FROM favorito WHERE id_usuario=100 and id_videojuego=" + request.getParameter("identificador"));
       
        // Cierre de la conexión a la BBDD
        conexion.close();
        
        %>
        <script>document.location = "muestraFavoritos.jsp";</script>
    </body>
</html>

