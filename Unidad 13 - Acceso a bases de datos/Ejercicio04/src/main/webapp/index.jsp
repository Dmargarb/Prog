<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Gestibank</title>
</head>
<body>
    <%
        // Establece la conexión con la base de datos
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/banco","root", "");
        Statement s = conexion.createStatement();

        // Establece la codificación de caracteres para la solicitud HTTP
        request.setCharacterEncoding("UTF-8");

        // Consulta SQL para obtener la lista de clientes
        ResultSet listado = s.executeQuery ("SELECT * FROM cliente");
    %>
    <h1>Gestibank</h1>
    <table border="1">
        <thead><th>Código</th><th>Nombre</th><th>Dirección</th><th>Teléfono</th><th>Fecha de nacimiento</th><th></th><th></th></thead>
        <%
            // Muestra la información de cada cliente en la tabla
            while (listado.next()) {
        %>
        <tr>
            <td><%=listado.getString("clienteid") %></td>
            <td><%=listado.getString("nombre") %></td>
            <td><%=listado.getString("direccion") %></td>
            <td><%=listado.getString("telefono") %></td>
            <td><%=listado.getString("nacimiento") %></td>
            <form method="post" action="modificaCliente.jsp">
                <input type="hidden" name="clienteid" value="<%=listado.getString("clienteid") %>">
                <input type="hidden" name="nombre" value="<%=listado.getString("nombre") %>">
                <input type="hidden" name="direccion" value="<%=listado.getString("direccion") %>">
                <input type="hidden" name="telefono" value="<%=listado.getString("telefono") %>">
                <input type="hidden" name="nacimiento" value="<%=listado.getString("nacimiento") %>">
                <td>
                    <button type="submit" name="editar">
                        Editar
                    </button>
                </td>
            </form>
            <form method="post" action="borraCliente.jsp">
                <input type="hidden" name="clienteid" value="<%=listado.getString("clienteid") %>">
                <td>
                    <button class="btn waves-effect waves-light center red" type="submit" name="borrar">
                        Borrar
                    </button>
                </td>
            </form>
        </tr>
        <%
            }
        %>
        <form method="post" action="altaCliente.jsp">
            <tr>
                <td>
                    <div>
                        <input type="number" name="clienteid" id="clienteid" required>
                        <label for="clienteid">código</label>
                    </div>
                </td>
                <td>
                    <div>
                        <input type="text" name="nombre" id="nombre">
                        <label for="nombre">nombre</label>
                    </div>
                </td>
                <td>
                    <div>
                        <input type="text" name="direccion" id="direccion">
                        <label for="direccion">dirección</label>
                    </div>
                </td>
                <td>
                    <div>
                        <input type="tel" name="telefono" id="telefono">
                        <label for="telefono">teléfono</label>
                    </div>
                </td>
                <td>
                    <div>
                        <input type="date" name="nacimiento" id="nacimiento">
                        <label for="nacimiento">fecha de nacim.</label>
                    </div>
                </td>
                <td>
                    <button type="submit" name="aceptar">
                        Añadir
                    </button>
                </td>
            </tr>
        </form>  
    </table>
    <%
        conexion.close(); // Cierra la conexión con la base de datos
    %>
</body>
</html>
