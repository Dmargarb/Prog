<%@page import="clases.Carrito"%>
<%
  // Obtener el código del producto a eliminar
  int codigo = Integer.parseInt(request.getParameter("codigo"));
  
  // Gestionar carrito de la compra mediante cookies
  Cookie cookieCarrito = dameCookie(request, "carrito");
  Carrito carrito;
  
  if (cookieCarrito == null) { // Si la cookie no existe, creará un carrito vacío
    carrito = new Carrito();
  } else {
    carrito = new Carrito(cookieCarrito.getValue()); // En caso contrario, cargará el carrito de la cookie
  }
  
  // Eliminar el producto del carrito
  carrito.eliminaProductoConCodigo(codigo);
  
  // Crear y actualizar la cookie del carrito
  cookieCarrito = new Cookie("carrito", carrito.toString()); // Se serializa el carrito para guardarlo en una cookie
  cookieCarrito.setPath("/");
  cookieCarrito.setMaxAge(60 * 60 * 24 * 30);
  response.addCookie(cookieCarrito);
  
  // Redirigir a la página principal
  response.sendRedirect("index.jsp");
%>

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
