Algoritmo suma_media
	Escribir "¿Cuántos números quieres introducir?"
	Leer numeros_a_introducir
	Si numeros_a_introducir <= 1 Entonces
		Escribir "¡Tienes que introducir más de 1 número!"
	SiNo
		i <- 1
		num <- 0
		Mientras i <= numeros_a_introducir Hacer
			Escribir "Introduce el número:"
			Leer n
			num = num + n
			i = i + 1
		Fin Mientras
		res = num / numeros_a_introducir
		Escribir "La media de los " numeros_a_introducir " números es: " res
	Fin Si
FinAlgoritmo