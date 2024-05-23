<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
    <% request.setCharacterEncoding("UTF-8"); %>
    <h1 class="center">Datos del cliente</h1>
    <form method="post" action="grabaCliente.jsp">
        <!-- Muestra los datos del cliente y permite su edición -->
        <input type="number" name="clienteid" id="clienteid" value="<%=request.getParameter("clienteid") %>" readonly>
        <label for="clienteid">código</label>
        <input type="text" name="nombre" id="nombre" value="<%=request.getParameter("nombre") %>" required>
        <label for="nombre">nombre</label>
        <input type="text" name="direccion" id="direccion" value="<%=request.getParameter("direccion") %>" required>
        <label for="direccion">dirección</label>
        <input type="text" name="telefono" id="telefono" value="<%=request.getParameter("telefono") %>" required>
        <label for="telefono">teléfono</label>
        <input type="date" class="datepicker" name="nacimiento" id="nacimiento" value="<%=request.getParameter("nacimiento") %>" required>
        <label for="nacimiento">fecha de nacim.</label>
        <p>
            <!-- Botón para enviar los datos -->
            <button type="submit" name="aceptar">
                Aceptar
            </button>
            <!-- Botón para cancelar la edición y regresar a la página principal -->
            <a href="index.jsp">Cancelar</a>
        </p>
    </form>
</body>
</html>
