<%@ page import="Tienda.Carrito" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Producto Eliminado</title>
    </head>
    <body>
        <%
        // Obtiene el código del producto desde los parámetros de la solicitud
        int codigoProducto = Integer.parseInt(request.getParameter("codigo"));
        
        // Obtiene el carrito de la sesión
        Carrito carrito = (Carrito) session.getAttribute("carrito");
        
        // Si el carrito existe, elimina el producto especificado
        if (carrito != null) {
            carrito.eliminarProducto(codigoProducto);
        }
        %>
        <h1>Producto Eliminado del Carrito</h1>
        <p>Has eliminado el producto del carrito.</p>
        <a href="index.jsp"><button>Seguir comprando</button></a>
        <br><br>
        <a href="carrito.jsp"><button>Ver Carrito</button></a>
    </body>
</html>
