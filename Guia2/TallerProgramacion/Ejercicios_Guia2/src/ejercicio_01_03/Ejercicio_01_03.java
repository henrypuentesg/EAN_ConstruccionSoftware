package ejercicio_01_03;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ejercicio_01_03 {

	Scanner scan = new Scanner(System.in);
	int capacidad;
	int personas;
	int viajes;
	int pagoColectivo;
	int pagoPropietario;
	
	NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();

	public void capacidadColectivo() {

		System.out.println("Inicio, Ejercicio 3 - El Colectivo");
		System.out.println("");

		System.out.println("Ingrese la capacidad del colectivo y el número de pasajeros\n" + "Capacidad:");
		capacidad = scan.nextInt();
		System.out.println("Pasajeros:");
		personas = scan.nextInt();

		if (personas % capacidad == 0) {
			viajes = personas / capacidad;
		} else {
			viajes = personas / capacidad + 1;
		}
		pagoColectivo = personas * 10000;
		pagoPropietario = viajes * 2000;

		System.out.println("El colectivo hará " + viajes + " viajes.\n" + "Los turistas deberán pagar " + formatoImporte.format(pagoColectivo)
				+ " \n" + "El conductor pagará " + formatoImporte.format(pagoPropietario) + " al propietario.");

		System.out.println("");
		System.out.println("Fin, Ejercicio 3 - El Colectivo");
		System.out.println("");
	}

}
