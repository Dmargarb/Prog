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

Algoritmo Calculadora
	Escribir "Bienvenido a mi calculadora"
	Repetir
		Escribir "Elige una opci�n"
		Escribir "1.- Suma"
		Escribir "2.- Resta"
		Escribir "3.- Multiplicaci�n"
		Escribir "4.- Divisi�n"
		Leer elecci�n
		Segun elecci�n Hacer
			1:
				Escribir "Introduce el primer sumando:"
				Leer sum1
				Escribir "Introduce el segundo sumando:"
				Leer sum2
				res<-suma(sum1, sum2)
				Escribir "La suma de ", sum1, " + ", sum2, " es ", res
			2:
				Escribir "Introduce el primer minuendo:"
				Leer min
				Escribir "Introduce el segundo sustraendo:"
				Leer sus
				res<-resta(min, sus)
				Escribir "La resta de ", min, " - ", sus, " es ", res
			3:
				Escribir "Introduce el primer multiplicando:"
				Leer mul1
				Escribir "Introduce el segundo multiplicando:"
				Leer mul2
				res<-multiplicaci�n(mul1, mul2)
				Escribir "La multiplicaci�n de ", mul1, " * ", mul2, " es ", res
			4:
				Escribir "Introduce el dividendo:"
				Leer div1
				Escribir "Introduce el divisor:"
				Leer div2
				res<-divisi�n(div1, div2)
				Escribir "La divisi�n de ", div1, " : ", div2, " es ", res
				
			De Otro Modo:
				Escribir "No s� qu� operaci�n quieres hacer"
		Fin Segun
	Hasta Que elecci�n=1 o elecci�n=2 o elecci�n=3 o elecci�n=4
FinAlgoritmo
