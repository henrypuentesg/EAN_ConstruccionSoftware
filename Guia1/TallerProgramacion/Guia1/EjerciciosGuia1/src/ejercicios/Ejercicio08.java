package ejercicios;

import java.text.NumberFormat;

public class Ejercicio08 {

	public Integer cantidadPersonas;
	public static final double VALOR_PASAJE = 10000;
	public static final int CANTIDAD_PERSONAS_COLECTIVO = 50;
	NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();

	public Integer getCantidadPersonas() {
		return cantidadPersonas;
	}

	public void setCantidadPersonas(Integer cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}

	public static double getValorPasaje() {
		return VALOR_PASAJE;
	}

	public static double getCantidadPersonasColectivo() {
		return CANTIDAD_PERSONAS_COLECTIVO;
	}

	public Ejercicio08(Integer cantidadPersonas) {
		super();
		this.cantidadPersonas = cantidadPersonas;
	}

	public void calculoViaje() {

		Double cantidadViajes = Math.ceil(getCantidadPersonas() / CANTIDAD_PERSONAS_COLECTIVO);
		Integer valorTotalTuristas = (int) (getCantidadPersonas() * VALOR_PASAJE);
		Integer valorPagarEmpresa = (int) (cantidadViajes * 2000);
		
		System.out.println("cantidad Personas: " + getCantidadPersonasColectivo());
		System.out.println("cantidad de Viajes a realizar: " + cantidadViajes);
		System.out.println("valor Total Pagar Turistas: " + formatoImporte.format(valorTotalTuristas));
		System.out.println("valor A Pagar A Empresa: "+ formatoImporte.format(valorPagarEmpresa));
		

	}

}
