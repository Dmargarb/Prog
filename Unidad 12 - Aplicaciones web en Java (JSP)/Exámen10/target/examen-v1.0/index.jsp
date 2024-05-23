<%--
    Document   : index
    Created on : Apr 24, 2024, 5:06:10 PM
    Author     :
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="gestorvideojuegos.GestorJSON"%>
<%@page import="gestorvideojuegos.Videojuego"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.io.File"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Juegos de la plataforma Steam</title>
        <link rel="stylesheet" type="text/css" href="datos/estilos.css" />
    </head>
    <body>
        <div class="cabecera">Juegos de la plataforma Steam</div>
        <hr/>

        <form action="index.jsp" method="post">
            Introduzca un término de búsqueda:
            <input type="text" name="cadenaIntro" placeholder="Buscar...">
            <input type="submit" value="Buscar">
        </form>

        <%
            String jsonFilePath = getServletContext().getRealPath("/datos/games-medium.json");
            request.setCharacterEncoding("UTF-8");
            String cadenaBusqueda = request.getParameter("cadenaIntro");

            GestorJSON gestorJSON = new GestorJSON();
            gestorJSON.importarJSON(jsonFilePath, cadenaBusqueda);

            ArrayList<Videojuego> listaVideojuegos = gestorJSON.getListaVideojuegos();

            for (Videojuego videojuego : listaVideojuegos) {
        %>
        <%= videojuego.toString() %>
        <%
            }
        %>
    </body>
</html>
