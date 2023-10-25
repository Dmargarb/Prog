Algoritmo tresnumeros
	Escribir "Introduce un número:"
	Leer num1
	Escribir "Introduce un segundo número:"
	Leer num2
	Escribir "Introduce un tercer número:"
	Leer num3
	Si num1<=num2 Entonces
		Si num2<=num3 Entonces
			Escribir "Los números ordenados serían: " num1, ", " num2, " y " num3 "."
		SiNo
			Si num1<=num3 Entonces
				Escribir "Los números ordenados serían: " num1, ", " num3, " y " num2 "."
			SiNo
				Escribir "Los números ordenados serían: " num3, ", " num1, " y " num2 "."
			Fin Si
		Fin Si
	SiNo
		Si num3<=num2 Entonces
			Escribir "Los números ordenados serían: " num3, ", " num2, " y " num1 "."
		SiNo
			Si num1<=num3 Entonces
				Escribir "Los números ordenados serían: " num2, ", " num1, " y " num3 "."
			SiNo
				Escribir "Los números ordenados serían: " num2, ", " num3, " y " num1 "."
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
