Funcion resultado <- suma ( sumando1, sumando2 )
	resultado<-sumando1+sumando2
Fin Funcion

Funcion resultado <- resta ( minuendo, sustraendo )
	resultado<-minuendo-sustraendo
Fin Funcion

Funcion resultado <- multiplicación ( multiplicando1, multiplicando2 )
	resultado<-multiplicando1*multiplicando2
Fin Funcion

Funcion resultado <- división ( dividendo1, divisor2 )
	resultado<-dividendo1/divisor2
Fin Funcion

Algoritmo Programa_calculadora
	Repetir
		Escribir "Introduce un número:"
		Leer num1
		Escribir "Introduce un segundo número:"
		Leer num2
		Escribir "Elige una opción"
		Escribir "1.- Suma"
		Escribir "2.- Resta"
		Escribir "3.- Multiplicación"
		Escribir "4.- División"
		Leer elección
		Segun elección Hacer
			1:
				res<-suma(num1, num2)
				Escribir "La suma de ", num1, " + ", num2, " es ", res
			2:
				res<-resta(num1, num2)
				Escribir "La resta de ", num1, " - ", num2, " es ", res
			3:
				res<-multiplicación(num1, num2)
				Escribir "La multiplicación de ", num1, " * ", num2, " es ", res
			4:
				res<-división(num1, num2)
				Escribir "La división de ", num1, " : ", num2, " es ", res
				
			De Otro Modo:
				Escribir "No sé qué operación quieres hacer"
		Fin Segun
	Hasta Que elección=1 o elección=2 o elección=3 o elección=4
FinAlgoritmo