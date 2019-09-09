package main;

import java.util.Scanner;

import ejercicio00.Pendulo;
import ejercicio01.Ascensor;

public class Main {

	public static void main(String[] args) {

		int opcion = -1;
		int opcion2 = -1;

		Scanner scan = new Scanner(System.in);

		while (opcion != 0) {
			System.out.println("\n");

			System.out.println("Seleccione el Ejercicio a valorar: \n" + "1 - Metodos Pendulo. \n" + "2 - Ascensor. \n"
					+ "0 - Salir.");

			opcion = scan.nextInt();

			switch (opcion) {
			case 1:

				System.out.println("Ingrese la longitud del pendulo (separador decimal \",\")");
				double longitud = scan.nextDouble();
				System.out.println("Ingrese la Aceleracion Gravitacional del Pendulo:");
				// 9.81 Aceleracion Gravitacional
				double aceleracionGavitacional = scan.nextDouble();

				Pendulo pendulo = new Pendulo(longitud, aceleracionGavitacional);
				pendulo.periodoOscilacion();
				break;
			case 2:

				System.out.println("Ingrese la siguiente informacion del Edificio: ");
				System.out.println("Cantidad de Pisos: ");
				int cantidadPisos = scan.nextInt();
				System.out.println("Cantidad de Sotanos: ");
				int cantidadsotanos = scan.nextInt();

				Ascensor ascensor = new Ascensor(cantidadPisos, cantidadsotanos);

				System.out.println("Ingrese el Piso Actual: ");
				int pisoActual = scan.nextInt();

				while (opcion2 != 0) {
					System.out.println("\n");

					System.out.println(
							"Seleccione Las Opciones de validacion para el Ascensor: \n" + "1 - Piso Siguiente. \n"
									+ "2 - Piso Anterior. \n" + "3 - Pisos con Servicio. \n" + "0 - Salir.");

					opcion2 = scan.nextInt();

					switch (opcion2) {
					case 1:
						ascensor.pisoSiguente(pisoActual);
						break;
					case 2:
						ascensor.pisoAnterior(pisoActual);
						break;
					case 3:
						ascensor.cantidadPisosServicio();
						break;
					default:
						System.out.println("Seleccione una opcion Valida");
						break;
					}
				}

			default:
				System.out.println("Seleccione una opcion Valida");
				break;
			}

		}

	}

}
