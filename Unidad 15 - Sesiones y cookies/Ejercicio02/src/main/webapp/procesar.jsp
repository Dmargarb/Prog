<%-- 
    Document   : procesar
    Created on : 18 may 2024, 19:55:05
    Author     : Luma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora de Media</title>
    </head>
    <body>
        <%
          ArrayList<Double> numeros = (ArrayList<Double>) session.getAttribute("numeros");
          if (numeros == null) {
              numeros = new ArrayList<>();
              session.setAttribute("numeros", numeros);
          }
      
          double numeroIntroducido = Double.parseDouble(request.getParameter("numero"));
          if (numeroIntroducido >= 0) {
              numeros.add(numeroIntroducido);
              session.setAttribute("numeros", numeros);
              response.sendRedirect("index.jsp");
          } else {
              double suma = 0;
              for (double num : numeros) {
                suma += num;
              }
              double media = numeros.isEmpty() ? 0 : suma / numeros.size(); 
        %>
        <h2>Media: <%= media %></h2>
        <a href="reset.jsp"><button>Reiniciar</button></a>
        <%
          }
        %>
    </body>
</html>
