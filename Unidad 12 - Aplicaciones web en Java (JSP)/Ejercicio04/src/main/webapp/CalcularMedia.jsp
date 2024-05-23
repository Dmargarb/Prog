<%-- 
    Document   : CalcularMedia
    Created on : 12 abr 2024, 17:53:07
    Author     : Luma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Media</title>
  </head>
  <body>
      
    <%
      double n1 = Double.parseDouble(request.getParameter("nota1"));
      double n2 = Double.parseDouble(request.getParameter("nota2"));
      double n3 = Double.parseDouble(request.getParameter("nota3"));
      double media = (n1 + n2 + n3) / 3;
      out.println("La media es " + media);
    %>
  </body>
</html>
