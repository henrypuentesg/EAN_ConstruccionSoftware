package ejercicio_02_01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_02_01 {

	Integer numero;
	int[] numeros;
	int i = 0;

	public void manejoNumeros() {

		System.out.println("Inicio, Ejercicio 2.1 - Manejo De Numeros");
		System.out.println("");
		
		Scanner scanner = new Scanner(System.in);
		numero = scanner.nextInt();

		numeros = new int[numero.toString().length()];

		System.out.println(numero);

		while (numero > 0) {
			if (numero % 10 != 0) {
				numeros[i] = numero % 10;
				i++;
			}
			numero = numero / 10;
		}
	}

	public void imprimirManejoNumeros() {

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("mumero:" + numeros[i]);
		}

	}

	public static void burbuja(int numeros[]) {
		int cuentaintercambios = 0;
		// Usamos un bucle anidado, saldra cuando este ordenado el array
		for (boolean ordenado = false; !ordenado;) {
			for (int i = 0; i < numeros.length - 1; i++) {
				if (numeros[i] > numeros[i + 1]) {
					// Intercambiamos valores
					int variableauxiliar = numeros[i];
					numeros[i] = numeros[i + 1];
					numeros[i + 1] = variableauxiliar;
					// indicamos que hay un cambio
					cuentaintercambios++;
				}
			}
			// Si no hay intercambios, es que esta ordenado.
			if (cuentaintercambios == 0) {
				ordenado = true;
			}
			// Inicializamos la variable de nuevo para que empiece a contar de nuevo
			cuentaintercambios = 0;
		}
	}

	public void imprimirManejoNumeros2() {
		burbuja(numeros);
		// ordena Burbuja
		System.out.println("Ordenados Burbuja: ");
		// Imprime los numero ordenados con el metodo Burbuja
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("mumero:" + numeros[i]);

		}

		double promedio = 0;

		for (int i = 0; i < numeros.length; i++) {
			promedio = promedio + numeros[i];

		}

		promedio = promedio / (numeros.length);

		System.out.println("Numero Menor: " + numeroMenor(numeros));
		System.out.println("Numero Menor: " + numeroMayor(numeros));
		System.out.println("Promedio: " + promedio);
		
		System.out.println("");
		System.out.println("Fin, Ejercicio 2.1 - Manejo De Numeros");
		System.out.println("");

	}

	public int numeroMenor(int... numeros) {
		// Stream solo lo utilizamos en JAVA 8
		return Arrays.stream(numeros).filter(i -> i > 0).min().orElse(Integer.MAX_VALUE);

	}

	public int numeroMayor(int... numeros) {
		// Stream solo lo utilizamos en JAVA 8
		return Arrays.stream(numeros).filter(i -> i > 0).max().orElse(Integer.MIN_VALUE);

	}
	


}
