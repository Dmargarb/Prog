Algoritmo Numero_primo
	Escribir "Introduce un número"
	Leer n
	Para i<-1 Hasta n Con Paso 1 Hacer
		Si n MOD i = 0 Entonces
			c<-c+1
		Fin Si
	Fin Para
	Si c=2 Entonces
		Escribir "El número " n " es un número primo."
	SiNo
		Escribir "El número " n " no es un número primo."
	Fin Si
FinProceso