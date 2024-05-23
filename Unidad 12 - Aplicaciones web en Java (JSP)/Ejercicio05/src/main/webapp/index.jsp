<%-- 
    Document   : index
    Created on : 12 abr 2024, 18:05:46
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
        <form method="post" action="conversor.jsp">
            Euros: <input type="number" min="0" step="0.01" name="euros"></br></br>
            <input type="submit" value="Aceptar">
        </form>
    </body>
</html>
