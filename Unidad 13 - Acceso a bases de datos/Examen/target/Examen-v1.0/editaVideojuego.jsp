<%-- 
    Document   : editaVideojuego
    Created on : 
    Author     : David Martín García 
--%>

<!-- 
Este JSP es casi idéntico a agregaVideojuego.jsp (cambia el título, el texto del botón de confirmación y, si quieres, los colores)
Como es un formulario para hacer modificaciones, los datos ya existentes del videojuego deben aparecer en él al cargarse
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--Importa Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Importa materialize.css--> 
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <title>Editar videojuego</title>
    </head>    
    <body>
        <div class="container">
            <div class="row"></div>
            <div class="row s12 m12 l12">
                <div class="card lime lighten-5">
                    <h2 class="center" style="color:#006064"><b>Editar videojuego</b></h2>
                    <table class="striped centered responsive-table">
                        <thead><th></th><th></th></thead>
                        <form method="post" action="guardaVJModificado.jsp">
                            <tr>
                                <td>
                                    <div class="input-field">
                                        <input type="number" name="identificador" id="identificador" value="<%=request.getParameter("identificador") %>" readonly required>
                                        <label for="identificador">Indentificador</label>
                                    </div>
                                </td>
                                <td>
                                    <div class="input-field">
                                        <input type="text" name="nombre" id="nombre" value="<%=request.getParameter("nombre") %>" required>
                                        <label for="nombre">Título</label>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div class="input-field">
                                        <input type="date" class="datepicker" name="fecha" id="fecha" value="<%=request.getParameter("fecha") %>" required>
                                        <label for="fecha">Fecha de lanzamiento</label>
                                    </div>
                                </td>
                                <td>
                                    <div class="input-field">
                                        <input type="number" name="precio" id="precio" min=0 max=100 step=".01" value="<%=request.getParameter("precio") %>" required>
                                        <label for="precio">Precio</label>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2" style="width:100%">
                                    <div class="input-field">
                                        <input type="text" name="descripcion" id="descripcion" value="<%=request.getParameter("descripcion") %>" required>
                                        <label for="descripcion">Descripción corta</label>
                                    </div>
                                </td>
                            </tr>    
                            <tr>
                                <td colspan="2" style="width:100%">
                                    <div class="input-field">
                                        <input type="text" name="imagen" id="imagen" value="<%=request.getParameter("imagen") %>" required>
                                        <label for="imagen">URL a imagen de cabecera</label>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2" style="width:100%">
                                    <button class="btn waves-effect waves-light center amber darken-4" style="width:150px" name="cancelar" onClick="window.location.href='index.jsp';">
                                        Cancelar
                                        <i class="material-icons left">arrow_back</i>
                                    </button>
                                    <button class="btn waves-effect waves-light center cyan darken-4" style="width:150px" type="submit" name="aceptar">
                                        Aceptar
                                        <i class="material-icons right">add_circle_outline</i>
                                    </button>
                                </td>
                            </tr>
                        </form> 
                    </table> 
                </div>
            </div>
        </div>
        
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <!-- Materialize -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <script>
            $('.datepicker').pickadate({
                // The title label to use for the month nav buttons
                labelMonthNext: 'Mes siguiente',
                labelMonthPrev: 'Mes anterior',

                // The title label to use for the dropdown selectors
                labelMonthSelect: 'Selecciona un mes',
                labelYearSelect: 'Selecciona un año',

                // Months and weekdays
                monthsFull: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'],
                monthsShort: ['Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic'],
                weekdaysFull: ['Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado'],
                weekdaysShort: ['Dom', 'Lun', 'Mar', 'Mié', 'Jue', 'Vie', 'Sab'],

                // Materialize modified
                weekdaysLetter: ['D', 'L', 'M', 'X', 'J', 'V', 'S'],

                // Today and clear
                today: 'Hoy',
                clear: 'Limpiar',
                close: 'Cerrar',
                format: "yyyy-mm-dd",
                showOtherMonths: true,
                selectOtherMonths: true,
                selectMonths: true, // Creates a dropdown to control month
                selectYears: 100, // Creates a dropdown of 15 years to control year
                max: true,
                firstDay: 1
            });
        </script>
    </body>
</html>

