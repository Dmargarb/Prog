Algoritmo Tienda
	Escribir "�Cu�ntos zapatos desea comprar?"
	Leer zapatos
	Si zapatos < 10 Entonces
		precio_sin_desc = 80 * zapatos
		Escribir "Tu compra tendr� un precio total de " precio_sin_desc " euros."
	SiNo
		Si zapatos >= 10 y zapatos < 20 Entonces
			desc = (zapatos * 10) / 100
			precio_sin_desc = 80 * zapatos
			precio_con_desc = precio_sin_desc - desc
			Escribir "Tu compra tendr� un descuento de " desc, " euros, siendo en total " precio_con_desc " euros."
		SiNo
			Si zapatos >= 20 y zapatos < 30 Entonces
				desc = (zapatos * 20) / 100
				precio_sin_desc = 80 * zapatos
				precio_con_desc = precio_sin_desc - desc
				Escribir "Tu compra tendr� un descuento de " desc, " euros, siendo en total " precio_con_desc " euros."
			SiNo
				Si zapatos >= 30 Entonces
					desc = (zapatos * 40) / 100
					precio_sin_desc = 80 * zapatos
					precio_con_desc = precio_sin_desc - desc
					Escribir "Tu compra tendr� un descuento de " desc, " euros, siendo en total " precio_con_desc " euros."
				SiNo
					Escribir "No entend� lo que me dijiste."
				Fin Si
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo