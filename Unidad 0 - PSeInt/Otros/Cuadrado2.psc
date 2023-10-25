Algoritmo Cuadrado
	Escribir "¿De cuánta altura quieres el cuadrado?" Sin Saltar
	Leer altura
	Para fila<-1 Hasta altura Con Paso 1 Hacer
		Para columna<-1 Hasta altura Con Paso 1 Hacer
			Si fila = 1 o fila = altura o columna = 1 o columna = altura Entonces
				Escribir "*" Sin Saltar
			SiNo
				Escribir " " Sin Saltar
			Fin Si
		Fin Para
		Escribir " "
	Fin Para
FinAlgoritmo