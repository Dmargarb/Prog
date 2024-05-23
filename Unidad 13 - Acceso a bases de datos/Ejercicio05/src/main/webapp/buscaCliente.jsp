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

    // Realiza la consulta para contar el número de coincidencias del nombre proporcionado
    ResultSet listado = s.executeQuery ("SELECT COUNT(*) FROM cliente WHERE nombre LIKE '%" + request.getParameter("nombre") + "%'");
    listado.next();
    int coincidencias = listado.getInt(1);

    // Si no se encuentra ningún cliente con el nombre especificado, volvemos a la página principal.
    if (coincidencias == 0) {
        response.sendRedirect("index.jsp");
    }

    // Si hay un único cliente con el nombre especificado, vamos directamente a la página de detalle.
    if (coincidencias == 1) {
        ResultSet listado2 = s.executeQuery ("SELECT * FROM cliente WHERE nombre LIKE '%" + request.getParameter("nombre") + "%'");
        listado2.next();
        int clienteid = listado2.getInt("clienteid");
        response.sendRedirect("detalleCliente.jsp?clienteid=" + clienteid);
    }

    // Si hay varios clientes cuyos nombres coinciden con el patrón buscado, se muestran todos esos nombres para que el usuario elija.
    if (coincidencias > 1) {
%>
    <h1 class="center">G e s t i b a n k</h1>
    <table border="1">
        <thead><th>Nombre</th><th></th></thead>
<%
        ResultSet listado2 = s.executeQuery ("SELECT * FROM cliente WHERE nombre LIKE '%" + request.getParameter("nombre") + "%'");
        while (listado2.next()) {
%>
        <tr>
            <td><%=listado2.getString("nombre") %></td>
            <form method="post" action="detalleCliente.jsp">
                <input type="hidden" name="clienteid" value="<%=listado2.getString("clienteid") %>">
                <td>
                    <button type="submit" name="editar">
                        Detalle
                    </button>
                </td>
            </form>
        </tr>
<%
        } // while
%>
    </table>
<%
    } // if

    // Cierra la conexión con la base de datos
    conexion.close();
%>
</body>
</html>
