<%-- 
    Document   : PasoDeCadena
    Created on : 21 abr 2024, 0:35:44
    Author     : Luma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Paso de cadena</title>
    </head>
    <body>
        <h1>Pasando una cadena de caracteres</h1>
        <form method="post" action="frase.jsp">
            Introduzca el nombre de una fruta:
            <input type="text" name="cadenaIntro">
            <input type="submit" value="OK">
        </form>
    </body>
</html>
