<%@page import="Tienda.Producto"%>
<%@page import="Tienda.Catalogo"%>
<%@page import="Tienda.Carrito"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Producto Agregado</title>
    </head>
    <body>
        <%
          // Obtiene el código del producto desde el parámetro de la solicitud
          int codigoProducto = Integer.parseInt(request.getParameter("codigo"));
          
          // Obtiene el catálogo de productos de la sesión
          Catalogo catalogo = (Catalogo) session.getAttribute("catalogo");
          
          // Obtiene el producto por su código desde el catálogo
          Producto producto = catalogo.getProductoPorCodigo(codigoProducto);
          
          // Obtiene el carrito de la sesión
          Carrito carrito = (Carrito) session.getAttribute("carrito");
          
          // Si el carrito no existe en la sesión, se crea uno nuevo
          if (carrito == null) {
              carrito = new Carrito();
          }
    
          // Agrega el producto al carrito
          carrito.agregarProducto(producto);
          
          // Actualiza el carrito en la sesión
          session.setAttribute("carrito", carrito);
        %>
        <h1>Producto Agregado al Carrito</h1>
        <p>Has agregado <%= producto.getNombre() %> al carrito.</p>
        <a href="index.jsp"><button>Seguir comprando</button></a>
        <br><br>
        <a href="carrito.jsp"><button>Ver Carrito</button></a>
    </body>
</html>
