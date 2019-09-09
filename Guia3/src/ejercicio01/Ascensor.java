package ejercicio01;

public class Ascensor {

	private int cantidadPisosEdificio;
	private int cantidadSotanosEdificio;
	private int pisoActual;
	private int cantidadPisosAtender;

	public int getCantidadPisosEdificio() {
		return cantidadPisosEdificio;
	}

	public void setCantidadPisosEdificio(int cantidadPisosEdificio) {
		this.cantidadPisosEdificio = cantidadPisosEdificio;
	}

	public int getCantidadSotanosEdificio() {
		return cantidadSotanosEdificio;
	}

	public void setCantidadSotanosEdificio(int cantidadSotanosEdificio) {
		this.cantidadSotanosEdificio = cantidadSotanosEdificio;
	}

	public int getPisoActual() {
		return pisoActual;
	}

	public void setPisoActual(int pisoActual) {
		this.pisoActual = pisoActual;
	}

	public int getCantidadPisosAtender() {
		return cantidadPisosAtender;
	}

	public void setCantidadPisosAtender(int cantidadPisosAtender) {
		this.cantidadPisosAtender = cantidadPisosAtender;
	}

	public Ascensor(int cantidadPisosEdificio, int cantidadSotanosEdificio) {
		super();
		this.cantidadPisosEdificio = cantidadPisosEdificio;
		this.cantidadSotanosEdificio = cantidadSotanosEdificio;
	}

	public void pisoSiguente(int pisoActual) {

		if (pisoActual < getCantidadPisosEdificio() && pisoActual > getCantidadSotanosEdificio() * -1) {
			pisoActual = pisoActual + 1;
			System.out.println("El piso Siguiente es: " + pisoActual);
		} else if (pisoActual > getCantidadPisosEdificio()) {
			System.out.println("No se puede ir mas arriba del piso: " + getCantidadPisosEdificio());
		} else if (pisoActual < getCantidadSotanosEdificio()) {
			System.out.println("No se puede ir mas Abajo del Sotano: " + getCantidadSotanosEdificio() * -1);

		}

	}

	public void pisoAnterior(int pisoActual) {

		if (pisoActual < getCantidadPisosEdificio() && pisoActual > getCantidadSotanosEdificio() * -1) {
			
			if ((pisoActual - 1) ==0) {
				pisoActual = -1;
			}else {
				pisoActual = pisoActual - 1;
			}
			;
			System.out.println("El piso Anterior es: " + pisoActual);
		} else if (pisoActual > getCantidadPisosEdificio()) {
			System.out.println("No se puede ir mas arriba del piso: " + getCantidadPisosEdificio());
		} else if (pisoActual < getCantidadSotanosEdificio()) {
			System.out.println("No se puede ir mas Abajo del piso: " + getCantidadSotanosEdificio() * -1);

		}

	}

	public void cantidadPisosServicio() {

		int CantidadPisosServicio = 0;

		CantidadPisosServicio = getCantidadPisosEdificio() + getCantidadSotanosEdificio();
		System.out.println("El edificio, tiene con Servicio Actualmete: \n" + "Sotanos: " + getCantidadSotanosEdificio()
				+ "\n" + "Pisos: " + getCantidadPisosEdificio() + "\n" + "para un total de: " + CantidadPisosServicio
				+ " Pisos con Servicio.");

	}

}
