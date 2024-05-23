<%
  // Cambiar el idioma según el seleccionado y redirigir a la página principal
  String idioma = request.getParameter("idioma");
  session.setAttribute("idioma", idioma); // Se guarda el idioma en la sesión
  response.sendRedirect("index.jsp");
%>