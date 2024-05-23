<%-- 
    Document   : index
    Created on : 21 abr 2024, 2:06:18
    Author     : Luma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="pokedex.GestorJSON" %>
<%@ page import="pokedex.Pokemon" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Pokémon</title>
        <link rel="stylesheet" type="text/css" href="estilos.css">
    </head>
    <body>
        <h1>Lista de Pokémon</h1>
        <div class="container">
            <%
                // Obtener la ruta absoluta del directorio raíz de la aplicación web
                String ruta = request.getServletContext().getRealPath("/");
                
                // Unir la ruta con el nombre del archivo JSON
                String rutaJson = ruta + "pokedex.json";
                
                // Crear una instancia de GestorJSON y llamar al método importarJSON con la ruta del archivo JSON
                GestorJSON gestor = new GestorJSON();
                gestor.importarJSON(rutaJson);
                
                // Obtener la lista de Pokémon
                ArrayList<Pokemon> listaPokemon = gestor.getListaPokemon();
                
                // Iterar sobre la lista de Pokémon y mostrar los detalles
                for (Pokemon pokemon : listaPokemon) {
            %>
            <!-- Div para cada Pokémon -->
            <div class="pokemon">
                <!-- Imagen del Pokémon -->
                <img src="<%= pokemon.getImg() %>" alt="<%= pokemon.getName() %>">
                <!-- Nombre del Pokémon -->
                <div class="name"><%= pokemon.getName() %></div>
                <!-- Número del Pokémon -->
                <div><%= pokemon.getNum() %></div>
                <!-- Tipos del Pokémon -->
                <p>Tipo:</p>
                <div class="types">
                    <% 
                        // Iterar sobre la lista de tipos y mostrarlos
                        for (String type : pokemon.getTypes()) {
                    %>
                    <!-- Span para cada tipo -->
                    <span class="type <%= type %>"><%= type %></span>
                    <% } %>
                </div>

                <p>Debilidades:</p>

                <div class="weaknesses">
                    <% 
                        for (String Weaknesses : pokemon.getWeaknesses()) {
                    %>
                    <span class="type <%= Weaknesses %>"><%= Weaknesses %></span>
                    <% } %>
                </div>

                <!-- Evoluciones siguientes del Pokémon -->
                <p>Evoluciones siguientes:</p>
                <div class="next-evolutions">
                    <%
                        // Verificar si hay evoluciones siguientes
                        if (!pokemon.getEvoluciones().isEmpty()) {
                            // Iterar sobre la lista de evoluciones siguientes y mostrar los nombres
                            for (String nextEvolution : pokemon.getEvoluciones()) {
                    %>
                    <!-- Span para cada evolución siguiente -->
                    <span class="next-evolution"><%= nextEvolution %></span>
                    <% 
                            }
                        } else {
                    %>
                    <!-- Mensaje si no hay evoluciones siguientes -->
                    <span class="no-evolution">No tiene evolución</span>
                    <% } %>
                </div>
            </div>
            <% // Cerrar el bloque for
                      } 
            %>
        </div>
    </body>
</html>
