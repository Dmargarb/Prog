Algoritmo repaso7
	Escribir "Introduzca su estatura (m) " Sin Saltar
	Leer estatura
	Escribir "Introduzca su peso (kg)" Sin Saltar
	Leer peso
	resultado = peso / (estatura^2)
	Si resultado < 18.5 Entonces
		Escribir "Tu IMC es de " resultado, ", tienes un peso inferior al normal."
	SiNo
		Si (resultado>=18.5) y (resultado<=24.9) Entonces
			Escribir "Tu IMC es de " resultado, ", tienes un peso normal."
		SiNo
			Si (resultado>=25) y (resultado<=29.9) Entonces
				Escribir "Tu IMC es de " resultado, ", tienes un peso superior al normal."
			SiNo
				Escribir "Tu IMC es de " resultado, ", tienes obesidad."
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo