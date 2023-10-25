rombo hueco
Funcion rombo (altura)
    para fila <- 1 hasta altura Con Paso 1 Hacer
        Para espacios<-1 Hasta altura - fila Con Paso 1 Hacer
            escribir " " Sin Saltar
        Fin Para
        Para asteriscos<-1 Hasta 2fila - 1 Con Paso 1 Hacer
            Si asteriscos = 1 O asteriscos = 2fila - 1 Entonces
                escribir "" Sin Saltar
            Sino
                escribir " " Sin Saltar
            Fin Si
        Fin Para
        escribir ""
    FinPara
Fin Funcion

Funcion rombo_invertido (altura)
    para fila <- altura-1 hasta 1 Con Paso -1 Hacer
        Para espacios<-1 Hasta altura - fila Con Paso 1 Hacer
            escribir " " Sin Saltar
        Fin Para
        Para asteriscos<-1 Hasta 2fila - 1 Con Paso 1 Hacer
            Si asteriscos = 1 O asteriscos = 2fila - 1 Entonces
                escribir "" Sin Saltar
            Sino
                escribir " " Sin Saltar
            Fin Si
        Fin Para
        escribir ""
    FinPara
Fin Funcion

Algoritmo RomboHueco
    Escribir "Dime la altura de tu rombo"
    Leer altura
    rombo(altura)
    rombo_invertido(altura)
FinAlgoritmo