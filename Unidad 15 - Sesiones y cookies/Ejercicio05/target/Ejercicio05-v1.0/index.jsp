<%-- 
    Document   : index
    Created on : 19 may 2024, 23:25:26
    Author     : Luma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Multi-idioma</title>
    </head>
    <body>
        <%
        String idiomaSeleccionado;
        Cookie cookieIdioma = dameCookie(request, "idioma");

        if (cookieIdioma == null) {
            idiomaSeleccionado = "es";
            cookieIdioma = new Cookie("idioma", idiomaSeleccionado);
            cookieIdioma.setPath("/");
            cookieIdioma.setMaxAge(60 * 60 * 24 * 30); // 30 días
            response.addCookie(cookieIdioma);
        } else {
            idiomaSeleccionado = cookieIdioma.getValue();
        }
        
        String titulo = "";
        String parrafo = "";
        
        switch (idiomaSeleccionado) {
            case "en":
                titulo = "Welcome";
                parrafo = "This is a simple page to demonstrate language selection using cookies.";
                break;
            case "fr":
                titulo = "Bienvenue";
                parrafo = "Ceci est une page simple pour démontrer la sélection de la langue à l'aide de cookies.";
                break;
            case "es":
                titulo = "Bienvenido";
                parrafo = "Esta es una página sencilla para demostrar la selección de idioma usando cookies.";
                break;
            default:
                break;
        }
        %>
        <h1><%= titulo %></h1>
        <p><%= parrafo %></p>
        <br>
        <form action="cambiarIdioma.jsp" method="post">
            <label for="idioma">Cambiar idioma:</label>
            <select id="idioma" name="idioma">
                <option value="es">Español</option>
                <option value="en">Inglés</option>
                <option value="fr">Francés</option>
            </select>
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
