
public class QuadraticEquation {
	private double a;
	private double b;
	private double c;
	private double dsc;
	public QuadraticEquation(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
		dsc = b * b - 4 * a * c;
		
	}
	
	
	public boolean hasSolutions(){
		return (dsc >= 0);
		
	}
	
	public double getSolution1(){
		return ((-b + Math.sqrt(dsc)) / 2 * a);
	}
	public double getSolution2(){
		return ((-b - Math.sqrt(dsc)) / 2 * a);
	}
		
}
