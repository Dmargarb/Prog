Algoritmo Numero_primo
	Escribir "Introduce un n�mero"
	Leer n
	Para i<-1 Hasta n Con Paso 1 Hacer
		Si n MOD i = 0 Entonces
			c<-c+1
		Fin Si
	Fin Para
	Si c=2 Entonces
		Escribir "El n�mero " n " es un n�mero primo."
	SiNo
		Escribir "El n�mero " n " no es un n�mero primo."
	Fin Si
FinProceso