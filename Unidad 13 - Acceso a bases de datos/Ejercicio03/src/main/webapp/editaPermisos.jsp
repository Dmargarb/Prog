<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Permisos</title>
</head>
<body>
    <%
        // Establece la conexión con la base de datos
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/control de acceso", "root", "");
        Statement s = conexion.createStatement();

        // Establece la codificación de caracteres para la solicitud HTTP
        request.setCharacterEncoding("UTF-8");
        String consulta = "SELECT ejercicio FROM permisos WHERE id='"
                          + request.getParameter("usuario") + "'";

        // Ejecuta la consulta SQL para obtener los permisos del usuario
        ResultSet listado = s.executeQuery(consulta);

        ArrayList<Integer> a = new ArrayList<Integer>();

        // Almacena los permisos del usuario en un ArrayList
        while (listado.next()) {
            a.add(listado.getInt("ejercicio"));
        }

        conexion.close(); // Cierra la conexión con la base de datos
    %>
    <h1>Permisos</h1>
    <table border="1">
        <thead>
            <th>Usuario</th>
            <th>1</th><th>2</th><th>3</th><th>4</th><th>5</th><th>6</th><th>7</th><th>8</th><th>9</th><th>10</th>
            <th>11</th><th>12</th><th>13</th><th>14</th><th>15</th><th>16</th><th>17</th><th>18</th><th>19</th><th>20</th>
        </thead>
        <tr>
            <td><%= request.getParameter("usuario") %></td>
            <form method="post" action="grabaPermisos.jsp">
                <%
                    // Genera los checkboxes para los ejercicios con los permisos correspondientes
                    for (int i = 1; i < 21; i++) {
                %>
                <td>
                    <input type="checkbox" name="ejer<%= i %>" id="ejer<%= i %>"<%
                    if (a.contains(i)) {
                        out.print(" checked=\"checked\"");
                    }
                    %>><label for="ejer<%= i %>"></label>
                </td>
                <%
                    }
                %>

                <td>
                    <input type="hidden" name="usuario" value="<%= request.getParameter("usuario") %>">
                    <button type="submit" name="aceptar">Aceptar</button>
                </td>
            </form>
        </tr>
    </table>
</body>
</html>
