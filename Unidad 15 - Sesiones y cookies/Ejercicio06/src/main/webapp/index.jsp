<%-- 
    Document   : index
    Created on : 18 may 2024, 21:52:50
    Author     : Luma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Colores con cookies</title>
        <%
        String backgroundColor;
        String fontColor;
        
        Cookie cookieFondo = dameCookie(request, "fondo");
        Cookie cookieFuente = dameCookie(request, "fuente");

        if (cookieFuente == null || cookieFondo == null) {
            backgroundColor = "white"; // Color de fondo predeterminado
            fontColor = "black"; // Color de fuente predeterminado
            
            cookieFondo = new Cookie("fondo", backgroundColor);
            cookieFondo.setPath("/");
            cookieFondo.setMaxAge(60 * 60 * 24 * 30); // 30 días
            response.addCookie(cookieFondo);
            
            cookieFuente = new Cookie("fuente", fontColor);
            cookieFuente.setPath("/");
            cookieFuente.setMaxAge(60 * 60 * 24 * 30); // 30 días
            response.addCookie(cookieFuente);
        } else {
            backgroundColor = cookieFondo.getValue();
            fontColor = cookieFuente.getValue();
        }
        %>
        <style>
            body {
                background-color: <%= backgroundColor %>;
                color: <%= fontColor %>;
            }
        </style>
    </head>
    <body>
        <h1>Título de ejemplo</h1>
        <p>Texto de ejemplo.</p>
        <br>
        <form action="guardarColores.jsp" method="post">
            <label for="backgroundColor">Color de fondo:</label>
            <input type="color" id="backgroundColor" name="backgroundColor" >
            <br><br>
            <label for="fontColor">Color de la fuente:</label>
            <input type="color" id="fontColor" name="fontColor" >
            <br><br>
            <button type="submit">Guardar</button>
        </form>
    </body>
</html>

<%!
  // Función para obtener una cookie por nombre
  public static Cookie dameCookie(HttpServletRequest request, String nombre) {
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
      for (Cookie cookie : cookies) {
        if (cookie.getName().equals(nombre)) {
          return cookie;
        }
      }
    }
    return null;
  }
%>