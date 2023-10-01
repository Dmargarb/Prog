Algoritmo suma_number
	Escribir "¿Cuántos números quieres sumar?"
	Leer num
	res <- 0
	Para i<-1 Hasta num Con Paso 1 Hacer
		res <- res + i
	Fin Para
	Escribir "La suma de todos los números hasta " num " es: " res "."
FinAlgoritmo