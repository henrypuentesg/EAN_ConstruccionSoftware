package ejercicio_01_02;

import java.util.Scanner;

public class Ejercicio_01_02 {
	
	
	/**
	 * Beschreiben Sie hier die Klasse area_sombreada.
	 * 
	 * @author (Ihr Name) 
	 * @version (eine Versionsnummer oder ein Datum)
	 */

	      private  double r;
	      private  double area_circulo;
	      private  double area_cuadrado;
	      private  double area_sombreada;
	    
	        
	        public double getR() {
			return r;
		}


		public void setR(double r) {
			this.r = r;
		}

		public double getArea_circulo() {
			return area_circulo;
		}


		public void setArea_circulo(double area_circulo) {
			this.area_circulo = area_circulo;
		}


		public double getArea_cuadrado() {
			return area_cuadrado;
		}


		public void setArea_cuadrado(double area_cuadrado) {
			this.area_cuadrado = area_cuadrado;
		}

		public double getArea_sombreada() {
			return area_sombreada;
		}


		public void setArea_sombreada(double area_sombreada) {
			this.area_sombreada = area_sombreada;
		}


			Scanner scan = new Scanner(System.in);
	     
	
		public void areaSombreada() {
			
	        System.out.println("Ingrese un radio para calcular el área entre el círculo con el radio r"
	        +"y el cuadrado con la doble diagonal r");
	        
	        r = scan.nextDouble();
	        area_cuadrado = 2 * Math.pow(r,2);
	        area_circulo = Math.PI * Math.pow(r,2);
	        area_sombreada = area_circulo - area_cuadrado;
	        
	        System.out.println("El área sombreada es "+area_sombreada);
		}
	    
	}
