Algoritmo repaso6
	Definir valor1, valor2, operacion Como Entero
	Definir resultado Como Real
	Escribir "Introduzca el primer valor: " Sin Saltar
	Leer valor1
	Escribir "Introduzca el segundo valor: " Sin Saltar
	Leer valor2
	Repetir
	Escribir "Introduzca el n�mero de la opci�n que necesite"
	Escribir "1.- Suma"
	Escribir "2.- Resta"
	Escribir "3.- Multiplicaci�n"
	Escribir "4.- Divisi�n"
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
				Escribir "La multiplicaci�n de " valor1, " y " valor2 " es: " resultado, "."
			4:
				resultado=valor1/valor2
				Escribir "La divisi�n de " valor1, " y " valor2 " es: " resultado, "."
			De Otro Modo:
				Escribir "�Seleccione una opci�n v�lida!"
		Fin Segun
	Hasta Que operacion=1 o operacion=2 o operacion=3 o operacion=4
FinAlgoritmo