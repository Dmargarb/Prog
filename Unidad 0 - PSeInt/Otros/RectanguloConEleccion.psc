Algoritmo rectangulo
	Definir elección Como Entero
	Repetir
		Escribir "Elige una opción"
		Escribir "1.- Introduzca la dimensión de la base del rectángulo."
		Escribir "2.- Introduzca la dimensión de la altura del rectángulo."
		Escribir "3.- Pinta el rectángulo."
		Escribir "4.- Intercambia base por altura."
		Escribir "5.- Salir."
		Leer elección
		Segun elección Hacer
			1:
				Escribir "1.- Introduzca la dimensión de la base del rectángulo."
				Leer ancho
			2:
				Escribir "2.- Introduzca la dimensión de la altura del rectángulo."
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
				Escribir "No sé qué operación quieres hacer"
		Fin Segun
	Hasta Que elección=5
FinAlgoritmo