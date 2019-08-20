package ejercicio_02_03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio_02_03 {

	int n, p;
	int a[];
	int b[];

	Integer numero;
	Integer numero2;

	Set numeros = new HashSet();

	int i = 0;

	public void manejoNumeros() {

		System.out.println("Inicio, Ejercicio 2.3 - Elementos No comunes");
		System.out.println("");

		System.out.println("Ingrese la dimension del arreglo a: ");
		Scanner scanner1 = new Scanner(System.in);
		n = scanner1.nextInt();
		a = new int[n];

		System.out.println("Ingrese la dimension del arreglo b: ");
		Scanner scanner2 = new Scanner(System.in);
		p = scanner2.nextInt();
		b = new int[p];

		System.out.println("Ingrese los numeros del vector A ");
		Scanner scanner3 = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			a[i] = scanner3.nextInt();
			numeros.add(a[i]);
		}

		System.out.println("Ingrese los numeros del vector B ");
		Scanner scanner4 = new Scanner(System.in);

		for (int i = 0; i < b.length; i++) {
			b[i] = scanner4.nextInt();
			numeros.add(b[i]);
		}

	}

	public void imprimirManejoNumeros() {

		System.out.println("Elementos no comunes: ");
		for (Object Numeros : numeros) {
			System.out.println(Numeros);
		}

	}

}
