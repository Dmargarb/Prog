<%-- 
    Document   : index
    Created on : 12 abr 2024, 17:45:41
    Author     : Luma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio04</title>
    </head>
    <body>
        <h2>Calculadora de Media</h2>
        <form action="CalcularMedia.jsp" method="post">
            Nota 1: <input type="text" name="nota1"><br>
            Nota 2: <input type="text" name="nota2"><br>
            Nota 3: <input type="text" name="nota3"><br>
            <input type="submit" value="Calcular Media">
        </form>
    </body>
</html>
