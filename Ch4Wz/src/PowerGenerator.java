
public class PowerGenerator {
	private double factor;
	private int expo;
	private double result = 1;
	
	public PowerGenerator(double aFactor){
		factor = aFactor;
		expo = 0;
	}
	public double next() {
	double returnValue = Math.pow(factor, expo);  
	expo = expo + 1;		  
	return returnValue;	
			
	}
}
	