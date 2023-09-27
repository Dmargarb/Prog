Algoritmo Sueldo
	Escribir "Ingrese su sueldo:"
	Leer n1
	Si n1 >= 500.000 Entonces
		n2 = (n1 * 12) / 100
		n3 = n1 + n2
		Escribir "Tu nuevo sueldo tendrá un aumento de " n2, " euros, siendo en total " n3 " euros."
	SiNo
		n2 = (n1 * 15) / 100
		n3 = n1 + n2
		Escribir "Tu nuevo sueldo tendrá un aumento de " n2, " euros, siendo en total " n3 " euros."
	Fin Si
FinAlgoritmo