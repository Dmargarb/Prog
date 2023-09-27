Algoritmo Termina5
	Escribir "Introduce un número:"
	Leer n
	Si n < 0 Entonces
		n = n * (-1)
	Fin Si
	Si n mod 10 = 5 Entonces
		Escribir "Tu número termina en 5"
	SiNo
		Escribir "Tu número no termina en 5"
	Fin Si
FinAlgoritmo