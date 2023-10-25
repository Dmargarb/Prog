Algoritmo repaso8
	Escribir "Introduzca un número " Sin Saltar
	Leer num
	Si num<0 Entonces
		res<-num*(-1)
		Si res MOD 10 = 5 Entonces
			Escribir "Tu número (" num ") acaba en 5."
		SiNo
			Escribir "Tu número (" num ") no acaba en 5."
		Fin Si
	SiNo
		Si num MOD 10 = 5 Entonces
			Escribir "Tu número (" num ") acaba en 5."
		SiNo
			Escribir "Tu número (" num ") no acaba en 5."
		Fin Si
	Fin Si
FinAlgoritmo
