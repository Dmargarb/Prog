Algoritmo Termina5
	Escribir "Introduce un n�mero:"
	Leer n
	Si n < 0 Entonces
		n = n * (-1)
		Si n mod 10 = 5 Entonces
			Escribir "Tu n�mero termina en 5"
		SiNo
			Escribir "Tu n�mero no termina en 5"
		Fin Si
	SiNo
		Si n mod 10 = 5 Entonces
			Escribir "Tu n�mero termina en 5"
		SiNo
			Escribir "Tu n�mero no termina en 5"
		Fin Si
	Fin Si
FinAlgoritmo