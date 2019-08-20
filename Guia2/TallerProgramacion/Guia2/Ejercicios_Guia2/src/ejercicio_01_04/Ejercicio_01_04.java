package ejercicio_01_04;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ejercicio_01_04 {

	int selection, price;

	NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();
	
	public void calculadoraImpuestosVehiculares() {

		System.out.println("Inicio, Ejercicio 4 - Impuesto Vehicular");
		System.out.println("");

		System.out.println("CALCULADORA DE IMPUESTO DE VENTA A VEHICULO");

		System.out.println("1. CAMIONETA\n2. AUTOMOVIL");

		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese el numero correspondiente al tipo de vehiculo: ");

		selection = scan.nextInt();

		System.out.println("Ingrese el precio del vehiculo: ");

		price = scan.nextInt();

		int tax = 0;

		int total = 0;

		if (selection == 1 && price < 80) {

			tax = 0;

			total = tax + price;

			System.out.println("El impuesto de venta es: " + formatoImporte.format(tax));

			System.out.println("El precio neto es: " + formatoImporte.format(total));

		}

		if (selection == 1 && price >= 80) {

			tax = price / 2;

			total = tax + price;

			System.out.println("El impuesto de venta es: " + formatoImporte.format(tax));

			System.out.println("El precio neto es: " + formatoImporte.format(total));

		}

		if (selection == 2 && price < 20) {

			tax = 5;

			total = tax + price;

			System.out.println("El impuesto de venta es: " + tax);

			System.out.println("El precio neto es: " + total);

		}

		if (selection == 2 && (price >= 20 && price <= 40)) {

			tax = price / 5;

			total = tax + price;

			System.out.println("El impuesto de venta es: " + tax);

			System.out.println("El precio neto es: " + total);

		}

		if (selection == 2 && price > 40) {

			tax = 9;

			total = tax + price;

			System.out.println("El impuesto de venta es: " + tax);

			System.out.println("El precio neto es: " + total);

		}

		System.out.println("");
		System.out.println("Fin, Ejercicio 4 - Impuesto Vehicular");
		System.out.println("");
		
	}

}
