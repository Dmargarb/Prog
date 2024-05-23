<%-- 
    Document   : suma
    Created on : 21 abr 2024, 0:48:57
    Author     : Luma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Suma</title>
    </head>
    <body>
        La suma es
        <%
        double primerNumero = Double.parseDouble(request.getParameter("x"));
        double segundoNumero = Double.parseDouble(request.getParameter("y"));
        out.println(primerNumero + segundoNumero);
        %>
    </body>
</html>
