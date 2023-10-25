Algoritmo imc
	Escribir "Introduce tu estatura (m):"
	Leer est
	Escribir "Introduce tu peso (kg):"
	Leer pes
	resultado<-pes/(est^2)
	Si resultado < 18.5 Entonces
		Escribir "Tu IMC es de: " resultado, ", tienes un peso inferior al normal."
	SiNo
		Si resultado >= 18.5 y resultado <= 24.99 Entonces
			Escribir "Tu IMC es de: " resultado, ", tienes un peso normal."
		SiNo
			Si resultado >= 25 y resultado <= 29.99 Entonces
				Escribir "Tu IMC es de: " resultado, ", tienes un peso superior al normal."
			SiNo
				Escribir "Tu IMC es de: " resultado, ", tienes obesidad."
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo