<%-- 
    Document   : index
    Created on : 
    Author     : David Martín García 
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
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
        // Selecciona y guarda en 'listado' todos los registros de la tabla videojuego
        
        ResultSet listado = s.executeQuery("SELECT * FROM videojuego");
        
        %>

        <div class="container">
            <div class="row s12 m12 l12">
                <div class="card grey lighten-5">
                    <h1 class="center" style="color:purple"><b>Steam Store</b></h1>
                    <button class="btn waves-effect waves-light" style="width:230px" name="nuevoJuego" onClick="window.location.href = 'agregaVideojuego.jsp';">
                        Añadir&nbsp;videojuego&nbsp;
                        <i class="material-icons left">add</i>
                    </button>
                    <br>
                    <button class="btn waves-effect waves-light pink" style="margin-top: 10px; width:230px" name="favoritos" onClick="window.location.href = 'muestraFavoritos.jsp';">
                        Ver&nbsp;lista&nbsp;de&nbsp;deseos
                        <i class="material-icons left">favorite</i>
                    </button>
                    <table class="striped centered responsive-table">
                        <thead><th></th><th></th><th></th></thead>
                        <%
                        while (listado.next()) {
                        %>
                        <tr>
                            <td><img src="<%=listado.getString("imagen") %>"></td>
                            <td>
                                <table 
                                    <tr>                                      
                                        <td><b>T&iacute;tulo: </b><%=listado.getString("nombre") %></td>
                                        <td><b>Fecha: </b><%=listado.getString("fecha") %></td>
                                        <td><b>Precio: </b>&euro;<%=listado.getDouble("precio") %></td>
                                    </tr>
                                    <tr>
                                        <td colspan="3" style="width:100%"><p style="text-align:justify"><%=listado.getString("descripcion") %></p></td>                                        
                                    </tr>
                                </table>
                            </td>
                            <td>
                                <table>
                                    <tr>
                                    <form method="post" action="editaVideojuego.jsp">
                                        <input type="hidden" name="identificador" value="<%=listado.getInt("identificador") %>">
                                        <input type="hidden" name="nombre" value="<%=listado.getString("nombre") %>">
                                        <input type="hidden" name="fecha" value="<%=listado.getString("fecha") %>">
                                        <input type="hidden" name="precio" value="<%=listado.getDouble("precio") %>">
                                        <input type="hidden" name="descripcion" value="<%=listado.getString("descripcion") %>">
                                        <input type="hidden" name="imagen" value="<%=listado.getString("imagen") %>">
                                        <td>
                                            <button class="btn waves-effect waves-light center blue" style="width:130px" type="submit" name="editar">
                                                Editar<i class="material-icons left">create</i>
                                            </button>
                                        </td>
                                    </form> 
                                    </tr> 
                                    <tr>
                                    <form method="post" action="borraVideojuego.jsp">
                                        <input type="hidden" name="identificador" value="<%=listado.getInt("identificador") %>">
                                        <td>
                                            <button class="btn waves-effect waves-light center red" style="width:130px" type="submit" name="borrar">
                                                Borrar<i class="material-icons left">delete</i>
                                            </button>
                                        </td>
                                    </form> 
                                    </tr>
                                    <tr>
                                    <form method="post" action="agregaFavorito.jsp">
                                        <input type="hidden" name="identificador" value="<%=listado.getInt("identificador") %>">
                                        <td>
                                            <button class="btn waves-effect waves-light center green" style="width:130px" type="submit" name="editar">
                                                Marcar<i class="material-icons left">favorite_border</i>
                                            </button>
                                        </td>
                                    </form> 
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <%
                        }
                        %>
                    </table>  
                </div>
            </div>
        </div>
        <%
        conexion.close();
        %>
        
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <!-- Materialize -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    </body>
</html>
