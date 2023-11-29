Funcion Piramide ( altura )
	Para fila <- 1 Hasta altura Con Paso 1 Hacer
		Para espacios <- 1 Hasta altura-fila Con Paso 1 Hacer
			Escribir " " Sin Saltar
		Fin Para
		Para estrellas <- 1 Hasta 2*fila-1 Con Paso 1 Hacer
			Escribir "*" Sin Saltar
		FinPara
		Escribir ""
	FinPara
Fin Funcion

Funcion Piramide_invertida ( altura )
	Para fila <- altura Hasta 1 Con Paso -1 Hacer
		Para espacios <- 1 Hasta altura-fila Con Paso 1 Hacer
			Escribir " " Sin Saltar
		Fin Para
		Para estrellas <- 1 Hasta 2*fila-1 Con Paso 1 Hacer
			Escribir "*" Sin Saltar
		FinPara
		Escribir ""
	FinPara
Fin Funcion

Algoritmo Rombo
	Definir altura Como Entero
	Escribir "¿De cuántos pisos quieres el rombo?" Sin Saltar
	Leer altura
	Escribir "Piramide"
FinAlgoritmo