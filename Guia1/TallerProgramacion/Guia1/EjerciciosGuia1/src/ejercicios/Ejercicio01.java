package ejercicios;

public class Ejercicio01 {

	int a;
	int b;
	
	
	public Ejercicio01(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void suma() {
		
		int totalSuma;
		
		totalSuma = this.getA()+this.getB();
		System.out.println("La suma es igual a: " + totalSuma );
		
	}
	
	public void resta() {
		
		int totalResta;
		
		totalResta = this.getA()-this.getB();
		System.out.println("La Resta es igual a: " + totalResta );
		
	}
	
	public void producto() {
		
		int totalProducto;
		
		totalProducto = this.getA()*this.getB();
		System.out.println("El Producto de los dos numeros es igual a: " + totalProducto );
		
	}
	
	public void division() {
		
		int totalDivision;
		
		totalDivision = this.getA()/this.getB();
		System.out.println("La division de los dos numeros es igual a: " + totalDivision );
		
	}
	
	public void residuo() {
		
		int totalResiduo;
		
		totalResiduo = this.getA()%this.getB();
		System.out.println("El Residuo de los dos numeros es igual a: " + totalResiduo );
		
	}
	
	public void logaritmo() {
		
		double totalLogaritmo;
		
		totalLogaritmo =  Math.log10(this.getA());
		System.out.println("El Logaritmo de los dos numeros es igual a: " + totalLogaritmo );
		
		
	}
	
	public void potencia() {
		
		double totalPotencia;
		
		totalPotencia =  Math.pow(this.getA(),this.getB());
		System.out.println("El Logaritmo de los dos numeros es igual a: " + totalPotencia );
		
		
	}
	
	
	
	
	
	
}
