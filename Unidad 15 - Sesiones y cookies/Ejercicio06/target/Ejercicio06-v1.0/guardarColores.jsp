<%-- 
    Document   : idioma
    Created on : 19 may 2024, 23:25:40
    Author     : Luma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Colores con cookies</title>
    </head>
    <body>
        <%
            // Obtener los parámetros del formulario
            String backgroundColor = request.getParameter("backgroundColor");
            String fontColor = request.getParameter("fontColor");

            // Crear cookies para los colores
            Cookie cookieFondo = new Cookie("fondo", backgroundColor);
            cookieFondo.setPath("/");
            cookieFondo.setMaxAge(60 * 60 * 24 * 30); // 30 días
            
            Cookie cookieFuente = new Cookie("fuente", fontColor);
            cookieFuente.setPath("/");
            cookieFuente.setMaxAge(60 * 60 * 24 * 30); // 30 días
            
            // Añadir las cookies a la respuesta
            response.addCookie(cookieFondo);
            response.addCookie(cookieFuente);

            // Redirigir a la página principal
            response.sendRedirect("index.jsp");
        %>
    </body>
</html>
