Algoritmo repaso1
	Definir nombre, genero Como Caracter
	Escribir "Escribe tu nombre y apellidos: " Sin Saltar
	Leer nombre
	Repetir
		Escribir "Escribe tu género (m/f): " Sin Saltar
		Leer genero
		Si genero = "m" Entonces
			Escribir "Bienvenido Sr. " nombre "."
		SiNo
			Si genero = "f" Entonces
				Escribir "Bienvenido Sra. " nombre "."
			SiNo
				Escribir "No entendí tu género."
			Fin Si
		Fin Si
	Hasta Que genero = "m" o genero = "f"
FinAlgoritmo