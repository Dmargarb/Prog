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
<%
    // Establece la codificación de caracteres para la solicitud HTTP
    request.setCharacterEncoding("UTF-8");

    // Carga el controlador de la base de datos
    Class.forName("org.mariadb.jdbc.Driver");

    // Establece la conexión con la base de datos
    Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gestisimal", "root", "");
    Statement s = conexion.createStatement();

    // Comprueba si el código de artículo ya existe
    String codigo = request.getParameter("codigo");
    String descripcion = request.getParameter("descripcion");
    double precioCompra = Double.parseDouble(request.getParameter("preciocompra"));
    double precioVenta = Double.parseDouble(request.getParameter("precioventa"));
    int stock = Integer.parseInt(request.getParameter("stock"));

    String consulta = "SELECT COUNT(*) FROM articulo WHERE codigo='" + codigo + "'";
    ResultSet coincidencias = s.executeQuery(consulta);
    coincidencias.next();

    if (coincidencias.getInt(1) != 0) {
        out.print("<script type=\"text/javascript\">alert(\"Lo siento, el código " + codigo + " ya existe\");</script>");
        out.print("<script>document.location = \"index.jsp\"</script>");
    } else {
        // Inserta los datos en la base de datos
        String insercion = "INSERT INTO articulo VALUES ('" + codigo + "', '" + descripcion + "', " + precioCompra + ", " + precioVenta + ", " + stock + ")";
        s.execute(insercion);
        conexion.close();
    }
%>
<script>document.location = "index.jsp";</script>
</body>
</html>
