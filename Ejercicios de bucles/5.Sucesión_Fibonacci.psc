Algoritmo sucesi�n_Fibonacci
	Escribir "�Cu�ntos n�meros quieres mostrar de la sucesi�n de Fibonacci?"
	Leer num
	n1 <- 0
	n2 <- 1
	Para i<-1 Hasta num Con Paso 1 Hacer
		Escribir n1 " " Sin Saltar
		res<-n1+n2
		n1<-n2
		n2<-res
	FinPara
FinAlgoritmo