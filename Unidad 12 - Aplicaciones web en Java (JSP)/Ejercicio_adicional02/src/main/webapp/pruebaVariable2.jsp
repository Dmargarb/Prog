<%-- 
    Document   : pruebaVariable2
    Created on : 21 abr 2024, 0:24:35
    Author     : Luma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% int x = 3; %>
        <h<% out.print(x); %>>hola</h<% out.print(x); %>>
</body>
</html>
