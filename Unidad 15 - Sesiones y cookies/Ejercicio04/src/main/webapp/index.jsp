<%@page import="Tienda.Producto"%>
<%@page import="Tienda.Catalogo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Catálogo de Productos</title>
        <style>
            ul {
                list-style-type: none;
                padding: 0;
                display: flex;
            }
            
            li {
                margin-right: 25px;
            }
        </style>
    </head>
    <body>
        <h1>Catálogo de Productos</h1>
        <ul>
            <%
              // Obtiene el catálogo de la sesión
              Catalogo catalogo = (Catalogo) session.getAttribute("catalogo");
              
              // Si el catálogo no existe en la sesión, lo crea y lo agrega a la sesión
              if (catalogo == null) {
                catalogo = new Catalogo();
                session.setAttribute("catalogo", catalogo);
              }
              
              // Itera sobre la lista de productos en el catálogo y los muestra en la página
              for (Producto producto : catalogo.getListaProductos()) {
            %>
            <li>
                <img src="img/<%= producto.getImagen() %>" alt="<%= producto.getNombre() %>" width="100">
                <p><%= producto.getNombre() %> - <%= producto.getPrecio() %>€</p>
                <form action="compra.jsp" method="post">
                    <input type="hidden" name="codigo" value="<%= producto.getCodigo() %>">
                    <button type="submit">Comprar</button>
                </form>
            </li>
            <% } %>
        </ul>
        <br>
        <a href="carrito.jsp"><button>Ver Carrito</button></a>
    </body>
</html>
