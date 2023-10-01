Algoritmo piramide_invertida
	Escribir "¿De cuántos pisos quieres la piramide?"
	Leer n
	Para a<-n Hasta 1 Con Paso -1 Hacer
		Si a<n Entonces
			Para b<-1 Hasta n-a Con Paso 1 Hacer
				Escribir "  " Sin Saltar
			Fin Para
		Fin Si
		Para c<-1 Hasta a Con Paso 1 Hacer
			Escribir "*" " " Sin Saltar
		Fin Para
		Para d<-a-1 Hasta 1 Con Paso -1 Hacer
			Escribir "*" " " Sin Saltar
		Fin Para
		Escribir ""
	Fin Para
FinAlgoritmo
