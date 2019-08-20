package ejercicio_02_03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio_02_03 {

	Integer numero;
	Integer numero2;

	Set numeros = new HashSet();

	int i = 0;

	public void manejoNumeros() {

		System.out.println("Ingrese el primer numero entero: ");
		Scanner scanner = new Scanner(System.in);
		numero = scanner.nextInt();

		// numeros = new int[numero.toString().length()];

		System.out.println(numero);

		while (numero > 0) {
			if (numero % 10 != 0) {
				numeros.add(numero % 10);

				i++;
			}
			numero = numero / 10;
		}

		System.out.println("Ingrese el segundo numero entero: ");
		numero2 = scanner.nextInt();

		// numeros = new int[numero.toString().length()];

		System.out.println(numero2);

		while (numero2 > 0) {
			if (numero2 % 10 != 0) {
				numeros.add(numero2 % 10);
				i++;
			}
			numero2 = numero2 / 10;
		}

	}

	public void imprimirManejoNumeros() {

		for (Object Numeros : numeros) {
			System.out.println(Numeros);
		}

	}

}
