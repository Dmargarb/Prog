<%@page import="clases.Carrito"%>
<%@page import="clases.ElementoDeCarrito"%>
<%@page import="java.util.ArrayList"%>
<%@page import="clases.Producto"%>
<%@page import="clases.Catalogo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tienda de Estilográficas</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Great+Vibes&display=swap" rel="stylesheet">
        <style>
            h1 {
                font-family: 'Great Vibes', cursive;
                font-size: 6em;
            }
            .carrito {
                border: #ffc107 solid 2px;
                border-radius: 6px;
                padding: 4px;
            }
            a {
                text-decoration: none;
            }
        </style>
    </head>
    <body>
        <%
          // Cargar catálogo y establecer el idioma que está guardado en la sesión
          Catalogo catalogo = new Catalogo();
          catalogo.cargaDatos();
          String idioma = (String) session.getAttribute("idioma");

          if (idioma == null) { // Si no hay un idioma guardado en la sesión
            idioma = "es"; // Establecerá por defecto el español
            session.setAttribute("idioma", idioma); // Y lo guarda en la sesión
          }
          
          // Gestionar carrito de la compra mediante cookies
          Carrito carrito;
          Cookie cookieCarrito = dameCookie(request, "carrito");
          
          if (cookieCarrito == null) { // Si la cookie no existe, creará un carrito vacío
              carrito = new Carrito();
          } else {
              carrito = new Carrito(cookieCarrito.getValue()); // En caso contrario, cargará el carrito de la cookie
          }
        %>
        <div class="container">
            <a href="cambia-idioma.jsp?idioma=es">
                <img src="img/es.svg" width="30" height="15">
            </a>
            <a href="cambia-idioma.jsp?idioma=en">
                <img src="img/en.svg" width="30" height="15">
            </a>
        </div>

        <br>

        <div class="container">
            <h1 class="text-center">
                <%=idioma.equals("es") ? "Tienda de Estilográficas": "Fountain Pen Shop"%>
            </h1>
            <div class="row">

                <!-- Catálogo de productos -->

                <div class="col">
                    <div class="row">
                        <%
                          for (Producto p : catalogo.getProductos()) {
                        %>

                        <div class="col-sm-4">
                            <div class="card">
                                <img src="img/<%= p.getImagen()%>" class="card-img-top img-fluid">
                                <div class="card-body">
                                    <h4 class="card-title"><%= p.getNombre()%></h4>
                                    <h5><%= String.format("%.2f", p.getPrecio()) %> €</h5>
                                    <a href="compra.jsp?codigo=<%= p.getCodigo()%>" class="btn btn-primary">
                                        <%=idioma.equals("es") ? "Añadir al carrito": "Add to Cart"%>
                                    </a>
                                </div>
                            </div>
                        </div>
                        <%
                          }
                        %>
                    </div>
                </div>


                <!-- Carrito de la compra -->

                <div class="col-3">
                    <div class="carrito">
                        <img src="img/cart.svg" width="36px">   
                        <%
                          for (ElementoDeCarrito e : carrito.getElementos()) {
                        %>
                        <div class="card">
                            <img src="img/<%= e.getProducto().getImagen()%>" class="card-img-top img-fluid">
                            <div class="card-body">
                                <%= e.getProducto().getNombre() %><br>
                                <%= String.format("%.2f", e.getProducto().getPrecio()) %> €<br>
                                <%= e.getCantidad() %> <%=idioma.equals("es") ? "unidades": "units"%><br>
                                <a href="elimina.jsp?codigo=<%= e.getProducto().getCodigo() %>" class="btn btn-warning text-white">
                                    <%=idioma.equals("es") ? "Eliminar": "Remove"%>
                                </a>
                            </div>
                        </div>
                        <%
                          }
                        %>
                    </div>
                </div>
            </div>
        </div>


        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>

<%!
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