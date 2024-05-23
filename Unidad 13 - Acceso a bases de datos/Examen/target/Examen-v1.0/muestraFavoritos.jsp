<%-- 
    Document   : muestraFavoritos
    Created on : 
    Author     : David Martín García 
--%>

<!-- Importa clases de bibliotecas para la construcción de sentencias SQL, 
recepción de resultados, manejador de la BBDD y gestión de la conexión -->
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--Importa Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Importa materialize.css--> 
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <title>Steam store</title>
    </head>    
    <body>
        <%
        // Invocación a manejador BBDD, creación de conexión y sentencia SQL
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/juegos_steam","root", "");
        Statement s = conexion.createStatement();
                    
        request.setCharacterEncoding("UTF-8");        
        
        // Ejecución de sentencia SQL
        // Obtén todos los registros de la tabla favorito para el usuario 100 (nosotros)
        // Guarda el resultado en 'listado_fav'
        
        ResultSet listado_fav = s.executeQuery("SELECT * FROM favorito WHERE id_usuario=100");
        
        
        int contadorVJ = 0;
        %>

        <div class="container">  
            <h2 class="center" style="color:#3f51b5 "><b>Listado de favoritos</b></h2>
            <%
            while (listado_fav.next()) {              
                if (Math.floorMod(contadorVJ, 3) == 0) out.println("<div class=\"row\">");   
                // Ejecución de sentencia SQL
                // Obtén todos los registros de la tabla videojuego para el identificador listado_fav.getInt("id_videojuego")
                // Guarda el resultado en 'videojuego_fav'             
                ResultSet videojuego_fav = s.executeQuery ("SELECT * FROM videojuego WHERE identificador=" + listado_fav.getInt("id_videojuego"));
                videojuego_fav.next();                    
            %>

            <div class="col s4 m4 l4">           
                <div class="card grey lighten-5">
                    <div class="card-image">
                        <img src="<%=videojuego_fav.getString("imagen") %>">
                        <form method="post" action="borraFavorito.jsp">
                            <input type="hidden" name="identificador" value="<%=videojuego_fav.getInt("identificador") %>">
                            <button class="btn-floating halfway-fab waves-effect waves-light red" type="submit" name="borrar">
                                <i class="material-icons left">delete</i>
                            </button>
                        </form> 
                    </div>
                    <div class="card-content">                        
                        <span class="card-title"><%=videojuego_fav.getString("nombre") %></span>
                        <p style="text-align:justify"><%=videojuego_fav.getString("descripcion") %></p>
                    </div>
                </div>
            </div>

            <%
                contadorVJ++;
                if (Math.floorMod(contadorVJ, 3) == 0) out.println("</div>");
            }
            if (Math.floorMod(contadorVJ, 3) != 0) out.println("</div>");
            %>
        </div>
        <button class="btn waves-effect waves-light indigo right" onClick="window.location.href = 'index.jsp';">
            Volver&nbsp;a&nbsp;listado&nbsp;de&nbsp;videojuegos
            <i class="material-icons left">arrow_back</i>
        </button>            
        <div class="row"></div>
    </div>
    <%
    conexion.close();
    %>
    
    <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <!-- Materialize -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>
</html>