Funcion resultado <- suma ( sumando1, sumando2 )
	resultado<-sumando1+sumando2
Fin Funcion

Funcion resultado <- resta ( minuendo, sustraendo )
	resultado<-minuendo-sustraendo
Fin Funcion

Funcion resultado <- multiplicaci�n ( multiplicando1, multiplicando2 )
	resultado<-multiplicando1*multiplicando2
Fin Funcion

Funcion resultado <- divisi�n ( dividendo1, divisor2 )
	resultado<-dividendo1/divisor2
Fin Funcion

Algoritmo Programa_calculadora
	Repetir
		Escribir "Introduce un n�mero:"
		Leer num1
		Escribir "Introduce un segundo n�mero:"
		Leer num2
		Escribir "Elige una opci�n"
		Escribir "1.- Suma"
		Escribir "2.- Resta"
		Escribir "3.- Multiplicaci�n"
		Escribir "4.- Divisi�n"
		Leer elecci�n
		Segun elecci�n Hacer
			1:
				res<-suma(num1, num2)
				Escribir "La suma de ", num1, " + ", num2, " es ", res
			2:
				res<-resta(num1, num2)
				Escribir "La resta de ", num1, " - ", num2, " es ", res
			3:
				res<-multiplicaci�n(num1, num2)
				Escribir "La multiplicaci�n de ", num1, " * ", num2, " es ", res
			4:
				res<-divisi�n(num1, num2)
				Escribir "La divisi�n de ", num1, " : ", num2, " es ", res
				
			De Otro Modo:
				Escribir "No s� qu� operaci�n quieres hacer"
		Fin Segun
	Hasta Que elecci�n=1 o elecci�n=2 o elecci�n=3 o elecci�n=4
FinAlgoritmo