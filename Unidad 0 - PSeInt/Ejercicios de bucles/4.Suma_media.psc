Algoritmo suma_media
	Escribir "�Cu�ntos n�meros quieres introducir?"
	Leer numeros_a_introducir
	Si numeros_a_introducir <= 1 Entonces
		Escribir "�Tienes que introducir m�s de 1 n�mero!"
	SiNo
		i <- 1
		num <- 0
		Mientras i <= numeros_a_introducir Hacer
			Escribir "Introduce el n�mero:"
			Leer n
			num = num + n
			i = i + 1
		Fin Mientras
		res = num / numeros_a_introducir
		Escribir "La media de los " numeros_a_introducir " n�meros es: " res
	Fin Si
FinAlgoritmo