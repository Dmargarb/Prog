Algoritmo repaso8
	Escribir "Introduzca un n�mero " Sin Saltar
	Leer num
	Si num<0 Entonces
		res<-num*(-1)
		Si res MOD 10 = 5 Entonces
			Escribir "Tu n�mero (" num ") acaba en 5."
		SiNo
			Escribir "Tu n�mero (" num ") no acaba en 5."
		Fin Si
	SiNo
		Si num MOD 10 = 5 Entonces
			Escribir "Tu n�mero (" num ") acaba en 5."
		SiNo
			Escribir "Tu n�mero (" num ") no acaba en 5."
		Fin Si
	Fin Si
FinAlgoritmo
