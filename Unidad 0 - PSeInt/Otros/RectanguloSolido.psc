Algoritmo rectangulo
	Definir elecci�n Como Entero
	Repetir
		Escribir "Elige una opci�n"
		Escribir "1.- Introduzca la dimensi�n de la base del rect�ngulo."
		Escribir "2.- Introduzca la dimensi�n de la altura del rect�ngulo."
		Escribir "3.- Pinta el rect�ngulo."
		Escribir "4.- Intercambia base por altura."
		Escribir "5.- Salir."
		Leer elecci�n
		Segun elecci�n Hacer
			1:
				Escribir "1.- Introduzca la dimensi�n de la base del rect�ngulo."
				Leer ancho
			2:
				Escribir "2.- Introduzca la dimensi�n de la altura del rect�ngulo."
				Leer altura
			3:
				Para fila <- 1 Hasta altura Con Paso 1 Hacer
					Para columna <- 1 Hasta ancho Con Paso 1 Hacer
						Escribir Sin Saltar "* "
					Fin Para
					Escribir " "
				Fin Para
			4:
				
			5: 
				Escribir "Saliendo."
				
			De Otro Modo:
				Escribir "No s� qu� operaci�n quieres hacer"
		Fin Segun
	Hasta Que elecci�n=5
FinAlgoritmo