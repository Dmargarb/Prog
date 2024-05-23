<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Gestión de usuarios</title>
</head>
<body>
    <%
        // Establece la conexión con la base de datos
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/control de acceso","root", "");
        Statement s = conexion.createStatement();
        
        // Establece la codificación de caracteres para la solicitud HTTP
        request.setCharacterEncoding("UTF-8");
        
        // Ejecuta la consulta SQL para obtener la lista de usuarios
        ResultSet listado = s.executeQuery ("SELECT * FROM usuarios");
    %>
    <h1>Gestión de usuarios</h1>
    <table border="1">
        <thead>
            <th>Usuario</th><th>Contraseña</th><th>Permisos</th>
        </thead>
        <%
            // Muestra la información de cada usuario en la tabla
            while (listado.next()) {
                out.println("<tr><td>");
                out.println(listado.getString("id") + "</td>");
                out.println("<td>" + listado.getString("pass"));
        %>
                </td>
                <td>
                    <form method="post" action="editaPermisos.jsp">
                        <input type="hidden" name="usuario" value="<%=listado.getString("id") %>">
                        <button type="submit" name="editar">
                            Editar
                        </button>
                    </form>
                </td></tr>
        <%
            }
        %>
        <form method="post" action="altaUsuario.jsp">
            <tr>
                <td>
                    <input type="text" name="usuario" id="usuario" required>
                    <label for="usuario">Usuario</label>
                </td>
                <td>
                    <input type="password" name="clave" id="clave" required>
                    <label for="clave">Contraseña</label>
                </td>
                <td>
                    <button type="submit" name="aceptar">
                        Añadir usuario
                    </button>
                </td>
            </tr>
        </form>
    </table>
    <br>
    <a href="index.jsp"><button>Página principal</button></a>
    <%
        // Cierra la conexión con la base de datos
        conexion.close();
    %>
</body>
</html>
