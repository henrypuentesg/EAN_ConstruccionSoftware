package ejercicio_01_05;

import java.util.Scanner;

public class Ejercicio_01_05 {

	public void menuRestaurante() {

		System.out.println("Inicio, Ejercicio 5 - El restaurante");
		System.out.println("");

		Scanner scan = new Scanner(System.in);

		int tipoDeComida, plato, orden, cantidad;

		double descuento, precio, precioDescuento;

		System.out.println("Este es el menú del restaurante.\n" + "Presione 1 para platos vegetarianos.\n"
				+ "Presione 2 para platos no vegetarianos.\n" + "Presione 3 para comidas rápidas.");
		tipoDeComida = scan.nextInt();

		switch (tipoDeComida) {
		case 1:
			System.out.println("Las comidas vegetarianas son: \n" + "1 - Sopa de vegetales $10'000 COP\n"
					+ "2 - Ensalada $25'000 COP\n" + "3 - Jugos $5'000 COP\n"
					+ "Ingrese el número de la comida que desea: ");
			plato = scan.nextInt();
			descuento = 0.8;

			switch (plato) {
			case 1:
				orden = 10000;
				break;
			case 2:
				orden = 25000;
				break;
			case 3:
				orden = 5000;
				break;
			default:
				System.out.println("El programa terminará");
				orden = 0;
			}
			break;
		case 2:
			System.out.println("Las comidas NO vegetarianas son: \n" + "1 - Bandeja de carne $30'000 COP\n"
					+ "2 - Bandeja de pollo $28'000 COP\n" + "Ingrese el número de la comida que desea: ");
			plato = scan.nextInt();
			descuento = 0.9;

			switch (plato) {
			case 1:
				orden = 30000;
				break;
			case 2:
				orden = 28000;
				break;
			default:
				System.out.println("El programa terminará");
				orden = 0;
			}
			break;
		case 3:
			System.out.println("Las comidas rapidas son: \n" + "1 - Perro caliente $5'000 COP\n"
					+ "2 - Hamburguesa $7'000 COP\n" + "Ingrese el número de la comida que desea: ");
			plato = scan.nextInt();
			descuento = 1.0;

			switch (plato) {
			case 1:
				orden = 5000;
				break;
			case 2:
				orden = 7000;
				break;
			default:
				System.out.println("El programa terminará");
				orden = 0;
			}
			break;
		default:
			System.out.println("El programa terminará");
			orden = 0;
			descuento = 0;
		}
		System.out.println("Ingrese la cantidad de unidades que desea: ");
		cantidad = scan.nextInt();
		precio = (double) orden * cantidad * 1.19;
		precioDescuento = precio * descuento;
		System.out
				.println("El precio de la orden, incluyendo impuestos y descuento es:\n" + precioDescuento + " pesos");

		System.out.println("");
		System.out.println("Fin, Ejercicio 5 - El restaurante");
		System.out.println("");
	}

}
