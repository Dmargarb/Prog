Algoritmo piramide
	Escribir "¿De cuántos pisos quieres la piramide?"
	Leer n
	Para a <- n Hasta 1 Con Paso -1 Hacer
		Para b <- 1 Hasta a Con Paso 1 Hacer
			Escribir " " Sin Saltar
		Fin Para
		Para c <- a Hasta n Con Paso 1 Hacer
			Escribir "* " Sin Saltar
		FinPara
		Escribir "  "
	FinPara
FinAlgoritmo