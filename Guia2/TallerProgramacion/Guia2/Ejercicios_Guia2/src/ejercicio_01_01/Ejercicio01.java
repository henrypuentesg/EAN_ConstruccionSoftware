package ejercicio_01_01;

public class Ejercicio01 {
	
	double pulgadas;
	double pies;
	double centimetros;
	double leguas;
	double yarda;
	double valor;
	String UnidadMedida;
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getPulgadas() {
		return pulgadas;
	}
	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}
	public double getPies() {
		return pies;
	}
	public void setPies(double pies) {
		this.pies = pies;
	}
	public double getCentimetros() {
		return centimetros;
	}
	public void setCentimetros(double centimetros) {
		this.centimetros = centimetros;
	}
	public double getLeguas() {
		return leguas;
	}
	public void setLeguas(double leguas) {
		this.leguas = leguas;
	}
	public double getYarda() {
		return yarda;
	}
	public void setYarda(double yarda) {
		this.yarda = yarda;
	}
		
	
	public String getUnidadMedida() {
		return UnidadMedida;
	}
	public void setUnidadMedida(String unidadMedida) {
		UnidadMedida = unidadMedida;
	}
	public Ejercicio01() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Ejercicio01(double valor, String unidadMedida) {
		super();
		this.valor = valor;
		UnidadMedida = unidadMedida;
	}
	
	public void conversorPulgadas() {
		
		String unidadMedia = getUnidadMedida() ;
		Double valorConversion;
		
		switch (unidadMedia) {
		case "P":
			valorConversion= getValor()/0.0833;
			System.out.println("valor en Pulgadas: "+ valorConversion);
			break;

		case "C":
			valorConversion= getValor()/2.54;
			System.out.println("valor en Pulgadas: "+ valorConversion);
			break;
			
		case "L":
			valorConversion= getValor()*190080.02;
			System.out.println("valor en Pulgadas: "+ valorConversion);
			break;

		case "Y":
			valorConversion= getValor()*36;
			System.out.println("valor en Pulgadas: "+ valorConversion);
			break;
			
		default:
			System.out.println("Debe Ingresar una unidad de medida, definida: \n [P] Pies. \n [C] Centimetros. \n [L] Leguas. \n [Y] Yardas ");
			break;
		}
		
		
		
		
		
	}
	
	
	

}
