<%-- 
    Document   : guardaVJModificado
    Created on : 
    Author     :  David Martín García
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
        // Actualiza los datos del videojuego en la base de datos
        s.execute("UPDATE videojuego SET nombre='" + request.getParameter("nombre") + "', fecha='" + request.getParameter("fecha") + "', precio='" + request.getParameter("precio") + "', descripcion='" + request.getParameter("descripcion") + "', imagen='" + request.getParameter("imagen") + "' WHERE identificador=" + request.getParameter("identificador"));
       
        // Cierre de la conexión a la BBDD
        conexion.close();
        %>
        <script>document.location = "index.jsp";</script>
    </body>
</html>
