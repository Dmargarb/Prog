Algoritmo repaso6
	Definir valor1, valor2, operacion Como Entero
	Definir resultado Como Real
	Escribir "Introduzca el primer valor: " Sin Saltar
	Leer valor1
	Escribir "Introduzca el segundo valor: " Sin Saltar
	Leer valor2
	Repetir
	Escribir "Introduzca el número de la opción que necesite"
	Escribir "1.- Suma"
	Escribir "2.- Resta"
	Escribir "3.- Multiplicación"
	Escribir "4.- División"
	Leer operacion
		Segun operacion Hacer
			1:
				resultado=valor1+valor2
				Escribir "La suma de " valor1, " y " valor2 " es: " resultado, "."
			2:
				resultado=valor1-valor2
				Escribir "La resta de " valor1, " y " valor2 " es: " resultado, "."
			3:
				resultado=valor1*valor2
				Escribir "La multiplicación de " valor1, " y " valor2 " es: " resultado, "."
			4:
				resultado=valor1/valor2
				Escribir "La división de " valor1, " y " valor2 " es: " resultado, "."
			De Otro Modo:
				Escribir "¡Seleccione una opción válida!"
		Fin Segun
	Hasta Que operacion=1 o operacion=2 o operacion=3 o operacion=4
FinAlgoritmo