Algoritmo Tienda
	Escribir "¿Cuántos zapatos desea comprar?"
	Leer zapatos
	Si zapatos < 10 Entonces
		precio_sin_desc = 80 * zapatos
		Escribir "Tu compra tendrá un precio total de " precio_sin_desc " euros."
	SiNo
		Si zapatos >= 10 y zapatos < 20 Entonces
			desc = (zapatos * 10) / 100
			precio_sin_desc = 80 * zapatos
			precio_con_desc = precio_sin_desc - desc
			Escribir "Tu compra tendrá un descuento de " desc, " euros, siendo en total " precio_con_desc " euros."
		SiNo
			Si zapatos >= 20 y zapatos < 30 Entonces
				desc = (zapatos * 20) / 100
				precio_sin_desc = 80 * zapatos
				precio_con_desc = precio_sin_desc - desc
				Escribir "Tu compra tendrá un descuento de " desc, " euros, siendo en total " precio_con_desc " euros."
			SiNo
				Si zapatos >= 30 Entonces
					desc = (zapatos * 40) / 100
					precio_sin_desc = 80 * zapatos
					precio_con_desc = precio_sin_desc - desc
					Escribir "Tu compra tendrá un descuento de " desc, " euros, siendo en total " precio_con_desc " euros."
				SiNo
					Escribir "No entendí lo que me dijiste."
				Fin Si
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo