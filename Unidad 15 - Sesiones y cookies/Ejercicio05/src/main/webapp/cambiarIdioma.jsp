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
        <title>Multi-idioma</title>
    </head>
    <body>
        <%
            // Obtener el idioma seleccionado del formulario
            String idiomaSeleccionado = request.getParameter("idioma");

            // Crear una cookie para guardar el idioma seleccionado
            Cookie cookieIdioma = new Cookie("idioma", idiomaSeleccionado);
            cookieIdioma.setMaxAge(60 * 60 * 24 * 30); // La cookie expira en 30 días
            cookieIdioma.setPath("/");
            response.addCookie(cookieIdioma);

            // Redirigir a la página principal
            response.sendRedirect("index.jsp");
        %>
    </body>
</html>
