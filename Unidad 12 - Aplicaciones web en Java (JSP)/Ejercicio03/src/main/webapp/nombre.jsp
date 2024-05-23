<%-- 
    Document   : nombre
    Created on : 12 abr 2024, 17:39:57
    Author     : Luma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio03</title>
    </head>
    <body>
        Hola
        <% out.print(request.getParameter("nombre")); %>
    </body>
</html>