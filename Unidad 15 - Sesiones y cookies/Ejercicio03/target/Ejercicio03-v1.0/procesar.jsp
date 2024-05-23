<%-- 
    Document   : procesar
    Created on : 18 may 2024, 19:55:05
    Author     : Luma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Collections" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora de Números</title>
    </head>
    <body>
        <%
          ArrayList<Double> numerosTotales = (ArrayList<Double>) session.getAttribute("numerosTotales");
          ArrayList<Double> numerosPares = (ArrayList<Double>) session.getAttribute("numerosPares");
          ArrayList<Double> numerosImpares = (ArrayList<Double>) session.getAttribute("numerosImpares");
          if (numerosTotales == null) {
              numerosTotales = new ArrayList<>();
              numerosPares = new ArrayList<>();
              numerosImpares = new ArrayList<>();
              session.setAttribute("numerosTotales", numerosTotales);
              session.setAttribute("numerosPares", numerosPares);
              session.setAttribute("numerosImpares", numerosImpares);
          }
      
          double numeroIntroducido = Double.parseDouble(request.getParameter("numero"));
          if (numeroIntroducido >= 0) {
              numerosTotales.add(numeroIntroducido);
              session.setAttribute("numerosTotales", numerosTotales);
              if (numeroIntroducido % 2 == 0) {
                  numerosPares.add(numeroIntroducido);
                  session.setAttribute("numerosPares", numerosPares);
              } else { 
                  numerosImpares.add(numeroIntroducido);
                  session.setAttribute("numerosImpares", numerosImpares);
              }
              response.sendRedirect("index.jsp");
          } else {
              double suma = 0;
              for (double num : numerosImpares) {
                suma += num;
              }
              double media = numerosImpares.isEmpty() ? 0 : suma / numerosImpares.size();
              Double numeroParMaximo = numerosPares.isEmpty() ? null : Collections.max(numerosPares);
        %>
        <p>
          Se han introducido en total: <%= numerosTotales.size() %> números.<br>
          La media de los impares es: <%= media %>.<br>
          El máximo de los pares es: <%= numeroParMaximo != null ? numeroParMaximo : "N/A" %>.
        </p>
        <a href="reset.jsp"><button>Reiniciar</button></a>
        <%
          }
        %>
    </body>
</html>
