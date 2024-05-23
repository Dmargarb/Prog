<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Calculadora de Media</title>
  </head>
  <body>
      <h1>Calculadora de Media</h1>
      <form action="procesar.jsp" method="post">
          Introduce un número positivo: <input type="number" name="numero" step="any" autofocus>
          <input type="submit" value="Agregar">
      </form>
  </body>
</html>
