package ejercicios;

public class Ejercicio02 {
	
	double mpg;
	double kpg;
	
	
	static final double UNIDAD_MPG= 1.6093; 
	
	
	
	public Ejercicio02(double mpg) {
		super();
		this.mpg = mpg;
	}


	public double getMpg() {
		return mpg;
	}



	public void setMpg(double mpg) {
		this.mpg = mpg;
	}



	public double getKpg() {
		return kpg;
	}



	public void setKpg(double kpg) {
		this.kpg = kpg;
	}



	public void KilometrosPorGalon() {
		
		double totalkpg;
		
		totalkpg = this.mpg * UNIDAD_MPG;
		System.out.println("El total de Kilometros por galon es: " + totalkpg);
		
		
	}
	

}
