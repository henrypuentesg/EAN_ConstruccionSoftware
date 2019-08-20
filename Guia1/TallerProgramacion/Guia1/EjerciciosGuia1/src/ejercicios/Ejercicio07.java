package ejercicios;

public class Ejercicio07 {

	static final double DISTANCIA_BOGOTA_SASAIMA = 80.2;
	static final double KILOS_VIAJE = 100;
	static final double GALONES_KILOMETRO= 0.2;
	static final double PRECIO_GALONES_GASOLINA= 10000;
	
	double kilosTransportar;

	public double getKilosTransportar() {
		return kilosTransportar;
	}

	public void setKilosTransportar(double kilosTransportar) {
		this.kilosTransportar = kilosTransportar;
	}

	public static double getDistanciaBogotaSasaima() {
		return DISTANCIA_BOGOTA_SASAIMA;
	}

	public static double getKilosViaje() {
		return KILOS_VIAJE;
	}

	public static double getGalonesKilometro() {
		return GALONES_KILOMETRO;
	}

	public static double getPrecioGalonesGasolina() {
		return PRECIO_GALONES_GASOLINA;
	}

	public Ejercicio07(double kilosTransportar) {
		super();
		this.kilosTransportar = kilosTransportar;
	}
	
	
	public void viajesNecesariosTransportarTotalidad() {
		double cantidadViajes;
		
		cantidadViajes= kilosTransportar/KILOS_VIAJE;
		System.out.println("Cantidad de Viajes Necesarios para transportar esa cantidad de Kilos: " + cantidadViajes );
		
	}
	
	public void CantidadDeGalonesPorViaje() {
		double cantidadGalonesViaje;
		
		cantidadGalonesViaje= DISTANCIA_BOGOTA_SASAIMA*GALONES_KILOMETRO;
		System.out.println("Cantidad de galones Por Viaje es:" + cantidadGalonesViaje);
		
	}
	
	public void ValorGasolina() {
		double ValorGasolina;
		
		ValorGasolina= GALONES_KILOMETRO*PRECIO_GALONES_GASOLINA;
		System.out.println("Cantidad de galones Por Viaje es:" + ValorGasolina);
		
	}
	
	
	
	
	
	
	
	
}
