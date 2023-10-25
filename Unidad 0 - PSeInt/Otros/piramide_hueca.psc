Algoritmo piramide_hueca
    Escribir "Introduce la altura de la pirámie: " Sin Saltar
    Leer altura
    Para i <- 1 Hasta altura Con Paso 1 Hacer
        Para espacio <- 1 Hasta altura - i Con Paso 1 Hacer
            Escribir "  " Sin Saltar
        Fin Para
        Para asterisco <- 1 Hasta 2 * i - 1 Con Paso 1 Hacer
            Si i = 1 O i = altura O asterisco = 1 O asterisco = 2 * i - 1 Entonces
                Escribir "* " Sin Saltar
            Sino
                Escribir "  " Sin Saltar
            Fin Si
        Fin Para
        Escribir " "
    Fin Para
FinAlgoritmo