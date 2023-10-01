Algoritmo Cuadrado
	Escribir "¿De cuánta altura quieres el cuadrado?"
	Leer n
	Si n<=0 Entonces
		Escribir "¡Tienes que elegir una altura!"
	SiNo
		para a<-1 hasta n Hacer
			para b<-1 hasta n Hacer
				si a>1 y a<n y b>1 y b<n entonces
					Escribir "  " Sin Saltar
				SiNo
					Escribir "* " Sin Saltar
				FinSi
			FinPara
			Escribir ""
		FinPara
	Fin Si
FinAlgoritmo