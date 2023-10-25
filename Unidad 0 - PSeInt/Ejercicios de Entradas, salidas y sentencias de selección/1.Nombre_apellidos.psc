Algoritmo Nombre_apellidos
	Escribir "Introduce tu nombre:"
	Leer n
	Escribir "Introduce tu primer apellido:"
	Leer a1
	Escribir "Introduce tu segundo apellido:"
	Leer a2
	Escribir "Introduce tu género (H/M):"
	Leer genero
	Si genero="H" Entonces
		Escribir "Bienvenido, Sr. " n," " a1, " " a2
	SiNo
		Si genero="M" Entonces
			Escribir "Bienvenida, Sra. " n," " a1, " " a2
		SiNo
			Escribir "No he entendido su género"
		Fin Si
	Fin Si
FinAlgoritmo