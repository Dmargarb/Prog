<%-- 
    Document   : guardaVJNuevo
    Created on : 
    Author     : David Martín García
--%>

<!-- Importa clases de bibliotecas para la construcción de sentencias SQL, 
recepción de resultados, manejador de la BBDD y gestión de la conexión -->

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
        // Invocación a manejador BBDD, creación de conexión y sentencia SQL
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/juegos_steam","root", "");
        Statement s = conexion.createStatement();

        request.setCharacterEncoding("UTF-8");
        
        // Ejecución de sentencia SQL y posicionamiento del cursor
        // Comprueba si el identificador del videojuego ya existe
        String consulta = "SELECT COUNT(*) FROM videojuego WHERE identificador="+ request.getParameter("identificador");
                
        ResultSet coincidencias = s.executeQuery(consulta);
        coincidencias.next();

        
        // Si el videojuego no está en la BBDD, añadirlo
        if (coincidencias.getInt(1) == 0) {        
            // Añade el videojuego a la base de datos
            String insercion = "INSERT INTO videojuego VALUES ("
                    + request.getParameter("identificador")
                    + ", '" + request.getParameter("nombre")
                    + "', '" + request.getParameter("fecha")
                    + "', '" + request.getParameter("precio")
                    + "', '" + request.getParameter("descripcion")
                    + "', '" + request.getParameter("imagen") + "')";
            s.execute(insercion);
            
        } else {
            // En otro caso, mostramos mensaje de error
            out.print("<script type=\"text/javascript\">alert(\"Lo siento, el juego con código " + request.getParameter("identificador") + " ya existe en la base de datos.\");</script>");
            out.print("<script>document.location = \"agregaVideojuego.jsp\"</script>");
        }        
        
        // Cierre de la conexión a la BBDD
        conexion.close();
        %>
        <script>document.location = "index.jsp";</script>
    </body>
</html>
