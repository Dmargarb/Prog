<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Gestisimal</title>
</head>
<body>
<div class="principal">
    <%
        // Establece la codificación de caracteres para la solicitud HTTP
        request.setCharacterEncoding("UTF-8");

        // Carga el controlador de la base de datos
        Class.forName("org.mariadb.jdbc.Driver");

        // Establece la conexión con la base de datos
        Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gestisimal","root", "");
        Statement s = conexion.createStatement();

        // Actualiza los datos del artículo en la base de datos
        String descripcion = request.getParameter("descripcion");
        double precioCompra = Double.parseDouble(request.getParameter("preciocompra"));
        double precioVenta = Double.parseDouble(request.getParameter("precioventa"));
        int stock = Integer.parseInt(request.getParameter("stock"));
        String codigo = request.getParameter("codigo");

        String updateQuery = "UPDATE articulo SET descripcion='" + descripcion + "', precio_compra=" + precioCompra + ", precio_venta=" + precioVenta + ", stock=" + stock + " WHERE codigo=" + codigo;
        s.execute(updateQuery);

        // Cierra la conexión con la base de datos
        conexion.close();
    %>
    <script>document.location = "index.jsp"</script>
</div>
</body>
</html>
