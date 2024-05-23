<%-- 
    Document   : animalesIndex
    Created on : 21 abr 2024, 0:55:49
    Author     : Luma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Animales</title>
    </head>
    <body>
        <form method="post" action="animales.jsp">
            Seleccione animal a visualizar
            <select name="animal">
                <option>Gato</option>
                <option>Caracol</option>
            </select>
            </br>
            Número de animales <input type="text" name="numero" size="3">
            </br>
            <input type="submit">
        </form>
    </body>
</html>
