import java.util.Scanner;


public class PrimeNumber {
	public static void main(String[] args) {
		PrimeGen np = new PrimeGen();
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the first number");
		int i = reader.nextInt();
		int prime = np.nextPrime();
		while(  prime < i ){
			System.out.println(prime);
			prime = np.nextPrime();
		}
		
	}

}
