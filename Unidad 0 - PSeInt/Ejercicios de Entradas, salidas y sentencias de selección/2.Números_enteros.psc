Algoritmo N�meros_enteros
	Escribir "Introduce un n�mero positivo o negativo:"
	Leer n
	Si n=0 Entonces
		Escribir "Tu n�mero no es ni positivo ni negativo"
	SiNo
		Si n>0 Entonces
			Escribir "Tu n�mero es positivo"
		SiNo
			Si n<0 Entonces
				Escribir "Tu n�mero es negativo"
			SiNo
				Escribir "No he entendido tu n�mero"
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
