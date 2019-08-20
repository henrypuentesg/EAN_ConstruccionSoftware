package ejercicios;

public class Ejercicio03 {
	
	double longitud1;
	double latitud1;
	double longitud2;
	double latitud2;
	static final double  RADIO_TIERRA=  6371.07;
	
	

	
	public Ejercicio03(double longitud1, double latitud1, double longitud2, double latitud2) {
		super();
		this.longitud1 = longitud1;
		this.latitud1 = latitud1;
		this.longitud2 = longitud2;
		this.latitud2 = latitud2;
	}



	public double getLongitud1() {
		return longitud1;
	}

	public void setLongitud1(double longitud1) {
		this.longitud1 = longitud1;
	}

	public double getLatitud1() {
		return latitud1;
	}

	public void setLatitud1(double latitud1) {
		this.latitud1 = latitud1;
	}

	public double getLongitud2() {
		return longitud2;
	}

	public void setLongitud2(double longitud2) {
		this.longitud2 = longitud2;
	}

	public double getLatitud2() {
		return latitud2;
	}

	public void setLatitud2(double latitud2) {
		this.latitud2 = latitud2;
	}

	public void distanciaPuntosTierra() {
		
		double ValordistanciaPuntosTierra;
		
		ValordistanciaPuntosTierra= RADIO_TIERRA * Math.acos(Math.sin(latitud1)) * Math.sin(latitud2) + Math.cos(latitud1)* Math.cos(latitud2)*longitud1-longitud2;
		
		System.out.println("La distancia entre los dos puntos es:  " + ValordistanciaPuntosTierra);
	}
	
	
	
	

}
