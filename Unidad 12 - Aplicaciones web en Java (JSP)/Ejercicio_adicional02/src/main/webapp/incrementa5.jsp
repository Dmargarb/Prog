<%-- 
    Document   : incrementa5
    Created on : 21 abr 2024, 0:43:17
    Author     : Luma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Incrementa5</title>
    </head>
    <body>
        El número introducido más cinco es
        <%
        double resultado;
        resultado = Double.parseDouble(request.getParameter("numeroIntro")) + 5;
        out.print(resultado);
        %>
    </body>
</html>
