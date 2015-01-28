
public class PMTester {
	public static void main(String[] args) {
		PepsiMachine pm1 = new PepsiMachine();
		pm1.dispense(50.5);
		System.out.println("PM1 = " + pm1.remainingPepsi());
		
		PepsiMachine pm2 = new PepsiMachine(150);
		pm2.dispense(50.5);
		
		System.out.println("PM2 = " + pm2.remainingPepsi());
	}
	
		
}
