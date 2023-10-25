Algoritmo divisores
	Definir num, div, res Como Entero
	Escribir "Introduzca un número: " Sin Saltar
	Leer num
	div <- 1
	Escribir "Los divisores propios de " num " son: " Sin Saltar
	Para div <- 1 Hasta num-1 Con Paso 1 Hacer
		Si num MOD div = 0 Entonces
			res<-div+res
			Escribir div " " Sin Saltar
		Fin Si
	Fin Para
	Escribir "y la suma de los mismos es: " res "." Sin Saltar
	Escribir ""
FinAlgoritmo