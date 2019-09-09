package ejercicio00;

import java.text.DecimalFormat;

public class Pendulo {

	private double longitud ;
	private double aceleracionGravitacional ;
	
	
	public Pendulo() {
		}
	
	public Pendulo(double longitud, double aceleracionGravitacional) {
		super();
		this.longitud = longitud;
		this.aceleracionGravitacional = aceleracionGravitacional;
	}
		
	
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public double getAceleracionGravitacional() {
		return aceleracionGravitacional;
	}
	public void setAceleracionGravitacional(double aceleracionGravitacional) {
		this.aceleracionGravitacional = aceleracionGravitacional;
	}
	
	
	
	public void periodoOscilacion() {

		Double periodoOscilacion;
		DecimalFormat formato1 = new DecimalFormat("#.00");
		periodoOscilacion = 2 * Math.PI * Math.sqrt(getLongitud() / getAceleracionGravitacional());

		System.out.println("Pendulo con logitud: " + getLongitud() + "m ");
		System.out.println("Aceleracion Gravitacional: " + getAceleracionGravitacional() + " m/s^2");
		System.out.println( "El Periodo de Oscilacion es:  " + formato1.format(periodoOscilacion) + " s.");

	}
	
	
	
	
	
}
