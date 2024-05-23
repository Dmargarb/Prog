<%@page import="Tienda.Carrito"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vaciar Carrito</title>
    </head>
    <body>
        <%
        // Obtiene el carrito de la sesión
        Carrito carrito = (Carrito) session.getAttribute("carrito");
        
        // Si el carrito existe, lo vacía
        if (carrito != null) {
            carrito.vaciarCarrito();
        }
        
        // Redirige al usuario a la página del carrito
        response.sendRedirect("carrito.jsp");
        %>
    </body>
</html>
