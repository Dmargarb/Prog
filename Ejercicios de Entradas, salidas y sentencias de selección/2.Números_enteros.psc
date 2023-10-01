Algoritmo Números_enteros
	Escribir "Introduce un número positivo o negativo:"
	Leer n
	Si n=0 Entonces
		Escribir "Tu número no es ni positivo ni negativo"
	SiNo
		Si n>0 Entonces
			Escribir "Tu número es positivo"
		SiNo
			Si n<0 Entonces
				Escribir "Tu número es negativo"
			SiNo
				Escribir "No he entendido tu número"
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
