Algoritmo Sueldo
	Escribir "Ingrese su sueldo:"
	Leer sueldo_original
	Si sueldo_original >= 500.000 Entonces
		aumento = (sueldo_original * 12) / 100
		sueldo_nuevo = sueldo_original + aumento
		Escribir "Tu nuevo sueldo tendrá un aumento de " aumento, " euros, siendo en total " sueldo_nuevo " euros."
	SiNo
		aumento = (sueldo_original * 15) / 100
		sueldo_nuevo = sueldo_original + aumento
		Escribir "Tu nuevo sueldo tendrá un aumento de " aumento, " euros, siendo en total " sueldo_nuevo " euros."
	Fin Si
FinAlgoritmo