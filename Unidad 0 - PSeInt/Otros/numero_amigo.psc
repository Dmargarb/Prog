Funcion suma <- SumaDivisores (A)
	sumaDivA <- 0
	Para divisor <- 2 Hasta A Con Paso 1 Hacer
		resto <- A MOD divisor
		Si resto = 0 Entonces
			sumaDivA <- sumaDivA + divisor
		FinSi
	FinPara
	suma <- sumaDivA - A +1
Fin Funcion
Algoritmo divisores_suma
	Definir A, B Como Entero
	Escribir "Introduzca un número: " Sin Saltar
	Leer A
	Escribir "Introduzca un segundo número: " Sin Saltar
	Leer B
	sumaA <- SumaDivisores (A)
	sumaB <- SumaDivisores (B)
	res <- (sumaA = B) & (sumaB = A)
	Si  res = Verdadero Entonces
		Escribir "Los dos números SÍ son amigos"
	Sino
		Escribir "Los dos números NO son amigos"
	FinSi
FinAlgoritmo