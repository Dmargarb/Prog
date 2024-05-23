<%@page import="Tienda.Producto"%>
<%@page import="Tienda.ProductoEnElCarrito"%>
<%@page import="Tienda.Carrito"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carrito de Compras</title>
        <style>
            .productos {
                display: flex;
            }

            .producto {
                margin-right: 25px;
            }
        </style>
    </head>
    <body>
        <h1>Carrito de Compras</h1>

        <%
            // Obtiene el carrito de la sesión
            Carrito carrito = (Carrito) session.getAttribute("carrito");

            // Si el carrito está vacío o no existe, muestra un mensaje
            if (carrito == null || carrito.getListaProductosCarrito().isEmpty()) {
                out.println("<p>Tu carrito está vacío.</p>");
            } else {
        %>
        <div class="productos">        
            <%
                // Itera sobre los productos en el carrito y los muestra en la página
                for (ProductoEnElCarrito productoEnElCarrito : carrito.getListaProductosCarrito()) {
                    Producto producto = productoEnElCarrito.getProducto();
                    int cantidad = productoEnElCarrito.getCantidad();
            %>
            <div class="producto">
                <img src="img/<%= producto.getImagen() %>" alt="<%= producto.getNombre() %>" width="100">
                <p><%= producto.getNombre() %> - <%= producto.getPrecio() %>€ x<%= cantidad %></p>
                <form action="elimina.jsp" method="post">
                    <input type="hidden" name="codigo" value="<%= producto.getCodigo() %>">
                    <button type="submit">Eliminar</button>
                </form>
            </div>
            <br>
            <% 
                }
            %>
        </div>
        <br>
        <%
            // Muestra el total de artículos y el precio total del carrito
            out.println("<p>Total Artículos: " + carrito.getTotalArticulos() + "</p>");
            out.println("<p>Total Precio: " + carrito.getTotalPrecio() + "€</p>");
        %>
        <br>    
        <form action="vaciarCarrito.jsp" method="post">
            <button type="submit">Vaciar Carrito</button>
        </form>
        <%
            }
        %>
        <br>
        <a href="index.jsp"><button>Volver al catálogo</button></a>
    </body>
</html>
