Algoritmo Palíndromo
	Definir izq, der Como Entero
	Definir es_palindromo Como Logico
	Repetir
		Escribir "Introduzca frase a comprobar:"
		Leer frase
	Hasta Que Longitud(frase)>1
	izq <- 1
	der <- Longitud(frase)
	es_palindromo <- Verdadero
	Repetir
		Mientras Subcadena(frase,izq,izq) = " " Hacer
			izq <- izq + 1
		Fin Mientras
		Mientras Subcadena(frase,der,der) = " " Hacer
			der <- der - 1
		Fin Mientras
		Si Subcadena(frase,izq,izq) <> Subcadena(frase,der,der) Entonces
			es_palindromo <- Falso
		Fin Si
		izq <- izq + 1
		der <- der - 1
	Hasta Que izq>=der o es_palindromo = Falso
	Si es_palindromo Entonces
		Escribir "La frase introducida es un palíndromo"
	SiNo
		Escribir "La frase introducida NO es un palíndromo"
	Fin Si
FinAlgoritmo