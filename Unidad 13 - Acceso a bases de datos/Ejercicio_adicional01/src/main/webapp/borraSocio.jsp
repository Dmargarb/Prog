<%-- 
    Document   : borraSocio
    Created on : 2 may 2024, 19:09:00
    Author     : Luma
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
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
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/baloncesto","root", "");
        Statement s = conexion.createStatement();
        
        s.execute ("DELETE FROM socio WHERE socioID=" + request.getParameter("codigo"));
        %>
        <script>document.location = "pideNumeroSocio.jsp";</script>
    </body>
</html>