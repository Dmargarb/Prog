Algoritmo piramide_invertida
	Definir altura Como Entero
	Escribir "¿De cuántos pisos quieres la piramide?" Sin Saltar
	Leer altura
	Para fila <- altura Hasta 1 Con Paso -1 Hacer
		Para espacios <- 1 Hasta altura-fila Con Paso 1 Hacer
			Escribir " " Sin Saltar
		Fin Para
		Para estrellas <- 1 Hasta 2*fila-1 Con Paso 1 Hacer
			Escribir "*" Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
