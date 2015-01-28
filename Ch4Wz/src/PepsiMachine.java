
public class PepsiMachine {
	private double pepsi;
	
	public PepsiMachine(){
		pepsi = 100;
	}
	
	public PepsiMachine(double gaLLons){
		pepsi = gaLLons;
	}
	public void dispense(double amount ){
		pepsi = pepsi - amount;
	}	
	public double remainingPepsi() {   
		return pepsi;
	
	}
}
