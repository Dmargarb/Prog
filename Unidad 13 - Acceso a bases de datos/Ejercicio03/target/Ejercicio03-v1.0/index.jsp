<%-- 
    Document   : index
    Created on : 3 may 2024, 19:17:50
    Author     : Luma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Control de acceso</title>
</head>
<body>
    <h1>Control de acceso</h1>
    <form method="post" action="acceso.jsp">
        <div><label for="usuario">Usuario:</label></div>
        <input type="text" name="usuario" id="usuario" required>
        <br>
        <div><label for="clave">Contraseña:</label></div>
        <input type="password" name="clave" id="clave" required>
        <br>
        <br>
        <button type="submit" name="aceptar">Aceptar</button>
    </form>
</body>
</html>
