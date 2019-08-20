package main;

import ejercicios.Ejercicio01;
import ejercicios.Ejercicio02;
import ejercicios.Ejercicio03;
import ejercicios.Ejercicio04;
import ejercicios.Ejercicio06;
import ejercicios.Ejercicio07;
import ejercicios.Ejercicio08;
import ejercicios.Ejercicio09;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ejericicio 1
		System.out.println("Ejercicio 1");
		Ejercicio01 ejercicio1 = new Ejercicio01(5,2);
		ejercicio1.suma();
		ejercicio1.resta();
		ejercicio1.producto();
		ejercicio1.division();
		ejercicio1.residuo();;
		ejercicio1.logaritmo();
		ejercicio1.potencia();
		
		
		//Ejericicio 2
		System.out.println("");
		System.out.println("Ejercicio 2");
		System.out.println("");
		Ejercicio02 ejercicio02 = new Ejercicio02(2);
		ejercicio02.KilometrosPorGalon();
		
		//Ejericicio 3
		System.out.println("");
		System.out.println("Ejercicio 3");
		Ejercicio03 ejercicio03 = new Ejercicio03(74, 36, 75, 6);
		ejercicio03.distanciaPuntosTierra();
		
		
		//Ejericicio 4
		System.out.println("");
		System.out.println("Ejercicio 4");
		Ejercicio04 ejercicio04 = new Ejercicio04(2);
		ejercicio04.areaCirculo();
		
		
		//Ejericicio 5
		System.out.println("");
		System.out.println("Ejercicio 5");
		//Ejercicio4 ejercicio5 = new Ejercicio5(2);
		ejercicio04.areaCirculo();

		
		//Ejericicio 6
		System.out.println("");
		System.out.println("Ejercicio 6");
		Ejercicio06 ejercicio06 = new Ejercicio06(2,6);
		ejercicio06.AreaPoligonoRegular();
		
		
		//Ejericicio 7
		System.out.println("");
		System.out.println("Ejercicio 7");
		Ejercicio07 ejercicio07 = new Ejercicio07(1000);
		ejercicio07.viajesNecesariosTransportarTotalidad();
		ejercicio07.CantidadDeGalonesPorViaje();
		ejercicio07.ValorGasolina();
		
		
		//Ejericicio 8
		System.out.println("");
		System.out.println("Ejercicio 8");
		Ejercicio08 ejercicio08 = new Ejercicio08(200);
		ejercicio08.calculoViaje();

		//Ejericicio 9
		System.out.println("");
		System.out.println("Ejercicio 9");
		Ejercicio09 ejercicio09 = new Ejercicio09(1, 1, 1);
		ejercicio09.cantidadBuses();
				
		
		
		
	}

}
