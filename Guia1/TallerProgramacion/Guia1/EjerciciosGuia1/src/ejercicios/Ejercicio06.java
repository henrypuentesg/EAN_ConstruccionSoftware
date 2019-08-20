package ejercicios;

public class Ejercicio06 {

	double s;
	double n;
	
	public double getS() {
		return s;
	}
	
	public void setS(double s) {
		this.s = s;
	}
	
	public double getn() {
		return n;
	}
	
	public void setn(double n) {
		this.n = n;
	}
	
	public Ejercicio06(double s, double n) {
		super();
		this.s = s;
		this.n = n;
	}
	
	
	public void AreaPoligonoRegular() {
		double valorAreaPoligonoRegular;
		
		valorAreaPoligonoRegular = (getn()*Math.pow(getS(), 2))/(4*Math.tan(Math.PI/getn())); 
		
		System.out.println("El Area de un Poligono Regular es: " + valorAreaPoligonoRegular);
	}
	
	
}
