<%-- 
    Document   : conversor
    Created on : 12 abr 2024, 18:06:21
    Author     : Luma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio05</title>
    </head>
    <body>
        <h2>Conversor de euros a pesetas</h2>
        <% Double e = Double.parseDouble(request.getParameter("euros")); %>
        <% out.print(e); %> euros son <% out.println(Math.round(e * 166.386)); %> pesetas.
    </body>
</html>
